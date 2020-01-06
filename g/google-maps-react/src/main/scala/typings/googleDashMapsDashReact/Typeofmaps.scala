package typings.googleDashMapsDashReact

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.googlemaps.google.maps.BicyclingLayer
import typings.googlemaps.google.maps.Circle
import typings.googlemaps.google.maps.Data
import typings.googlemaps.google.maps.DirectionsRenderer
import typings.googlemaps.google.maps.DirectionsService
import typings.googlemaps.google.maps.DistanceMatrixService
import typings.googlemaps.google.maps.ElevationService
import typings.googlemaps.google.maps.FusionTablesLayer
import typings.googlemaps.google.maps.FusionTablesLayerOptions
import typings.googlemaps.google.maps.Geocoder
import typings.googlemaps.google.maps.GroundOverlay
import typings.googlemaps.google.maps.ImageMapType
import typings.googlemaps.google.maps.ImageMapTypeOptions
import typings.googlemaps.google.maps.InfoWindow
import typings.googlemaps.google.maps.KmlLayer
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.MVCArray
import typings.googlemaps.google.maps.MVCObject
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.MapCanvasProjection
import typings.googlemaps.google.maps.MapTypeRegistry
import typings.googlemaps.google.maps.MapTypeStyle
import typings.googlemaps.google.maps.MaxZoomService
import typings.googlemaps.google.maps.OverlayView
import typings.googlemaps.google.maps.Point
import typings.googlemaps.google.maps.Polygon
import typings.googlemaps.google.maps.Polyline
import typings.googlemaps.google.maps.Rectangle
import typings.googlemaps.google.maps.SaveWidget
import typings.googlemaps.google.maps.Size
import typings.googlemaps.google.maps.StreetViewCoverageLayer
import typings.googlemaps.google.maps.StreetViewPanorama
import typings.googlemaps.google.maps.StreetViewService
import typings.googlemaps.google.maps.StyledMapType
import typings.googlemaps.google.maps.TrafficLayer
import typings.googlemaps.google.maps.TransitLayer
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmaps extends js.Object {
  /***** Layers *****/
  var BicyclingLayer: Instantiable0[typings.googlemaps.google.maps.BicyclingLayer]
  /** A circle on the Earth's surface; also known as a "spherical cap". */
  var Circle: Instantiable0[typings.googlemaps.google.maps.Circle]
  /***** Data *****/
  var Data: Instantiable0[typings.googlemaps.google.maps.Data] with TypeofData
  var DirectionsRenderer: Instantiable0[typings.googlemaps.google.maps.DirectionsRenderer]
  var DirectionsService: Instantiable0[typings.googlemaps.google.maps.DirectionsService]
  var DistanceMatrixService: Instantiable0[typings.googlemaps.google.maps.DistanceMatrixService]
  var ElevationService: Instantiable0[typings.googlemaps.google.maps.ElevationService]
  var FusionTablesLayer: Instantiable1[
    /* options */ FusionTablesLayerOptions, 
    typings.googlemaps.google.maps.FusionTablesLayer
  ]
  /***** Services *****/
  var Geocoder: Instantiable0[typings.googlemaps.google.maps.Geocoder]
  var GroundOverlay: Instantiable2[
    /* url */ String, 
    /* bounds */ LatLngBounds, 
    typings.googlemaps.google.maps.GroundOverlay
  ]
  var ImageMapType: Instantiable1[/* opts */ ImageMapTypeOptions, typings.googlemaps.google.maps.ImageMapType]
  /**
    * An overlay that looks like a bubble and is often connected to a marker.
    * This class extends MVCObject.
    */
  var InfoWindow: Instantiable0[typings.googlemaps.google.maps.InfoWindow]
  var KmlLayer: Instantiable0[typings.googlemaps.google.maps.KmlLayer]
  /* **** Base **** */
  /**
    * A LatLng is a point in geographical coordinates: latitude and longitude.
    *
    * * Latitude ranges between -90 and 90 degrees, inclusive. Values above or
    *   below this range will be clamped to the range [-90, 90]. This means
    *   that if the value specified is less than -90, it will be set to -90.
    *   And if the value is greater than 90, it will be set to 90.
    * * Longitude ranges between -180 and 180 degrees, inclusive. Values above
    *   or below this range will be wrapped so that they fall within the
    *   range. For example, a value of -190 will be converted to 170. A value
    *   of 190 will be converted to -170. This reflects the fact that
    *   longitudes wrap around the globe.
    *
    * Although the default map projection associates longitude with the
    * x-coordinate of the map, and latitude with the y-coordinate, the
    * latitude coordinate is always written first, followed by the longitude.
    * Notice that you cannot modify the coordinates of a LatLng. If you want
    * to compute another point, you have to create a new one.
    */
  var LatLng: Instantiable2[/* lat */ Double, /* lng */ Double, typings.googlemaps.google.maps.LatLng]
  /**
    * A LatLngBounds instance represents a rectangle in geographical coordinates,
    * including one that crosses the 180 degrees longitudinal meridian.
    */
  var LatLngBounds: Instantiable0[typings.googlemaps.google.maps.LatLngBounds]
  /** This class extends MVCObject. */
  var MVCArray: Instantiable0[typings.googlemaps.google.maps.MVCArray[js.Object]]
  /***** MVC *****/
  /** Base class implementing KVO. */
  var MVCObject: Instantiable0[typings.googlemaps.google.maps.MVCObject]
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map Maps JavaScript API} */
  var Map: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam E */ /* mapDiv */ js.Any, 
    typings.googlemaps.google.maps.Map[Element]
  ]
  var MapCanvasProjection: Instantiable0[typings.googlemaps.google.maps.MapCanvasProjection]
  var MapTypeRegistry: Instantiable0[typings.googlemaps.google.maps.MapTypeRegistry]
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker Maps JavaScript API}
    */
  var Marker: TypeofClassMarker
  var MaxZoomService: Instantiable0[typings.googlemaps.google.maps.MaxZoomService]
  var OverlayView: Instantiable0[typings.googlemaps.google.maps.OverlayView]
  var Point: Instantiable2[/* x */ Double, /* y */ Double, typings.googlemaps.google.maps.Point]
  var Polygon: Instantiable0[typings.googlemaps.google.maps.Polygon]
  var Polyline: Instantiable0[typings.googlemaps.google.maps.Polyline]
  var Rectangle: Instantiable0[typings.googlemaps.google.maps.Rectangle]
  var SaveWidget: Instantiable1[/* container */ Node, typings.googlemaps.google.maps.SaveWidget]
  var Size: Instantiable2[/* width */ Double, /* height */ Double, typings.googlemaps.google.maps.Size]
  var StreetViewCoverageLayer: Instantiable0[typings.googlemaps.google.maps.StreetViewCoverageLayer]
  /***** Street View *****/
  var StreetViewPanorama: Instantiable1[/* container */ Element, typings.googlemaps.google.maps.StreetViewPanorama]
  var StreetViewService: Instantiable0[typings.googlemaps.google.maps.StreetViewService]
  var StyledMapType: Instantiable1[/* styles */ js.Array[MapTypeStyle], typings.googlemaps.google.maps.StyledMapType]
  var TrafficLayer: Instantiable0[typings.googlemaps.google.maps.TrafficLayer]
  var TransitLayer: Instantiable0[typings.googlemaps.google.maps.TransitLayer]
  /***** AdSense Library *****/
  val adsense: Typeofadsense
  /***** Drawing Library *****/
  val drawing: Typeofdrawing
  val event: Typeofevent
  /***** Geometry Library *****/
  val geometry: Typeofgeometry
  /***** Places Library *****/
  val places: Typeofplaces
  /**
    * Version of the Google Maps JavaScript API that the browser has loaded.
    * Like '3.38.11'.
    * @see {@link https://developers.google.com/maps/documentation/javascript/versions#version-checks Maps JavaScript API}
    */
  val version: String
  /***** Visualization Library *****/
  val visualization: Typeofvisualization
}

