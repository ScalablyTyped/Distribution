package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TrafficLayerOptions object used to define the properties that can be set on
  * a TrafficLayer.
  */
trait TrafficLayerOptions extends StObject {
  
  /**
    * Whether the traffic layer refreshes with updated information
    * automatically.
    * @defaultValue <code>true</code>
    */
  var autoRefresh: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Map on which to display the traffic layer.
    */
  var map: js.UndefOr[Map | Null] = js.undefined
}
object TrafficLayerOptions {
  
  inline def apply(): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficLayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrafficLayerOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoRefresh(value: Boolean): Self = StObject.set(x, "autoRefresh", value.asInstanceOf[js.Any])
    
    inline def setAutoRefreshNull: Self = StObject.set(x, "autoRefresh", null)
    
    inline def setAutoRefreshUndefined: Self = StObject.set(x, "autoRefresh", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
