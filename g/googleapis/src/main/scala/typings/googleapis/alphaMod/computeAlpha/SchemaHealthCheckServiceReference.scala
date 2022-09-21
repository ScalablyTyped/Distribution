package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHealthCheckServiceReference extends StObject {
  
  var healthCheckService: js.UndefOr[String | Null] = js.undefined
}
object SchemaHealthCheckServiceReference {
  
  inline def apply(): SchemaHealthCheckServiceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheckServiceReference]
  }
  
  extension [Self <: SchemaHealthCheckServiceReference](x: Self) {
    
    inline def setHealthCheckService(value: String): Self = StObject.set(x, "healthCheckService", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckServiceNull: Self = StObject.set(x, "healthCheckService", null)
    
    inline def setHealthCheckServiceUndefined: Self = StObject.set(x, "healthCheckService", js.undefined)
  }
}
