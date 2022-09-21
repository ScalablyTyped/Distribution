package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectDiagnostics extends StObject {
  
  /**
    * A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently seen by the Google router in the ARP cache for the Interconnect. This will be empty when the Interconnect is not bundled.
    */
  var arpCaches: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsARPEntry]] = js.undefined
  
  /**
    * The aggregation type of the bundle interface.
    */
  var bundleAggregationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The operational status of the bundle interface.
    */
  var bundleOperationalStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on the Interconnect.
    */
  var links: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsLinkStatus]] = js.undefined
  
  /**
    * The MAC address of the Interconnect's bundle interface.
    */
  var macAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaInterconnectDiagnostics {
  
  inline def apply(): SchemaInterconnectDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnostics]
  }
  
  extension [Self <: SchemaInterconnectDiagnostics](x: Self) {
    
    inline def setArpCaches(value: js.Array[SchemaInterconnectDiagnosticsARPEntry]): Self = StObject.set(x, "arpCaches", value.asInstanceOf[js.Any])
    
    inline def setArpCachesUndefined: Self = StObject.set(x, "arpCaches", js.undefined)
    
    inline def setArpCachesVarargs(value: SchemaInterconnectDiagnosticsARPEntry*): Self = StObject.set(x, "arpCaches", js.Array(value*))
    
    inline def setBundleAggregationType(value: String): Self = StObject.set(x, "bundleAggregationType", value.asInstanceOf[js.Any])
    
    inline def setBundleAggregationTypeNull: Self = StObject.set(x, "bundleAggregationType", null)
    
    inline def setBundleAggregationTypeUndefined: Self = StObject.set(x, "bundleAggregationType", js.undefined)
    
    inline def setBundleOperationalStatus(value: String): Self = StObject.set(x, "bundleOperationalStatus", value.asInstanceOf[js.Any])
    
    inline def setBundleOperationalStatusNull: Self = StObject.set(x, "bundleOperationalStatus", null)
    
    inline def setBundleOperationalStatusUndefined: Self = StObject.set(x, "bundleOperationalStatus", js.undefined)
    
    inline def setLinks(value: js.Array[SchemaInterconnectDiagnosticsLinkStatus]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: SchemaInterconnectDiagnosticsLinkStatus*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressNull: Self = StObject.set(x, "macAddress", null)
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
  }
}
