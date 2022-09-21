package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuota extends StObject {
  
  /**
    * [Output Only] Quota limit for this metric.
    */
  var limit: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] Name of the quota metric.
    */
  var metric: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Owning resource. This is the resource on which this quota is applied.
    */
  var owner: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Current usage of this metric.
    */
  var usage: js.UndefOr[Double | Null] = js.undefined
}
object SchemaQuota {
  
  inline def apply(): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuota]
  }
  
  extension [Self <: SchemaQuota](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricNull: Self = StObject.set(x, "metric", null)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageNull: Self = StObject.set(x, "usage", null)
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
