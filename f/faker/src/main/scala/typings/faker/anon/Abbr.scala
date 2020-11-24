package typings.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abbr extends js.Object {
  
  var abbr: js.UndefOr[Boolean] = js.native
  
  var context: js.UndefOr[Boolean] = js.native
}
object Abbr {
  
  @scala.inline
  def apply(): Abbr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abbr]
  }
  
  @scala.inline
  implicit class AbbrOps[Self <: Abbr] (val x: Self) extends AnyVal {
    
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
    def setAbbr(value: Boolean): Self = this.set("abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbbr: Self = this.set("abbr", js.undefined)
    
    @scala.inline
    def setContext(value: Boolean): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
}
