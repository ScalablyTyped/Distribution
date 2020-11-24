package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerReturnReason extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var reasonCode: js.UndefOr[String] = js.native
}
object CustomerReturnReason {
  
  @scala.inline
  def apply(): CustomerReturnReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerReturnReason]
  }
  
  @scala.inline
  implicit class CustomerReturnReasonOps[Self <: CustomerReturnReason] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setReasonCode(value: String): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
  }
}
