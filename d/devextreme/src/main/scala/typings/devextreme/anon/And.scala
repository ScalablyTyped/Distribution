package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait And extends js.Object {
  
  var and: js.UndefOr[String] = js.native
  
  var notAnd: js.UndefOr[String] = js.native
  
  var notOr: js.UndefOr[String] = js.native
  
  var or: js.UndefOr[String] = js.native
}
object And {
  
  @scala.inline
  def apply(): And = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And]
  }
  
  @scala.inline
  implicit class AndOps[Self <: And] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: String): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnd: Self = this.set("and", js.undefined)
    
    @scala.inline
    def setNotAnd(value: String): Self = this.set("notAnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAnd: Self = this.set("notAnd", js.undefined)
    
    @scala.inline
    def setNotOr(value: String): Self = this.set("notOr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotOr: Self = this.set("notOr", js.undefined)
    
    @scala.inline
    def setOr(value: String): Self = this.set("or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOr: Self = this.set("or", js.undefined)
  }
}
