package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueuingPolicy extends StObject {
  
  /**
    * Relative deadline for waiting for capacity.
    */
  var validUntilDuration: js.UndefOr[SchemaDuration] = js.undefined
  
  /**
    * Absolute deadline for waiting for capacity in RFC3339 text format.
    */
  var validUntilTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueuingPolicy {
  
  inline def apply(): SchemaQueuingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueuingPolicy]
  }
  
  extension [Self <: SchemaQueuingPolicy](x: Self) {
    
    inline def setValidUntilDuration(value: SchemaDuration): Self = StObject.set(x, "validUntilDuration", value.asInstanceOf[js.Any])
    
    inline def setValidUntilDurationUndefined: Self = StObject.set(x, "validUntilDuration", js.undefined)
    
    inline def setValidUntilTime(value: String): Self = StObject.set(x, "validUntilTime", value.asInstanceOf[js.Any])
    
    inline def setValidUntilTimeNull: Self = StObject.set(x, "validUntilTime", null)
    
    inline def setValidUntilTimeUndefined: Self = StObject.set(x, "validUntilTime", js.undefined)
  }
}
