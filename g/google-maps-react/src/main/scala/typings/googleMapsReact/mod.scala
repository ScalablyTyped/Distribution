package typings.googleMapsReact

import typings.googleMapsReact.anon.Typeofgoogle
import typings.googleMapsReact.anon.Typeofmaps
import typings.googlemaps.google.maps.Animation
import typings.googlemaps.google.maps.Icon
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.MapOptions
import typings.googlemaps.google.maps.MarkerLabel
import typings.googlemaps.google.maps.MarkerShape
import typings.googlemaps.google.maps.Point
import typings.googlemaps.google.maps.Size
import typings.googlemaps.google.maps.StreetViewPanorama
import typings.googlemaps.google.maps.Symbol
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.std.Element
import typings.std.Exclude
import typings.std.Node
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("google-maps-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-maps-react", "Circle")
  @js.native
  class Circle protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  inline def GoogleApiWrapper(opts: GoogleApiOptionsFunc): js.Function1[
    /* ctor */ ComponentType[IProvidedProps], 
    ComponentType[Omit[IProvidedProps, IProvidedProps]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("GoogleApiWrapper")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ctor */ ComponentType[IProvidedProps], 
    ComponentType[Omit[IProvidedProps, IProvidedProps]]
  ]]
  inline def GoogleApiWrapper(opts: IGoogleApiOptions): js.Function1[
    /* ctor */ ComponentType[IProvidedProps], 
    ComponentType[Omit[IProvidedProps, IProvidedProps]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("GoogleApiWrapper")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ctor */ ComponentType[IProvidedProps], 
    ComponentType[Omit[IProvidedProps, IProvidedProps]]
  ]]
  
  @JSImport("google-maps-react", "InfoWindow")
  @js.native
  class InfoWindow protected ()
    extends Component[IInfoWindowProps, js.Any, js.Any] {
    def this(props: IInfoWindowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IInfoWindowProps, context: js.Any) = this()
  }
  
  @JSImport("google-maps-react", "Map")
  @js.native
  class Map protected ()
    extends Component[IMapProps, js.Any, js.Any] {
    def this(props: IMapProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IMapProps, context: js.Any) = this()
  }
  
  @JSImport("google-maps-react", "Marker")
  @js.native
  class Marker protected ()
    extends Component[IMarkerProps, js.Any, js.Any] {
    def this(props: IMarkerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IMarkerProps, context: js.Any) = this()
  }
  
  @JSImport("google-maps-react", "Polygon")
  @js.native
  class Polygon protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @JSImport("google-maps-react", "Polyline")
  @js.native
  class Polyline protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  trait GoogleAPI extends StObject {
    
    val maps: Typeofmaps
  }
  object GoogleAPI {
    
    inline def apply(maps: Typeofmaps): GoogleAPI = {
      val __obj = js.Dynamic.literal(maps = maps.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleAPI]
    }
    
    extension [Self <: GoogleAPI](x: Self) {
      
      inline def setMaps(value: Typeofmaps): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
    }
  }
  
  type GoogleApiOptionsFunc = js.Function1[/* props */ js.Any, IGoogleApiOptions]
  
  trait IGoogleApiOptions extends StObject {
    
    var LoadingContainer: js.UndefOr[js.Any] = js.undefined
    
    var apiKey: String
    
    var client: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var libraries: js.UndefOr[js.Array[String]] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object IGoogleApiOptions {
    
    inline def apply(apiKey: String): IGoogleApiOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGoogleApiOptions]
    }
    
    extension [Self <: IGoogleApiOptions](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLibraries(value: js.Array[String]): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
      
      inline def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
      
      inline def setLibrariesVarargs(value: String*): Self = StObject.set(x, "libraries", js.Array(value :_*))
      
      inline def setLoadingContainer(value: js.Any): Self = StObject.set(x, "LoadingContainer", value.asInstanceOf[js.Any])
      
      inline def setLoadingContainerUndefined: Self = StObject.set(x, "LoadingContainer", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<googlemaps.google.maps.InfoWindowOptions> */
  trait IInfoWindowProps extends StObject {
    
    var content: js.UndefOr[String | Node] = js.undefined
    
    var disableAutoPan: js.UndefOr[Boolean] = js.undefined
    
    var google: Typeofgoogle
    
    var map: typings.googlemaps.google.maps.Map[Element]
    
    var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
    
    var marker: typings.googlemaps.google.maps.Marker
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var pixelOffset: js.UndefOr[Size] = js.undefined
    
    var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object IInfoWindowProps {
    
    inline def apply(
      google: Typeofgoogle,
      map: typings.googlemaps.google.maps.Map[Element],
      marker: typings.googlemaps.google.maps.Marker
    ): IInfoWindowProps = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInfoWindowProps]
    }
    
    extension [Self <: IInfoWindowProps](x: Self) {
      
      inline def setContent(value: String | Node): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDisableAutoPan(value: Boolean): Self = StObject.set(x, "disableAutoPan", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoPanUndefined: Self = StObject.set(x, "disableAutoPan", js.undefined)
      
      inline def setGoogle(value: Typeofgoogle): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      inline def setMap(value: typings.googlemaps.google.maps.Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "mapCenter", value.asInstanceOf[js.Any])
      
      inline def setMapCenterUndefined: Self = StObject.set(x, "mapCenter", js.undefined)
      
      inline def setMarker(value: typings.googlemaps.google.maps.Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setPixelOffset(value: Size): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
      
      inline def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
      
      inline def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait IMapProps
    extends StObject
       with MapOptions {
    
    var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
    
    var centerAroundCurrentLocation: js.UndefOr[Boolean] = js.undefined
    
    @JSName("center")
    var center_IMapProps: js.UndefOr[LatLngLiteral] = js.undefined
    
    var containerStyle: js.UndefOr[Style] = js.undefined
    
    var google: GoogleAPI
    
    var initialCenter: js.UndefOr[LatLngLiteral] = js.undefined
    
    var loaded: js.UndefOr[Boolean] = js.undefined
    
    var onBoundsChanged: js.UndefOr[mapEventHandler] = js.undefined
    
    var onCenterChanged: js.UndefOr[mapEventHandler] = js.undefined
    
    var onClick: js.UndefOr[mapEventHandler] = js.undefined
    
    var onDblclick: js.UndefOr[mapEventHandler] = js.undefined
    
    var onDragend: js.UndefOr[mapEventHandler] = js.undefined
    
    var onDragstart: js.UndefOr[mapEventHandler] = js.undefined
    
    var onHeadingChange: js.UndefOr[mapEventHandler] = js.undefined
    
    var onIdle: js.UndefOr[mapEventHandler] = js.undefined
    
    var onMaptypeidChanged: js.UndefOr[mapEventHandler] = js.undefined
    
    var onMousemove: js.UndefOr[mapEventHandler] = js.undefined
    
    var onMouseout: js.UndefOr[mapEventHandler] = js.undefined
    
    var onMouseover: js.UndefOr[mapEventHandler] = js.undefined
    
    var onProjectionChanged: js.UndefOr[mapEventHandler] = js.undefined
    
    var onReady: js.UndefOr[mapEventHandler] = js.undefined
    
    var onRecenter: js.UndefOr[mapEventHandler] = js.undefined
    
    var onResize: js.UndefOr[mapEventHandler] = js.undefined
    
    var onRightclick: js.UndefOr[mapEventHandler] = js.undefined
    
    var onTilesloaded: js.UndefOr[mapEventHandler] = js.undefined
    
    var onTiltChanged: js.UndefOr[mapEventHandler] = js.undefined
    
    var onZoomChanged: js.UndefOr[mapEventHandler] = js.undefined
    
    var style: js.UndefOr[Style] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object IMapProps {
    
    inline def apply(google: GoogleAPI): IMapProps = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMapProps]
    }
    
    extension [Self <: IMapProps](x: Self) {
      
      inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCenter(value: LatLngLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterAroundCurrentLocation(value: Boolean): Self = StObject.set(x, "centerAroundCurrentLocation", value.asInstanceOf[js.Any])
      
      inline def setCenterAroundCurrentLocationUndefined: Self = StObject.set(x, "centerAroundCurrentLocation", js.undefined)
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setContainerStyle(value: Style): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setGoogle(value: GoogleAPI): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      inline def setInitialCenter(value: LatLngLiteral): Self = StObject.set(x, "initialCenter", value.asInstanceOf[js.Any])
      
      inline def setInitialCenterUndefined: Self = StObject.set(x, "initialCenter", js.undefined)
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setOnBoundsChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onBoundsChanged", js.Any.fromFunction3(value))
      
      inline def setOnBoundsChangedUndefined: Self = StObject.set(x, "onBoundsChanged", js.undefined)
      
      inline def setOnCenterChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onCenterChanged", js.Any.fromFunction3(value))
      
      inline def setOnCenterChangedUndefined: Self = StObject.set(x, "onCenterChanged", js.undefined)
      
      inline def setOnClick(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDblclick(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onDblclick", js.Any.fromFunction3(value))
      
      inline def setOnDblclickUndefined: Self = StObject.set(x, "onDblclick", js.undefined)
      
      inline def setOnDragend(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onDragend", js.Any.fromFunction3(value))
      
      inline def setOnDragendUndefined: Self = StObject.set(x, "onDragend", js.undefined)
      
      inline def setOnDragstart(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onDragstart", js.Any.fromFunction3(value))
      
      inline def setOnDragstartUndefined: Self = StObject.set(x, "onDragstart", js.undefined)
      
      inline def setOnHeadingChange(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onHeadingChange", js.Any.fromFunction3(value))
      
      inline def setOnHeadingChangeUndefined: Self = StObject.set(x, "onHeadingChange", js.undefined)
      
      inline def setOnIdle(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onIdle", js.Any.fromFunction3(value))
      
      inline def setOnIdleUndefined: Self = StObject.set(x, "onIdle", js.undefined)
      
      inline def setOnMaptypeidChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onMaptypeidChanged", js.Any.fromFunction3(value))
      
      inline def setOnMaptypeidChangedUndefined: Self = StObject.set(x, "onMaptypeidChanged", js.undefined)
      
      inline def setOnMousemove(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onMousemove", js.Any.fromFunction3(value))
      
      inline def setOnMousemoveUndefined: Self = StObject.set(x, "onMousemove", js.undefined)
      
      inline def setOnMouseout(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onMouseout", js.Any.fromFunction3(value))
      
      inline def setOnMouseoutUndefined: Self = StObject.set(x, "onMouseout", js.undefined)
      
      inline def setOnMouseover(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onMouseover", js.Any.fromFunction3(value))
      
      inline def setOnMouseoverUndefined: Self = StObject.set(x, "onMouseover", js.undefined)
      
      inline def setOnProjectionChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onProjectionChanged", js.Any.fromFunction3(value))
      
      inline def setOnProjectionChangedUndefined: Self = StObject.set(x, "onProjectionChanged", js.undefined)
      
      inline def setOnReady(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onReady", js.Any.fromFunction3(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnRecenter(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onRecenter", js.Any.fromFunction3(value))
      
      inline def setOnRecenterUndefined: Self = StObject.set(x, "onRecenter", js.undefined)
      
      inline def setOnResize(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction3(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnRightclick(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onRightclick", js.Any.fromFunction3(value))
      
      inline def setOnRightclickUndefined: Self = StObject.set(x, "onRightclick", js.undefined)
      
      inline def setOnTilesloaded(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onTilesloaded", js.Any.fromFunction3(value))
      
      inline def setOnTilesloadedUndefined: Self = StObject.set(x, "onTilesloaded", js.undefined)
      
      inline def setOnTiltChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onTiltChanged", js.Any.fromFunction3(value))
      
      inline def setOnTiltChangedUndefined: Self = StObject.set(x, "onTiltChanged", js.undefined)
      
      inline def setOnZoomChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onZoomChanged", js.Any.fromFunction3(value))
      
      inline def setOnZoomChangedUndefined: Self = StObject.set(x, "onZoomChanged", js.undefined)
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<googlemaps.google.maps.MarkerOptions> */
  trait IMarkerProps extends StObject {
    
    var anchorPoint: js.UndefOr[Point] = js.undefined
    
    var animation: js.UndefOr[Animation] = js.undefined
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var crossOnDrag: js.UndefOr[Boolean] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String | Icon | Symbol] = js.undefined
    
    var label: js.UndefOr[String | MarkerLabel] = js.undefined
    
    var map: js.UndefOr[typings.googlemaps.google.maps.Map[Element] | StreetViewPanorama] = js.undefined
    
    var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
    
    var onClick: js.UndefOr[markerEventHandler] = js.undefined
    
    var onMouseover: js.UndefOr[markerEventHandler] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var optimized: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
    
    var shape: js.UndefOr[MarkerShape] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object IMarkerProps {
    
    inline def apply(): IMarkerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMarkerProps]
    }
    
    extension [Self <: IMarkerProps](x: Self) {
      
      inline def setAnchorPoint(value: Point): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
      
      inline def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setCrossOnDrag(value: Boolean): Self = StObject.set(x, "crossOnDrag", value.asInstanceOf[js.Any])
      
      inline def setCrossOnDragUndefined: Self = StObject.set(x, "crossOnDrag", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setIcon(value: String | Icon | Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String | MarkerLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMap(value: typings.googlemaps.google.maps.Map[Element] | StreetViewPanorama): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "mapCenter", value.asInstanceOf[js.Any])
      
      inline def setMapCenterUndefined: Self = StObject.set(x, "mapCenter", js.undefined)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setOnClick(
        value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseover(
        value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onMouseover", js.Any.fromFunction3(value))
      
      inline def setOnMouseoverUndefined: Self = StObject.set(x, "onMouseover", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOptimized(value: Boolean): Self = StObject.set(x, "optimized", value.asInstanceOf[js.Any])
      
      inline def setOptimizedUndefined: Self = StObject.set(x, "optimized", js.undefined)
      
      inline def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait IProvidedProps extends StObject {
    
    var google: GoogleAPI
    
    var loaded: js.UndefOr[Boolean] = js.undefined
  }
  object IProvidedProps {
    
    inline def apply(google: GoogleAPI): IProvidedProps = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProvidedProps]
    }
    
    extension [Self <: IProvidedProps](x: Self) {
      
      inline def setGoogle(value: GoogleAPI): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    }
  }
  
  type Omit[T1, T2] = Pick[T1, Exclude[/* keyof T1 */ String, /* keyof T2 */ String]]
  
  type Style = js.Object
  
  type mapEventHandler = js.Function3[
    /* mapProps */ js.UndefOr[IMapProps], 
    /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], 
    /* event */ js.Any, 
    js.Any
  ]
  
  type markerEventHandler = js.Function3[
    /* props */ js.UndefOr[IMarkerProps], 
    /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], 
    /* event */ js.Any, 
    js.Any
  ]
}
