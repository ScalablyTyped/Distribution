package typings.googleMaps.google.maps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.googleMaps.anon.TypeofData
import typings.googleMaps.anon.TypeofMap
import typings.googleMaps.anon.TypeofOverlayView
import typings.googleMaps.google.maps.Data.DataOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapsLibrary extends StObject {
  
  var BicyclingLayer: Instantiable0[typings.googleMaps.google.maps.BicyclingLayer]
  
  var Circle: Instantiable1[
    /* circleOrCircleOptions */ js.UndefOr[typings.googleMaps.google.maps.Circle | Null | CircleLiteral | CircleOptions], 
    typings.googleMaps.google.maps.Circle
  ]
  
  var Data: TypeofData & (Instantiable1[/* options */ js.UndefOr[DataOptions | Null], typings.googleMaps.google.maps.Data])
  
  var FeatureType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.FeatureType */ Any
  
  var GroundOverlay: Instantiable3[
    /* url */ String, 
    /* bounds */ LatLngBounds | Null | LatLngBoundsLiteral, 
    /* opts */ js.UndefOr[GroundOverlayOptions | Null], 
    typings.googleMaps.google.maps.GroundOverlay
  ]
  
  var ImageMapType: Instantiable1[/* opts */ ImageMapTypeOptions | Null, typings.googleMaps.google.maps.ImageMapType]
  
  var InfoWindow: Instantiable1[
    /* opts */ js.UndefOr[InfoWindowOptions | Null], 
    typings.googleMaps.google.maps.InfoWindow
  ]
  
  var KmlLayer: Instantiable1[
    /* opts */ js.UndefOr[KmlLayerOptions | Null], 
    typings.googleMaps.google.maps.KmlLayer
  ]
  
  var KmlLayerStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.KmlLayerStatus */ Any
  
  var Map: TypeofMap
  
  var MapTypeControlStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MapTypeControlStyle */ Any
  
  var MapTypeId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MapTypeId */ Any
  
  var MapTypeRegistry: Instantiable0[typings.googleMaps.google.maps.MapTypeRegistry]
  
  var MaxZoomService: Instantiable0[typings.googleMaps.google.maps.MaxZoomService]
  
  var MaxZoomStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MaxZoomStatus */ Any
  
  var OverlayView: TypeofOverlayView
  
  var Polygon: Instantiable1[
    /* opts */ js.UndefOr[PolygonOptions | Null], 
    typings.googleMaps.google.maps.Polygon
  ]
  
  var Polyline: Instantiable1[
    /* opts */ js.UndefOr[PolylineOptions | Null], 
    typings.googleMaps.google.maps.Polyline
  ]
  
  var Rectangle: Instantiable1[
    /* opts */ js.UndefOr[RectangleOptions | Null], 
    typings.googleMaps.google.maps.Rectangle
  ]
  
  var RenderingType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.RenderingType */ Any
  
  var StrokePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StrokePosition */ Any
  
  var StyledMapType: Instantiable2[
    /* styles */ (js.Array[MapTypeStyle | Null]) | Null, 
    /* options */ js.UndefOr[StyledMapTypeOptions | Null], 
    typings.googleMaps.google.maps.StyledMapType
  ]
  
  var TrafficLayer: Instantiable1[
    /* opts */ js.UndefOr[TrafficLayerOptions | Null], 
    typings.googleMaps.google.maps.TrafficLayer
  ]
  
  var TransitLayer: Instantiable0[typings.googleMaps.google.maps.TransitLayer]
  
  var WebGLOverlayView: Instantiable0[typings.googleMaps.google.maps.WebGLOverlayView]
}
object MapsLibrary {
  
