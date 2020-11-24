package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FederatedId extends js.Object {
  
  var displayName: js.UndefOr[String] = js.native
  
  var federatedId: js.UndefOr[String] = js.native
  
  var photoUrl: js.UndefOr[String] = js.native
  
  var providerId: js.UndefOr[String] = js.native
}
object FederatedId {
  
  @scala.inline
  def apply(): FederatedId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedId]
  }
  
  @scala.inline
  implicit class FederatedIdOps[Self <: FederatedId] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setFederatedId(value: String): Self = this.set("federatedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFederatedId: Self = this.set("federatedId", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderId: Self = this.set("providerId", js.undefined)
  }
}