object Typeofmaps {
  @scala.inline
  def apply(
    BicyclingLayer: Instantiable0[BicyclingLayer],
    Circle: Instantiable0[Circle],
    Data: Instantiable0[Data] with TypeofData,
    DirectionsRenderer: Instantiable0[DirectionsRenderer],
    DirectionsService: Instantiable0[DirectionsService],
    DistanceMatrixService: Instantiable0[DistanceMatrixService],
    ElevationService: Instantiable0[ElevationService],
    FusionTablesLayer: Instantiable1[/* options */ FusionTablesLayerOptions, FusionTablesLayer],
    Geocoder: Instantiable0[Geocoder],
    GroundOverlay: Instantiable2[/* url */ String, /* bounds */ LatLngBounds, GroundOverlay],
    ImageMapType: Instantiable1[/* opts */ ImageMapTypeOptions, ImageMapType],
    InfoWindow: Instantiable0[InfoWindow],
    KmlLayer: Instantiable0[KmlLayer],
    LatLng: Instantiable2[/* lat */ Double, /* lng */ Double, LatLng],
    LatLngBounds: Instantiable0[LatLngBounds],
    MVCArray: Instantiable0[MVCArray[js.Object]],
    MVCObject: Instantiable0[MVCObject],
    Map: Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam E */ /* mapDiv */ js.Any, 
      Map[Element]
    ],
    MapCanvasProjection: Instantiable0[MapCanvasProjection],
    MapTypeRegistry: Instantiable0[MapTypeRegistry],
    Marker: TypeofClassMarker,
    MaxZoomService: Instantiable0[MaxZoomService],
    OverlayView: Instantiable0[OverlayView],
    Point: Instantiable2[/* x */ Double, /* y */ Double, Point],
    Polygon: Instantiable0[Polygon],
    Polyline: Instantiable0[Polyline],
    Rectangle: Instantiable0[Rectangle],
    SaveWidget: Instantiable1[/* container */ Node, SaveWidget],
    Size: Instantiable2[/* width */ Double, /* height */ Double, Size],
    StreetViewCoverageLayer: Instantiable0[StreetViewCoverageLayer],
    StreetViewPanorama: Instantiable1[/* container */ Element, StreetViewPanorama],
    StreetViewService: Instantiable0[StreetViewService],
    StyledMapType: Instantiable1[/* styles */ js.Array[MapTypeStyle], StyledMapType],
    TrafficLayer: Instantiable0[TrafficLayer],
    TransitLayer: Instantiable0[TransitLayer],
    adsense: Typeofadsense,
    drawing: Typeofdrawing,
    event: Typeofevent,
    geometry: Typeofgeometry,
    places: Typeofplaces,
    version: String,
    visualization: Typeofvisualization
  ): Typeofmaps = {
    val __obj = js.Dynamic.literal(BicyclingLayer = BicyclingLayer.asInstanceOf[js.Any], Circle = Circle.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DirectionsRenderer = DirectionsRenderer.asInstanceOf[js.Any], DirectionsService = DirectionsService.asInstanceOf[js.Any], DistanceMatrixService = DistanceMatrixService.asInstanceOf[js.Any], ElevationService = ElevationService.asInstanceOf[js.Any], FusionTablesLayer = FusionTablesLayer.asInstanceOf[js.Any], Geocoder = Geocoder.asInstanceOf[js.Any], GroundOverlay = GroundOverlay.asInstanceOf[js.Any], ImageMapType = ImageMapType.asInstanceOf[js.Any], InfoWindow = InfoWindow.asInstanceOf[js.Any], KmlLayer = KmlLayer.asInstanceOf[js.Any], LatLng = LatLng.asInstanceOf[js.Any], LatLngBounds = LatLngBounds.asInstanceOf[js.Any], MVCArray = MVCArray.asInstanceOf[js.Any], MVCObject = MVCObject.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], MapCanvasProjection = MapCanvasProjection.asInstanceOf[js.Any], MapTypeRegistry = MapTypeRegistry.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxZoomService = MaxZoomService.asInstanceOf[js.Any], OverlayView = OverlayView.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], Polyline = Polyline.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any], SaveWidget = SaveWidget.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StreetViewCoverageLayer = StreetViewCoverageLayer.asInstanceOf[js.Any], StreetViewPanorama = StreetViewPanorama.asInstanceOf[js.Any], StreetViewService = StreetViewService.asInstanceOf[js.Any], StyledMapType = StyledMapType.asInstanceOf[js.Any], TrafficLayer = TrafficLayer.asInstanceOf[js.Any], TransitLayer = TransitLayer.asInstanceOf[js.Any], adsense = adsense.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofmaps]
  }
}

