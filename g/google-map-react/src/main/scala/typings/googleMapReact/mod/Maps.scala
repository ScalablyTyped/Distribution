package typings.googleMapReact.mod

import typings.googleMapReact.anon.ANDROID
import typings.googleMapReact.anon.APPROXIMATE
import typings.googleMapReact.anon.BACKWARDCLOSEDARROW
import typings.googleMapReact.anon.BEST
import typings.googleMapReact.anon.BESTGUESS
import typings.googleMapReact.anon.BICYCLING
import typings.googleMapReact.anon.BOTTOM
import typings.googleMapReact.anon.BOUNCE
import typings.googleMapReact.anon.BUS
import typings.googleMapReact.anon.CENTER_
import typings.googleMapReact.anon.DEFAULT
import typings.googleMapReact.anon.DEFAULTNumber
import typings.googleMapReact.anon.DOCUMENTNOTFOUND
import typings.googleMapReact.anon.ERROR
import typings.googleMapReact.anon.ERROROK
import typings.googleMapReact.anon.FEWERTRANSFERS
import typings.googleMapReact.anon.HYBRID
import typings.googleMapReact.anon.IMPERIAL
import typings.googleMapReact.anon.INVALIDREQUEST
import typings.googleMapReact.anon.LARGE
import typings.googleMapReact.anon.MAXDIMENSIONSEXCEEDED
import typings.googleMapReact.anon.NOTFOUND
import typings.googleMapReact.anon.OK
import typings.googleMapReact.anon.OUTDOOR
import typings.googleMapReact.anon.RASTER
import typings.googleMapReact.anon.UNKNOWNERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maps extends StObject {
  
  var Animation: BOUNCE
  
  var ControlPosition: BOTTOM
  
  var DirectionsStatus: INVALIDREQUEST
  
  /** @deprecated - Use `TravelMode` instead */
  var DirectionsTravelMode: BICYCLING
  
  /** @deprecated - Use `UnitSystem` instead */
  var DirectionsUnitSystem: IMPERIAL
  
  var DistanceMatrixElementStatus: NOTFOUND
  
  var DistanceMatrixStatus: MAXDIMENSIONSEXCEEDED
  
  var ElevationStatus: OK
  
  var GeocoderLocationType: APPROXIMATE
  
  var GeocoderStatus: ERROR
  
  var KmlLayerStatus: DOCUMENTNOTFOUND
  
  var MapTypeControlStyle: DEFAULT
  
  var MapTypeId: HYBRID
  
  var MaxZoomStatus: ERROROK
  
  var NavigationControlStyle: ANDROID
  
  var RenderingType: RASTER
  
  var ScaleControlStyle: DEFAULTNumber
  
  var StreetViewPreference: BEST
  
  var StreetViewSource: OUTDOOR
  
  var StreetViewStatus: UNKNOWNERROR
  
  var StrokePosition: CENTER_
  
  var SymbolPath: BACKWARDCLOSEDARROW
  
  var TrafficModel: BESTGUESS
  
  var TransitMode: BUS
  
  var TransitRoutePreference: FEWERTRANSFERS
  
  var TravelMode: BICYCLING
  
  var UnitSystem: IMPERIAL
  
  /**
    * @deprecated - The Zoom control is available in only one style, and
    * `google.maps.ZoomControlStyle` is therefore no longer available.
    */
  var ZoomControlStyle: LARGE
}
object Maps {
  
  inline def apply(
    Animation: BOUNCE,
    ControlPosition: BOTTOM,
    DirectionsStatus: INVALIDREQUEST,
    DirectionsTravelMode: BICYCLING,
    DirectionsUnitSystem: IMPERIAL,
    DistanceMatrixElementStatus: NOTFOUND,
    DistanceMatrixStatus: MAXDIMENSIONSEXCEEDED,
    ElevationStatus: OK,
    GeocoderLocationType: APPROXIMATE,
    GeocoderStatus: ERROR,
    KmlLayerStatus: DOCUMENTNOTFOUND,
    MapTypeControlStyle: DEFAULT,
    MapTypeId: HYBRID,
    MaxZoomStatus: ERROROK,
    NavigationControlStyle: ANDROID,
    RenderingType: RASTER,
    ScaleControlStyle: DEFAULTNumber,
    StreetViewPreference: BEST,
    StreetViewSource: OUTDOOR,
    StreetViewStatus: UNKNOWNERROR,
    StrokePosition: CENTER_,
    SymbolPath: BACKWARDCLOSEDARROW,
    TrafficModel: BESTGUESS,
    TransitMode: BUS,
    TransitRoutePreference: FEWERTRANSFERS,
    TravelMode: BICYCLING,
    UnitSystem: IMPERIAL,
    ZoomControlStyle: LARGE
  ): Maps = {
    val __obj = js.Dynamic.literal(Animation = Animation.asInstanceOf[js.Any], ControlPosition = ControlPosition.asInstanceOf[js.Any], DirectionsStatus = DirectionsStatus.asInstanceOf[js.Any], DirectionsTravelMode = DirectionsTravelMode.asInstanceOf[js.Any], DirectionsUnitSystem = DirectionsUnitSystem.asInstanceOf[js.Any], DistanceMatrixElementStatus = DistanceMatrixElementStatus.asInstanceOf[js.Any], DistanceMatrixStatus = DistanceMatrixStatus.asInstanceOf[js.Any], ElevationStatus = ElevationStatus.asInstanceOf[js.Any], GeocoderLocationType = GeocoderLocationType.asInstanceOf[js.Any], GeocoderStatus = GeocoderStatus.asInstanceOf[js.Any], KmlLayerStatus = KmlLayerStatus.asInstanceOf[js.Any], MapTypeControlStyle = MapTypeControlStyle.asInstanceOf[js.Any], MapTypeId = MapTypeId.asInstanceOf[js.Any], MaxZoomStatus = MaxZoomStatus.asInstanceOf[js.Any], NavigationControlStyle = NavigationControlStyle.asInstanceOf[js.Any], RenderingType = RenderingType.asInstanceOf[js.Any], ScaleControlStyle = ScaleControlStyle.asInstanceOf[js.Any], StreetViewPreference = StreetViewPreference.asInstanceOf[js.Any], StreetViewSource = StreetViewSource.asInstanceOf[js.Any], StreetViewStatus = StreetViewStatus.asInstanceOf[js.Any], StrokePosition = StrokePosition.asInstanceOf[js.Any], SymbolPath = SymbolPath.asInstanceOf[js.Any], TrafficModel = TrafficModel.asInstanceOf[js.Any], TransitMode = TransitMode.asInstanceOf[js.Any], TransitRoutePreference = TransitRoutePreference.asInstanceOf[js.Any], TravelMode = TravelMode.asInstanceOf[js.Any], UnitSystem = UnitSystem.asInstanceOf[js.Any], ZoomControlStyle = ZoomControlStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Maps] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: BOUNCE): Self = StObject.set(x, "Animation", value.asInstanceOf[js.Any])
    
