package typings.expressValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckFalsy extends js.Object {
  
  var checkFalsy: js.UndefOr[Boolean] = js.native
  
  var checkNull: js.UndefOr[Boolean] = js.native
}
object CheckFalsy {
  
  @scala.inline
  def apply(): CheckFalsy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckFalsy]
  }
  
  @scala.inline
  implicit class CheckFalsyOps[Self <: CheckFalsy] (val x: Self) extends AnyVal {
    
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
    def setCheckFalsy(value: Boolean): Self = this.set("checkFalsy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckFalsy: Self = this.set("checkFalsy", js.undefined)
    
    @scala.inline
    def setCheckNull(value: Boolean): Self = this.set("checkNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckNull: Self = this.set("checkNull", js.undefined)
  }
}
