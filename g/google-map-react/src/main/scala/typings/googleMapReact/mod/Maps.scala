package typings.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maps extends js.Object {
  
  var Animation: js.Any = js.native
  
  var ControlPosition: js.Any = js.native
  
  var DirectionsStatus: js.Any = js.native
  
  var DirectionsTravelMode: js.Any = js.native
  
  var DirectionsUnitSystem: js.Any = js.native
  
  var DistanceMatrixElementStatus: js.Any = js.native
  
  var DistanceMatrixStatus: js.Any = js.native
  
  var ElevationStatus: js.Any = js.native
  
  var GeocoderLocationType: js.Any = js.native
  
  var GeocoderStatus: js.Any = js.native
  
  var KmlLayerStats: js.Any = js.native
  
  var MapTypeControlStyle: js.Any = js.native
  
  var MapTypeId: js.Any = js.native
  
  var MaxZoomStatus: js.Any = js.native
  
  var NavigationControlStyle: js.Any = js.native
  
  var ScaleControlStyle: js.Any = js.native
  
  var StreetViewStatus: js.Any = js.native
  
  var StrokePosition: js.Any = js.native
  
  var SymbolPath: js.Any = js.native
  
  var TransitMode: js.Any = js.native
  
  var TransitRoutePreference: js.Any = js.native
  
  var TravelMode: js.Any = js.native
  
  var UnitSystem: js.Any = js.native
  
  var ZoomControlStyle: js.Any = js.native
}
object Maps {
  
  @scala.inline
  def apply(
    Animation: js.Any,
    ControlPosition: js.Any,
    DirectionsStatus: js.Any,
    DirectionsTravelMode: js.Any,
    DirectionsUnitSystem: js.Any,
    DistanceMatrixElementStatus: js.Any,
    DistanceMatrixStatus: js.Any,
    ElevationStatus: js.Any,
    GeocoderLocationType: js.Any,
    GeocoderStatus: js.Any,
    KmlLayerStats: js.Any,
    MapTypeControlStyle: js.Any,
    MapTypeId: js.Any,
    MaxZoomStatus: js.Any,
    NavigationControlStyle: js.Any,
    ScaleControlStyle: js.Any,
    StreetViewStatus: js.Any,
    StrokePosition: js.Any,
    SymbolPath: js.Any,
    TransitMode: js.Any,
    TransitRoutePreference: js.Any,
    TravelMode: js.Any,
    UnitSystem: js.Any,
    ZoomControlStyle: js.Any
  ): Maps = {
    val __obj = js.Dynamic.literal(Animation = Animation.asInstanceOf[js.Any], ControlPosition = ControlPosition.asInstanceOf[js.Any], DirectionsStatus = DirectionsStatus.asInstanceOf[js.Any], DirectionsTravelMode = DirectionsTravelMode.asInstanceOf[js.Any], DirectionsUnitSystem = DirectionsUnitSystem.asInstanceOf[js.Any], DistanceMatrixElementStatus = DistanceMatrixElementStatus.asInstanceOf[js.Any], DistanceMatrixStatus = DistanceMatrixStatus.asInstanceOf[js.Any], ElevationStatus = ElevationStatus.asInstanceOf[js.Any], GeocoderLocationType = GeocoderLocationType.asInstanceOf[js.Any], GeocoderStatus = GeocoderStatus.asInstanceOf[js.Any], KmlLayerStats = KmlLayerStats.asInstanceOf[js.Any], MapTypeControlStyle = MapTypeControlStyle.asInstanceOf[js.Any], MapTypeId = MapTypeId.asInstanceOf[js.Any], MaxZoomStatus = MaxZoomStatus.asInstanceOf[js.Any], NavigationControlStyle = NavigationControlStyle.asInstanceOf[js.Any], ScaleControlStyle = ScaleControlStyle.asInstanceOf[js.Any], StreetViewStatus = StreetViewStatus.asInstanceOf[js.Any], StrokePosition = StrokePosition.asInstanceOf[js.Any], SymbolPath = SymbolPath.asInstanceOf[js.Any], TransitMode = TransitMode.asInstanceOf[js.Any], TransitRoutePreference = TransitRoutePreference.asInstanceOf[js.Any], TravelMode = TravelMode.asInstanceOf[js.Any], UnitSystem = UnitSystem.asInstanceOf[js.Any], ZoomControlStyle = ZoomControlStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maps]
  }
  
  @scala.inline
  implicit class MapsOps[Self <: Maps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimation(value: js.Any): Self = this.set("Animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPosition(value: js.Any): Self = this.set("ControlPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsStatus(value: js.Any): Self = this.set("DirectionsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsTravelMode(value: js.Any): Self = this.set("DirectionsTravelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsUnitSystem(value: js.Any): Self = this.set("DirectionsUnitSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceMatrixElementStatus(value: js.Any): Self = this.set("DistanceMatrixElementStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceMatrixStatus(value: js.Any): Self = this.set("DistanceMatrixStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationStatus(value: js.Any): Self = this.set("ElevationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeocoderLocationType(value: js.Any): Self = this.set("GeocoderLocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeocoderStatus(value: js.Any): Self = this.set("GeocoderStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmlLayerStats(value: js.Any): Self = this.set("KmlLayerStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeControlStyle(value: js.Any): Self = this.set("MapTypeControlStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeId(value: js.Any): Self = this.set("MapTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomStatus(value: js.Any): Self = this.set("MaxZoomStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationControlStyle(value: js.Any): Self = this.set("NavigationControlStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleControlStyle(value: js.Any): Self = this.set("ScaleControlStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetViewStatus(value: js.Any): Self = this.set("StreetViewStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokePosition(value: js.Any): Self = this.set("StrokePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolPath(value: js.Any): Self = this.set("SymbolPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitMode(value: js.Any): Self = this.set("TransitMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitRoutePreference(value: js.Any): Self = this.set("TransitRoutePreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravelMode(value: js.Any): Self = this.set("TravelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitSystem(value: js.Any): Self = this.set("UnitSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomControlStyle(value: js.Any): Self = this.set("ZoomControlStyle", value.asInstanceOf[js.Any])
  }
}
