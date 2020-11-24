package typings.devtoolsProtocol.mod.Protocol.Emulation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentMetadata extends js.Object {
  
  var architecture: String = js.native
  
  var brands: js.Array[UserAgentBrandVersion] = js.native
  
  var fullVersion: String = js.native
  
  var mobile: Boolean = js.native
  
  var model: String = js.native
  
  var platform: String = js.native
  
  var platformVersion: String = js.native
}
object UserAgentMetadata {
  
  @scala.inline
  def apply(
    architecture: String,
    brands: js.Array[UserAgentBrandVersion],
    fullVersion: String,
    mobile: Boolean,
    model: String,
    platform: String,
    platformVersion: String
  ): UserAgentMetadata = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], brands = brands.asInstanceOf[js.Any], fullVersion = fullVersion.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentMetadata]
  }
  
  @scala.inline
  implicit class UserAgentMetadataOps[Self <: UserAgentMetadata] (val x: Self) extends AnyVal {
    
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
    def setArchitecture(value: String): Self = this.set("architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandsVarargs(value: UserAgentBrandVersion*): Self = this.set("brands", js.Array(value :_*))
    
    @scala.inline
    def setBrands(value: js.Array[UserAgentBrandVersion]): Self = this.set("brands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullVersion(value: String): Self = this.set("fullVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Boolean): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
  }
}
