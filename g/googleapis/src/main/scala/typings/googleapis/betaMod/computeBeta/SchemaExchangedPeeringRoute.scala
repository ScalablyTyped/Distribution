package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExchangedPeeringRoute extends StObject {
  
  /**
    * The destination range of the route.
    */
  var destRange: js.UndefOr[String] = js.undefined
  
  /**
    * If the peering route is imported if there is no confliction.
    */
  var imported: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The region of peering route next hop, only applies to dynamic routes.
    */
  var nextHopRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The priority of the peering route.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of the peering route.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaExchangedPeeringRoute {
  
  inline def apply(): SchemaExchangedPeeringRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExchangedPeeringRoute]
  }
  
  extension [Self <: SchemaExchangedPeeringRoute](x: Self) {
    
    inline def setDestRange(value: String): Self = StObject.set(x, "destRange", value.asInstanceOf[js.Any])
    
    inline def setDestRangeUndefined: Self = StObject.set(x, "destRange", js.undefined)
    
    inline def setImported(value: Boolean): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setImportedUndefined: Self = StObject.set(x, "imported", js.undefined)
    
    inline def setNextHopRegion(value: String): Self = StObject.set(x, "nextHopRegion", value.asInstanceOf[js.Any])
    
    inline def setNextHopRegionUndefined: Self = StObject.set(x, "nextHopRegion", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
