package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogResponse extends js.Object {
  
  var error_code: js.UndefOr[Double] = js.native
  
  var error_message: js.UndefOr[String] = js.native
}
object DialogResponse {
  
  @scala.inline
  def apply(): DialogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogResponse]
  }
  
  @scala.inline
  implicit class DialogResponseOps[Self <: DialogResponse] (val x: Self) extends AnyVal {
    
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
    def setError_code(value: Double): Self = this.set("error_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError_code: Self = this.set("error_code", js.undefined)
    
    @scala.inline
    def setError_message(value: String): Self = this.set("error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError_message: Self = this.set("error_message", js.undefined)
  }
}
