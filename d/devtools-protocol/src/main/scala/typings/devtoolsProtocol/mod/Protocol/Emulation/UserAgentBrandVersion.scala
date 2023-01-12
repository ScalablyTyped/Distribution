package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentBrandVersion extends StObject {
  
  var brand: String
  
  var version: String
}
object UserAgentBrandVersion {
  
  inline def apply(brand: String, version: String): UserAgentBrandVersion = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentBrandVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserAgentBrandVersion] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
