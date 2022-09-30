package typings.devtools.anon

import typings.devtools.typesMod.ExtendedCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capabilities extends StObject {
  
  var capabilities: ExtendedCapabilities
}
object Capabilities {
  
  inline def apply(capabilities: ExtendedCapabilities): Capabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  
  extension [Self <: Capabilities](x: Self) {
    
    inline def setCapabilities(value: ExtendedCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
  }
}
