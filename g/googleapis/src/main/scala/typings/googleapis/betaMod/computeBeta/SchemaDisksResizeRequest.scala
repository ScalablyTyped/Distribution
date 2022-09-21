package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisksResizeRequest extends StObject {
  
  /**
    * The new size of the persistent disk, which is specified in GB.
    */
  var sizeGb: js.UndefOr[String | Null] = js.undefined
}
object SchemaDisksResizeRequest {
  
  inline def apply(): SchemaDisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisksResizeRequest]
  }
  
  extension [Self <: SchemaDisksResizeRequest](x: Self) {
    
    inline def setSizeGb(value: String): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbNull: Self = StObject.set(x, "sizeGb", null)
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
  }
}
