package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Target scaling by request utilization. Only applicable in the App Engine
  * flexible environment.
  */
@js.native
trait SchemaRequestUtilization extends StObject {
  
  /**
    * Target number of concurrent requests.
    */
  var targetConcurrentRequests: js.UndefOr[Double] = js.native
  
  /**
    * Target requests per second.
    */
  var targetRequestCountPerSecond: js.UndefOr[Double] = js.native
}
object SchemaRequestUtilization {
  
  @scala.inline
  def apply(): SchemaRequestUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestUtilization]
  }
  
  @scala.inline
  implicit class SchemaRequestUtilizationMutableBuilder[Self <: SchemaRequestUtilization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetConcurrentRequests(value: Double): Self = StObject.set(x, "targetConcurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetConcurrentRequestsUndefined: Self = StObject.set(x, "targetConcurrentRequests", js.undefined)
    
    @scala.inline
    def setTargetRequestCountPerSecond(value: Double): Self = StObject.set(x, "targetRequestCountPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRequestCountPerSecondUndefined: Self = StObject.set(x, "targetRequestCountPerSecond", js.undefined)
  }
}
