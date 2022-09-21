package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceRam extends StObject {
  
  /**
    * Maximum RAM in bytes (bound excluded).
    */
  var maxBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum RAM in bytes (bound included).
    */
  var minBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceRam {
  
  inline def apply(): SchemaDeviceRam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceRam]
  }
  
  extension [Self <: SchemaDeviceRam](x: Self) {
    
    inline def setMaxBytes(value: String): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxBytesNull: Self = StObject.set(x, "maxBytes", null)
    
    inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
    
    inline def setMinBytes(value: String): Self = StObject.set(x, "minBytes", value.asInstanceOf[js.Any])
    
    inline def setMinBytesNull: Self = StObject.set(x, "minBytes", null)
    
    inline def setMinBytesUndefined: Self = StObject.set(x, "minBytes", js.undefined)
  }
}
