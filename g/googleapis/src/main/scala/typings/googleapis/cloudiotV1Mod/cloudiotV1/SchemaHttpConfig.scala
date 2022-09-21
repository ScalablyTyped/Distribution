package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpConfig extends StObject {
  
  /**
    * If enabled, allows devices to use DeviceService via the HTTP protocol. Otherwise, any requests to DeviceService will fail for this registry.
    */
  var httpEnabledState: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpConfig {
  
  inline def apply(): SchemaHttpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpConfig]
  }
  
  extension [Self <: SchemaHttpConfig](x: Self) {
    
    inline def setHttpEnabledState(value: String): Self = StObject.set(x, "httpEnabledState", value.asInstanceOf[js.Any])
    
    inline def setHttpEnabledStateNull: Self = StObject.set(x, "httpEnabledState", null)
    
    inline def setHttpEnabledStateUndefined: Self = StObject.set(x, "httpEnabledState", js.undefined)
  }
}
