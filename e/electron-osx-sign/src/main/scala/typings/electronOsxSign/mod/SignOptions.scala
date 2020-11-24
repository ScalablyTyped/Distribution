package typings.electronOsxSign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignOptions extends BaseSignOptions {
  
  var binaries: js.UndefOr[js.Array[String]] = js.native
  
  var entitlements: js.UndefOr[String] = js.native
  
  var `entitlements-inherit`: js.UndefOr[String] = js.native
  
  var `entitlements-loginhelper`: js.UndefOr[String] = js.native
  
  var `gatekeeper-assess`: js.UndefOr[Boolean] = js.native
  
  var hardenedRuntime: js.UndefOr[Boolean] = js.native
  
  var `identity-validation`: js.UndefOr[Boolean] = js.native
  
  var ignore: js.UndefOr[String] = js.native
  
  var `pre-auto-entitlements`: js.UndefOr[Boolean] = js.native
  
  var `pre-embed-provisioning-profile`: js.UndefOr[Boolean] = js.native
  
  var `provisioning-profile`: js.UndefOr[String] = js.native
  
  var requirements: js.UndefOr[String] = js.native
  
  var `signature-size`: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object SignOptions {
  
  @scala.inline
  def apply(app: String): SignOptions = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptions]
  }
  
  @scala.inline
  implicit class SignOptionsOps[Self <: SignOptions] (val x: Self) extends AnyVal {
    
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
    def setBinariesVarargs(value: String*): Self = this.set("binaries", js.Array(value :_*))
    
    @scala.inline
    def setBinaries(value: js.Array[String]): Self = this.set("binaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaries: Self = this.set("binaries", js.undefined)
    
    @scala.inline
    def setEntitlements(value: String): Self = this.set("entitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntitlements: Self = this.set("entitlements", js.undefined)
    
    @scala.inline
    def `setEntitlements-inherit`(value: String): Self = this.set("entitlements-inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteEntitlements-inherit`: Self = this.set("entitlements-inherit", js.undefined)
    
    @scala.inline
    def `setEntitlements-loginhelper`(value: String): Self = this.set("entitlements-loginhelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteEntitlements-loginhelper`: Self = this.set("entitlements-loginhelper", js.undefined)
    
    @scala.inline
    def `setGatekeeper-assess`(value: Boolean): Self = this.set("gatekeeper-assess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGatekeeper-assess`: Self = this.set("gatekeeper-assess", js.undefined)
    
    @scala.inline
    def setHardenedRuntime(value: Boolean): Self = this.set("hardenedRuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardenedRuntime: Self = this.set("hardenedRuntime", js.undefined)
    
    @scala.inline
    def `setIdentity-validation`(value: Boolean): Self = this.set("identity-validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIdentity-validation`: Self = this.set("identity-validation", js.undefined)
    
    @scala.inline
    def setIgnore(value: String): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def `setPre-auto-entitlements`(value: Boolean): Self = this.set("pre-auto-entitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePre-auto-entitlements`: Self = this.set("pre-auto-entitlements", js.undefined)
    
    @scala.inline
    def `setPre-embed-provisioning-profile`(value: Boolean): Self = this.set("pre-embed-provisioning-profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePre-embed-provisioning-profile`: Self = this.set("pre-embed-provisioning-profile", js.undefined)
    
    @scala.inline
    def `setProvisioning-profile`(value: String): Self = this.set("provisioning-profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteProvisioning-profile`: Self = this.set("provisioning-profile", js.undefined)
    
    @scala.inline
    def setRequirements(value: String): Self = this.set("requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequirements: Self = this.set("requirements", js.undefined)
    
    @scala.inline
    def `setSignature-size`(value: Double): Self = this.set("signature-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSignature-size`: Self = this.set("signature-size", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