    inline def setControlPosition(value: BOTTOM): Self = StObject.set(x, "ControlPosition", value.asInstanceOf[js.Any])
    
    inline def setDirectionsStatus(value: INVALIDREQUEST): Self = StObject.set(x, "DirectionsStatus", value.asInstanceOf[js.Any])
    
    inline def setDirectionsTravelMode(value: BICYCLING): Self = StObject.set(x, "DirectionsTravelMode", value.asInstanceOf[js.Any])
    
    inline def setDirectionsUnitSystem(value: IMPERIAL): Self = StObject.set(x, "DirectionsUnitSystem", value.asInstanceOf[js.Any])
    
    inline def setDistanceMatrixElementStatus(value: NOTFOUND): Self = StObject.set(x, "DistanceMatrixElementStatus", value.asInstanceOf[js.Any])
    
    inline def setDistanceMatrixStatus(value: MAXDIMENSIONSEXCEEDED): Self = StObject.set(x, "DistanceMatrixStatus", value.asInstanceOf[js.Any])
    
    inline def setElevationStatus(value: OK): Self = StObject.set(x, "ElevationStatus", value.asInstanceOf[js.Any])
    
    inline def setGeocoderLocationType(value: APPROXIMATE): Self = StObject.set(x, "GeocoderLocationType", value.asInstanceOf[js.Any])
    
    inline def setGeocoderStatus(value: ERROR): Self = StObject.set(x, "GeocoderStatus", value.asInstanceOf[js.Any])
    
    inline def setKmlLayerStatus(value: DOCUMENTNOTFOUND): Self = StObject.set(x, "KmlLayerStatus", value.asInstanceOf[js.Any])
    
    inline def setMapTypeControlStyle(value: DEFAULT): Self = StObject.set(x, "MapTypeControlStyle", value.asInstanceOf[js.Any])
    
    inline def setMapTypeId(value: HYBRID): Self = StObject.set(x, "MapTypeId", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomStatus(value: ERROROK): Self = StObject.set(x, "MaxZoomStatus", value.asInstanceOf[js.Any])
    
    inline def setNavigationControlStyle(value: ANDROID): Self = StObject.set(x, "NavigationControlStyle", value.asInstanceOf[js.Any])
    
    inline def setRenderingType(value: RASTER): Self = StObject.set(x, "RenderingType", value.asInstanceOf[js.Any])
    
    inline def setScaleControlStyle(value: DEFAULTNumber): Self = StObject.set(x, "ScaleControlStyle", value.asInstanceOf[js.Any])
    
    inline def setStreetViewPreference(value: BEST): Self = StObject.set(x, "StreetViewPreference", value.asInstanceOf[js.Any])
    
    inline def setStreetViewSource(value: OUTDOOR): Self = StObject.set(x, "StreetViewSource", value.asInstanceOf[js.Any])
    
    inline def setStreetViewStatus(value: UNKNOWNERROR): Self = StObject.set(x, "StreetViewStatus", value.asInstanceOf[js.Any])
    
    inline def setStrokePosition(value: CENTER_): Self = StObject.set(x, "StrokePosition", value.asInstanceOf[js.Any])
    
    inline def setSymbolPath(value: BACKWARDCLOSEDARROW): Self = StObject.set(x, "SymbolPath", value.asInstanceOf[js.Any])
    
    inline def setTrafficModel(value: BESTGUESS): Self = StObject.set(x, "TrafficModel", value.asInstanceOf[js.Any])
    
    inline def setTransitMode(value: BUS): Self = StObject.set(x, "TransitMode", value.asInstanceOf[js.Any])
    
    inline def setTransitRoutePreference(value: FEWERTRANSFERS): Self = StObject.set(x, "TransitRoutePreference", value.asInstanceOf[js.Any])
    
    inline def setTravelMode(value: BICYCLING): Self = StObject.set(x, "TravelMode", value.asInstanceOf[js.Any])
    
    inline def setUnitSystem(value: IMPERIAL): Self = StObject.set(x, "UnitSystem", value.asInstanceOf[js.Any])
    
    inline def setZoomControlStyle(value: LARGE): Self = StObject.set(x, "ZoomControlStyle", value.asInstanceOf[js.Any])
  }
}
