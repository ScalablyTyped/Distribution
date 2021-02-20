package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentBrandVersion extends StObject {
  
  var brand: String = js.native
  
  var version: String = js.native
}
object UserAgentBrandVersion {
  
  @scala.inline
  def apply(brand: String, version: String): UserAgentBrandVersion = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentBrandVersion]
  }
  
  @scala.inline
  implicit class UserAgentBrandVersionMutableBuilder[Self <: UserAgentBrandVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