  inline def apply(
    BicyclingLayer: Instantiable0[BicyclingLayer],
    Circle: Instantiable1[
      /* circleOrCircleOptions */ js.UndefOr[Circle | Null | CircleLiteral | CircleOptions], 
      Circle
    ],
    Data: TypeofData & (Instantiable1[/* options */ js.UndefOr[DataOptions | Null], Data]),
    FeatureType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.FeatureType */ Any,
    GroundOverlay: Instantiable3[
      /* url */ String, 
      /* bounds */ LatLngBounds | Null | LatLngBoundsLiteral, 
      /* opts */ js.UndefOr[GroundOverlayOptions | Null], 
      GroundOverlay
    ],
    ImageMapType: Instantiable1[/* opts */ ImageMapTypeOptions | Null, ImageMapType],
    InfoWindow: Instantiable1[/* opts */ js.UndefOr[InfoWindowOptions | Null], InfoWindow],
    KmlLayer: Instantiable1[/* opts */ js.UndefOr[KmlLayerOptions | Null], KmlLayer],
    KmlLayerStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.KmlLayerStatus */ Any,
    Map: TypeofMap,
    MapTypeControlStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MapTypeControlStyle */ Any,
    MapTypeId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MapTypeId */ Any,
    MapTypeRegistry: Instantiable0[MapTypeRegistry],
    MaxZoomService: Instantiable0[MaxZoomService],
    MaxZoomStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MaxZoomStatus */ Any,
    OverlayView: TypeofOverlayView,
    Polygon: Instantiable1[/* opts */ js.UndefOr[PolygonOptions | Null], Polygon],
    Polyline: Instantiable1[/* opts */ js.UndefOr[PolylineOptions | Null], Polyline],
    Rectangle: Instantiable1[/* opts */ js.UndefOr[RectangleOptions | Null], Rectangle],
    RenderingType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.RenderingType */ Any,
    StrokePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StrokePosition */ Any,
    StyledMapType: Instantiable2[
      /* styles */ (js.Array[MapTypeStyle | Null]) | Null, 
      /* options */ js.UndefOr[StyledMapTypeOptions | Null], 
      StyledMapType
    ],
    TrafficLayer: Instantiable1[/* opts */ js.UndefOr[TrafficLayerOptions | Null], TrafficLayer],
    TransitLayer: Instantiable0[TransitLayer],
    WebGLOverlayView: Instantiable0[WebGLOverlayView]
  ): MapsLibrary = {
    val __obj = js.Dynamic.literal(BicyclingLayer = BicyclingLayer.asInstanceOf[js.Any], Circle = Circle.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], FeatureType = FeatureType.asInstanceOf[js.Any], GroundOverlay = GroundOverlay.asInstanceOf[js.Any], ImageMapType = ImageMapType.asInstanceOf[js.Any], InfoWindow = InfoWindow.asInstanceOf[js.Any], KmlLayer = KmlLayer.asInstanceOf[js.Any], KmlLayerStatus = KmlLayerStatus.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], MapTypeControlStyle = MapTypeControlStyle.asInstanceOf[js.Any], MapTypeId = MapTypeId.asInstanceOf[js.Any], MapTypeRegistry = MapTypeRegistry.asInstanceOf[js.Any], MaxZoomService = MaxZoomService.asInstanceOf[js.Any], MaxZoomStatus = MaxZoomStatus.asInstanceOf[js.Any], OverlayView = OverlayView.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], Polyline = Polyline.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any], RenderingType = RenderingType.asInstanceOf[js.Any], StrokePosition = StrokePosition.asInstanceOf[js.Any], StyledMapType = StyledMapType.asInstanceOf[js.Any], TrafficLayer = TrafficLayer.asInstanceOf[js.Any], TransitLayer = TransitLayer.asInstanceOf[js.Any], WebGLOverlayView = WebGLOverlayView.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapsLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapsLibrary] (val x: Self) extends AnyVal {
    
    inline def setBicyclingLayer(value: Instantiable0[BicyclingLayer]): Self = StObject.set(x, "BicyclingLayer", value.asInstanceOf[js.Any])
    
    inline def setCircle(
      value: Instantiable1[
          /* circleOrCircleOptions */ js.UndefOr[Circle | Null | CircleLiteral | CircleOptions], 
          Circle
        ]
    ): Self = StObject.set(x, "Circle", value.asInstanceOf[js.Any])
    
    inline def setData(value: TypeofData & (Instantiable1[/* options */ js.UndefOr[DataOptions | Null], Data])): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setFeatureType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.FeatureType */ Any
    ): Self = StObject.set(x, "FeatureType", value.asInstanceOf[js.Any])
    
    inline def setGroundOverlay(
      value: Instantiable3[
          /* url */ String, 
          /* bounds */ LatLngBounds | Null | LatLngBoundsLiteral, 
          /* opts */ js.UndefOr[GroundOverlayOptions | Null], 
          GroundOverlay
        ]
    ): Self = StObject.set(x, "GroundOverlay", value.asInstanceOf[js.Any])
    
    inline def setImageMapType(value: Instantiable1[/* opts */ ImageMapTypeOptions | Null, ImageMapType]): Self = StObject.set(x, "ImageMapType", value.asInstanceOf[js.Any])
    
    inline def setInfoWindow(value: Instantiable1[/* opts */ js.UndefOr[InfoWindowOptions | Null], InfoWindow]): Self = StObject.set(x, "InfoWindow", value.asInstanceOf[js.Any])
    
    inline def setKmlLayer(value: Instantiable1[/* opts */ js.UndefOr[KmlLayerOptions | Null], KmlLayer]): Self = StObject.set(x, "KmlLayer", value.asInstanceOf[js.Any])
    
    inline def setKmlLayerStatus(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.KmlLayerStatus */ Any
    ): Self = StObject.set(x, "KmlLayerStatus", value.asInstanceOf[js.Any])
    
    inline def setMap(value: TypeofMap): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
    
    inline def setMapTypeControlStyle(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MapTypeControlStyle */ Any
    ): Self = StObject.set(x, "MapTypeControlStyle", value.asInstanceOf[js.Any])
    
    inline def setMapTypeId(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MapTypeId */ Any
    ): Self = StObject.set(x, "MapTypeId", value.asInstanceOf[js.Any])
    
    inline def setMapTypeRegistry(value: Instantiable0[MapTypeRegistry]): Self = StObject.set(x, "MapTypeRegistry", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomService(value: Instantiable0[MaxZoomService]): Self = StObject.set(x, "MaxZoomService", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomStatus(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MaxZoomStatus */ Any
    ): Self = StObject.set(x, "MaxZoomStatus", value.asInstanceOf[js.Any])
    
    inline def setOverlayView(value: TypeofOverlayView): Self = StObject.set(x, "OverlayView", value.asInstanceOf[js.Any])
    
    inline def setPolygon(value: Instantiable1[/* opts */ js.UndefOr[PolygonOptions | Null], Polygon]): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
    
    inline def setPolyline(value: Instantiable1[/* opts */ js.UndefOr[PolylineOptions | Null], Polyline]): Self = StObject.set(x, "Polyline", value.asInstanceOf[js.Any])
    
    inline def setRectangle(value: Instantiable1[/* opts */ js.UndefOr[RectangleOptions | Null], Rectangle]): Self = StObject.set(x, "Rectangle", value.asInstanceOf[js.Any])
    
    inline def setRenderingType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.RenderingType */ Any
    ): Self = StObject.set(x, "RenderingType", value.asInstanceOf[js.Any])
    
    inline def setStrokePosition(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StrokePosition */ Any
    ): Self = StObject.set(x, "StrokePosition", value.asInstanceOf[js.Any])
    
    inline def setStyledMapType(
      value: Instantiable2[
          /* styles */ (js.Array[MapTypeStyle | Null]) | Null, 
          /* options */ js.UndefOr[StyledMapTypeOptions | Null], 
          StyledMapType
        ]
    ): Self = StObject.set(x, "StyledMapType", value.asInstanceOf[js.Any])
    
    inline def setTrafficLayer(value: Instantiable1[/* opts */ js.UndefOr[TrafficLayerOptions | Null], TrafficLayer]): Self = StObject.set(x, "TrafficLayer", value.asInstanceOf[js.Any])
    
    inline def setTransitLayer(value: Instantiable0[TransitLayer]): Self = StObject.set(x, "TransitLayer", value.asInstanceOf[js.Any])
    
    inline def setWebGLOverlayView(value: Instantiable0[WebGLOverlayView]): Self = StObject.set(x, "WebGLOverlayView", value.asInstanceOf[js.Any])
  }
}
