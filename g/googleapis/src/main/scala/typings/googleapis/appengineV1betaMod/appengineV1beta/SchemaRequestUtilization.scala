package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Target scaling by request utilization. Only applicable in the App Engine
  * flexible environment.
  */
trait SchemaRequestUtilization extends StObject {
  
  /**
    * Target number of concurrent requests.
    */
  var targetConcurrentRequests: js.UndefOr[Double] = js.undefined
  
  /**
    * Target requests per second.
    */
  var targetRequestCountPerSecond: js.UndefOr[Double] = js.undefined
}
object SchemaRequestUtilization {
  
  inline def apply(): SchemaRequestUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestUtilization]
  }
  
  extension [Self <: SchemaRequestUtilization](x: Self) {
    
    inline def setTargetConcurrentRequests(value: Double): Self = StObject.set(x, "targetConcurrentRequests", value.asInstanceOf[js.Any])
    
    inline def setTargetConcurrentRequestsUndefined: Self = StObject.set(x, "targetConcurrentRequests", js.undefined)
    
    inline def setTargetRequestCountPerSecond(value: Double): Self = StObject.set(x, "targetRequestCountPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetRequestCountPerSecondUndefined: Self = StObject.set(x, "targetRequestCountPerSecond", js.undefined)
  }
}
