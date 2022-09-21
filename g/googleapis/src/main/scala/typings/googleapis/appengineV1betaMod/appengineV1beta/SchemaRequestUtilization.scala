package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequestUtilization extends StObject {
  
  /**
    * Target number of concurrent requests.
    */
  var targetConcurrentRequests: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Target requests per second.
    */
  var targetRequestCountPerSecond: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRequestUtilization {
  
  inline def apply(): SchemaRequestUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestUtilization]
  }
  
  extension [Self <: SchemaRequestUtilization](x: Self) {
    
    inline def setTargetConcurrentRequests(value: Double): Self = StObject.set(x, "targetConcurrentRequests", value.asInstanceOf[js.Any])
    
    inline def setTargetConcurrentRequestsNull: Self = StObject.set(x, "targetConcurrentRequests", null)
    
    inline def setTargetConcurrentRequestsUndefined: Self = StObject.set(x, "targetConcurrentRequests", js.undefined)
    
    inline def setTargetRequestCountPerSecond(value: Double): Self = StObject.set(x, "targetRequestCountPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetRequestCountPerSecondNull: Self = StObject.set(x, "targetRequestCountPerSecond", null)
    
    inline def setTargetRequestCountPerSecondUndefined: Self = StObject.set(x, "targetRequestCountPerSecond", js.undefined)
  }
}
