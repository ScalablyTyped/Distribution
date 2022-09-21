package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExchangedPeeringRoute extends StObject {
  
  /**
    * The destination range of the route.
    */
  var destRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the peering route has been imported from a peer. The actual import happens if the field networkPeering.importCustomRoutes is true for this network, and networkPeering.exportCustomRoutes is true for the peer network, and the import does not result in a route conflict.
    */
  var imported: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The region of peering route next hop, only applies to dynamic routes.
    */
  var nextHopRegion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The priority of the peering route.
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The type of the peering route.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaExchangedPeeringRoute {
  
  inline def apply(): SchemaExchangedPeeringRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExchangedPeeringRoute]
  }
  
  extension [Self <: SchemaExchangedPeeringRoute](x: Self) {
    
    inline def setDestRange(value: String): Self = StObject.set(x, "destRange", value.asInstanceOf[js.Any])
    
    inline def setDestRangeNull: Self = StObject.set(x, "destRange", null)
    
    inline def setDestRangeUndefined: Self = StObject.set(x, "destRange", js.undefined)
    
    inline def setImported(value: Boolean): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setImportedNull: Self = StObject.set(x, "imported", null)
    
    inline def setImportedUndefined: Self = StObject.set(x, "imported", js.undefined)
    
    inline def setNextHopRegion(value: String): Self = StObject.set(x, "nextHopRegion", value.asInstanceOf[js.Any])
    
    inline def setNextHopRegionNull: Self = StObject.set(x, "nextHopRegion", null)
    
    inline def setNextHopRegionUndefined: Self = StObject.set(x, "nextHopRegion", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
