package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedInstanceInstanceHealth extends StObject {
  
  /**
    * [Output Only] The current detailed instance health state.
    */
  var detailedHealthState: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The URL for the health check that verifies whether the
    * instance is healthy.
    */
  var healthCheck: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The current instance health state.
    */
  var healthState: js.UndefOr[String] = js.native
}
object SchemaManagedInstanceInstanceHealth {
  
  @scala.inline
  def apply(): SchemaManagedInstanceInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceInstanceHealth]
  }
  
  @scala.inline
  implicit class SchemaManagedInstanceInstanceHealthMutableBuilder[Self <: SchemaManagedInstanceInstanceHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailedHealthState(value: String): Self = StObject.set(x, "detailedHealthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedHealthStateUndefined: Self = StObject.set(x, "detailedHealthState", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: String): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    @scala.inline
    def setHealthState(value: String): Self = StObject.set(x, "healthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStateUndefined: Self = StObject.set(x, "healthState", js.undefined)
  }
}
