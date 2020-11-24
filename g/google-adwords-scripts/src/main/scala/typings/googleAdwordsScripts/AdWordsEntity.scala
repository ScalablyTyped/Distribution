package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Generics
@js.native
trait AdWordsEntity extends js.Object {
  
  var getEntityType: js.UndefOr[js.Function0[String]] = js.native
}
object AdWordsEntity {
  
  @scala.inline
  def apply(): AdWordsEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdWordsEntity]
  }
  
  @scala.inline
  implicit class AdWordsEntityOps[Self <: AdWordsEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetEntityType(value: () => String): Self = this.set("getEntityType", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEntityType: Self = this.set("getEntityType", js.undefined)
  }
}
