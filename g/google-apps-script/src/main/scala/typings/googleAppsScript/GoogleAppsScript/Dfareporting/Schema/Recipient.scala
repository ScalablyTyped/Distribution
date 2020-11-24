package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recipient extends js.Object {
  
  var deliveryType: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object Recipient {
  
  @scala.inline
  def apply(): Recipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recipient]
  }
  
  @scala.inline
  implicit class RecipientOps[Self <: Recipient] (val x: Self) extends AnyVal {
    
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
    def setDeliveryType(value: String): Self = this.set("deliveryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryType: Self = this.set("deliveryType", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
