package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsOutage extends StObject {
  
  /**
    * Link to the outage event in Google Workspace Status Dashboard
    */
  var dashboardUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Incident tracking ID.
    */
  var incidentTrackingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates new alert details under which the outage is communicated. Only populated when Status is MERGED.
    */
  var mergeInfo: js.UndefOr[SchemaMergeInfo] = js.undefined
  
  /**
    * Timestamp by which the next update is expected to arrive.
    */
  var nextUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of products impacted by the outage.
    */
  var products: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Timestamp when the outage is expected to be resolved, or has confirmed resolution. Provided only when known.
    */
  var resolutionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Current outage status.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsOutage {
  
  inline def apply(): SchemaAppsOutage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsOutage]
  }
  
  extension [Self <: SchemaAppsOutage](x: Self) {
    
    inline def setDashboardUri(value: String): Self = StObject.set(x, "dashboardUri", value.asInstanceOf[js.Any])
    
    inline def setDashboardUriNull: Self = StObject.set(x, "dashboardUri", null)
    
    inline def setDashboardUriUndefined: Self = StObject.set(x, "dashboardUri", js.undefined)
    
    inline def setIncidentTrackingId(value: String): Self = StObject.set(x, "incidentTrackingId", value.asInstanceOf[js.Any])
    
    inline def setIncidentTrackingIdNull: Self = StObject.set(x, "incidentTrackingId", null)
    
    inline def setIncidentTrackingIdUndefined: Self = StObject.set(x, "incidentTrackingId", js.undefined)
    
    inline def setMergeInfo(value: SchemaMergeInfo): Self = StObject.set(x, "mergeInfo", value.asInstanceOf[js.Any])
    
    inline def setMergeInfoUndefined: Self = StObject.set(x, "mergeInfo", js.undefined)
    
    inline def setNextUpdateTime(value: String): Self = StObject.set(x, "nextUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateTimeNull: Self = StObject.set(x, "nextUpdateTime", null)
    
    inline def setNextUpdateTimeUndefined: Self = StObject.set(x, "nextUpdateTime", js.undefined)
    
    inline def setProducts(value: js.Array[String]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsNull: Self = StObject.set(x, "products", null)
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: String*): Self = StObject.set(x, "products", js.Array(value*))
    
    inline def setResolutionTime(value: String): Self = StObject.set(x, "resolutionTime", value.asInstanceOf[js.Any])
    
    inline def setResolutionTimeNull: Self = StObject.set(x, "resolutionTime", null)
    
    inline def setResolutionTimeUndefined: Self = StObject.set(x, "resolutionTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
