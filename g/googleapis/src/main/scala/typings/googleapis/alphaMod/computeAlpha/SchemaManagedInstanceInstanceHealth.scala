package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedInstanceInstanceHealth extends StObject {
  
  /**
    * [Output Only] The current detailed instance health state.
    */
  var detailedHealthState: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The URL for the health check that verifies whether the
    * instance is healthy.
    */
  var healthCheck: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The current instance health state.
    */
  var healthState: js.UndefOr[String] = js.undefined
}
object SchemaManagedInstanceInstanceHealth {
  
  inline def apply(): SchemaManagedInstanceInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceInstanceHealth]
  }
  
  extension [Self <: SchemaManagedInstanceInstanceHealth](x: Self) {
    
    inline def setDetailedHealthState(value: String): Self = StObject.set(x, "detailedHealthState", value.asInstanceOf[js.Any])
    
    inline def setDetailedHealthStateUndefined: Self = StObject.set(x, "detailedHealthState", js.undefined)
    
    inline def setHealthCheck(value: String): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    inline def setHealthState(value: String): Self = StObject.set(x, "healthState", value.asInstanceOf[js.Any])
    
    inline def setHealthStateUndefined: Self = StObject.set(x, "healthState", js.undefined)
  }
}
