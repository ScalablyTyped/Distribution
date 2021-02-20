package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentMetadata extends StObject {
  
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
  implicit class UserAgentMetadataMutableBuilder[Self <: UserAgentMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrands(value: js.Array[UserAgentBrandVersion]): Self = StObject.set(x, "brands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandsVarargs(value: UserAgentBrandVersion*): Self = StObject.set(x, "brands", js.Array(value :_*))
    
    @scala.inline
    def setFullVersion(value: String): Self = StObject.set(x, "fullVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
  }
}
