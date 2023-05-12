package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentMetadata extends StObject {
  
  var architecture: String
  
  var bitness: js.UndefOr[String] = js.undefined
  
  /**
    * Brands appearing in Sec-CH-UA.
    */
  var brands: js.UndefOr[js.Array[UserAgentBrandVersion]] = js.undefined
  
  var fullVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Brands appearing in Sec-CH-UA-Full-Version-List.
    */
  var fullVersionList: js.UndefOr[js.Array[UserAgentBrandVersion]] = js.undefined
  
  var mobile: Boolean
  
  var model: String
  
  var platform: String
  
  var platformVersion: String
  
  var wow64: js.UndefOr[Boolean] = js.undefined
}
object UserAgentMetadata {
  
  inline def apply(architecture: String, mobile: Boolean, model: String, platform: String, platformVersion: String): UserAgentMetadata = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserAgentMetadata] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setBitness(value: String): Self = StObject.set(x, "bitness", value.asInstanceOf[js.Any])
    
    inline def setBitnessUndefined: Self = StObject.set(x, "bitness", js.undefined)
    
    inline def setBrands(value: js.Array[UserAgentBrandVersion]): Self = StObject.set(x, "brands", value.asInstanceOf[js.Any])
    
    inline def setBrandsUndefined: Self = StObject.set(x, "brands", js.undefined)
    
    inline def setBrandsVarargs(value: UserAgentBrandVersion*): Self = StObject.set(x, "brands", js.Array(value*))
    
    inline def setFullVersion(value: String): Self = StObject.set(x, "fullVersion", value.asInstanceOf[js.Any])
    
    inline def setFullVersionList(value: js.Array[UserAgentBrandVersion]): Self = StObject.set(x, "fullVersionList", value.asInstanceOf[js.Any])
    
    inline def setFullVersionListUndefined: Self = StObject.set(x, "fullVersionList", js.undefined)
    
    inline def setFullVersionListVarargs(value: UserAgentBrandVersion*): Self = StObject.set(x, "fullVersionList", js.Array(value*))
    
    inline def setFullVersionUndefined: Self = StObject.set(x, "fullVersion", js.undefined)
    
    inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setWow64(value: Boolean): Self = StObject.set(x, "wow64", value.asInstanceOf[js.Any])
    
    inline def setWow64Undefined: Self = StObject.set(x, "wow64", js.undefined)
  }
}
