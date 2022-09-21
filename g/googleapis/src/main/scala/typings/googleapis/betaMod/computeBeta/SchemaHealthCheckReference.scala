package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHealthCheckReference extends StObject {
  
  var healthCheck: js.UndefOr[String | Null] = js.undefined
}
object SchemaHealthCheckReference {
  
  inline def apply(): SchemaHealthCheckReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheckReference]
  }
  
  extension [Self <: SchemaHealthCheckReference](x: Self) {
    
    inline def setHealthCheck(value: String): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckNull: Self = StObject.set(x, "healthCheck", null)
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
  }
}
