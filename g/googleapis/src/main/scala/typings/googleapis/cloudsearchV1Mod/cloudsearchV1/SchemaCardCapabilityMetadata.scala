package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCardCapabilityMetadata extends StObject {
  
  /**
    * NEXT TAG : 2
    */
  var requiredCapabilities: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCardCapabilityMetadata {
  
  inline def apply(): SchemaCardCapabilityMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCardCapabilityMetadata]
  }
  
  extension [Self <: SchemaCardCapabilityMetadata](x: Self) {
    
    inline def setRequiredCapabilities(value: js.Array[String]): Self = StObject.set(x, "requiredCapabilities", value.asInstanceOf[js.Any])
    
    inline def setRequiredCapabilitiesNull: Self = StObject.set(x, "requiredCapabilities", null)
    
    inline def setRequiredCapabilitiesUndefined: Self = StObject.set(x, "requiredCapabilities", js.undefined)
    
    inline def setRequiredCapabilitiesVarargs(value: String*): Self = StObject.set(x, "requiredCapabilities", js.Array(value*))
  }
}
