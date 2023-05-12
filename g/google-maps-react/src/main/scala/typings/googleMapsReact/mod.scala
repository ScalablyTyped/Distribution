package typings.googleMapsReact

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.std.Exclude
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
  open class Circle protected () extends Component[Any, Any, Any] {
    def this(props: Any) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: Any, context: Any) = this()
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
  open class InfoWindow protected () extends Component[IInfoWindowProps, Any, Any] {
    def this(props: IInfoWindowProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IInfoWindowProps, context: Any) = this()
  }
  
  @JSImport("google-maps-react", "Map")
  @js.native
  open class Map protected () extends Component[IMapProps, Any, Any] {
    def this(props: IMapProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IMapProps, context: Any) = this()
  }
  
  @JSImport("google-maps-react", "Marker")
  @js.native
  open class Marker protected () extends Component[IMarkerProps, Any, Any] {
    def this(props: IMarkerProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IMarkerProps, context: Any) = this()
  }
  
  @JSImport("google-maps-react", "Polygon")
  @js.native
  open class Polygon protected () extends Component[Any, Any, Any] {
    def this(props: Any) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: Any, context: Any) = this()
  }
  
  @JSImport("google-maps-react", "Polyline")
  @js.native
  open class Polyline protected () extends Component[Any, Any, Any] {
    def this(props: Any) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: Any, context: Any) = this()
  }
  
  type GoogleAPI = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google */ Any
  
  type GoogleApiOptionsFunc = js.Function1[/* props */ Any, IGoogleApiOptions]
  
  trait IGoogleApiOptions extends StObject {
    
    var LoadingContainer: js.UndefOr[Any] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGoogleApiOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLibraries(value: js.Array[String]): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
      
      inline def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
      
      inline def setLibrariesVarargs(value: String*): Self = StObject.set(x, "libraries", js.Array(value*))
      
      inline def setLoadingContainer(value: Any): Self = StObject.set(x, "LoadingContainer", value.asInstanceOf[js.Any])
      
      inline def setLoadingContainerUndefined: Self = StObject.set(x, "LoadingContainer", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.InfoWindowOptions * / any ]:? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.InfoWindowOptions * / any[P]} */ trait IInfoWindowProps extends StObject {
    
    var google: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google */ Any
    
    var map: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
    
    var mapCenter: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLng */ Any
      ] = js.undefined
    
    var marker: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object IInfoWindowProps {
    
    inline def apply(
      google: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google */ Any,
      map: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any,
      marker: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
    ): IInfoWindowProps = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInfoWindowProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IInfoWindowProps] (val x: Self) extends AnyVal {
      
      inline def setGoogle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google */ Any): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
      ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapCenter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLng */ Any
      ): Self = StObject.set(x, "mapCenter", value.asInstanceOf[js.Any])
      
      inline def setMapCenterUndefined: Self = StObject.set(x, "mapCenter", js.undefined)
      
      inline def setMarker(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
      ): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.MapOptions * / any */ trait IMapProps extends StObject {
    
    var bounds: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLngBounds */ Any
      ] = js.undefined
    
    var center: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLngLiteral */ Any
      ] = js.undefined
    
    var centerAroundCurrentLocation: js.UndefOr[Boolean] = js.undefined
    
    var containerStyle: js.UndefOr[Style] = js.undefined
    
    var google: GoogleAPI
    
    var initialCenter: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLngLiteral */ Any
      ] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMapProps] (val x: Self) extends AnyVal {
      
      inline def setBounds(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLngBounds */ Any
      ): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCenter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLngLiteral */ Any
      ): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterAroundCurrentLocation(value: Boolean): Self = StObject.set(x, "centerAroundCurrentLocation", value.asInstanceOf[js.Any])
      
      inline def setCenterAroundCurrentLocationUndefined: Self = StObject.set(x, "centerAroundCurrentLocation", js.undefined)
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setContainerStyle(value: Style): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setGoogle(value: GoogleAPI): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      inline def setInitialCenter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLngLiteral */ Any
      ): Self = StObject.set(x, "initialCenter", value.asInstanceOf[js.Any])
      
      inline def setInitialCenterUndefined: Self = StObject.set(x, "initialCenter", js.undefined)
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setOnBoundsChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onBoundsChanged", js.Any.fromFunction3(value))
      
      inline def setOnBoundsChangedUndefined: Self = StObject.set(x, "onBoundsChanged", js.undefined)
      
      inline def setOnCenterChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onCenterChanged", js.Any.fromFunction3(value))
      
      inline def setOnCenterChangedUndefined: Self = StObject.set(x, "onCenterChanged", js.undefined)
      
      inline def setOnClick(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDblclick(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onDblclick", js.Any.fromFunction3(value))
      
      inline def setOnDblclickUndefined: Self = StObject.set(x, "onDblclick", js.undefined)
      
      inline def setOnDragend(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onDragend", js.Any.fromFunction3(value))
      
      inline def setOnDragendUndefined: Self = StObject.set(x, "onDragend", js.undefined)
      
      inline def setOnDragstart(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onDragstart", js.Any.fromFunction3(value))
      
      inline def setOnDragstartUndefined: Self = StObject.set(x, "onDragstart", js.undefined)
      
      inline def setOnHeadingChange(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onHeadingChange", js.Any.fromFunction3(value))
      
      inline def setOnHeadingChangeUndefined: Self = StObject.set(x, "onHeadingChange", js.undefined)
      
      inline def setOnIdle(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onIdle", js.Any.fromFunction3(value))
      
      inline def setOnIdleUndefined: Self = StObject.set(x, "onIdle", js.undefined)
      
      inline def setOnMaptypeidChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onMaptypeidChanged", js.Any.fromFunction3(value))
      
      inline def setOnMaptypeidChangedUndefined: Self = StObject.set(x, "onMaptypeidChanged", js.undefined)
      
      inline def setOnMousemove(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onMousemove", js.Any.fromFunction3(value))
      
      inline def setOnMousemoveUndefined: Self = StObject.set(x, "onMousemove", js.undefined)
      
      inline def setOnMouseout(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onMouseout", js.Any.fromFunction3(value))
      
      inline def setOnMouseoutUndefined: Self = StObject.set(x, "onMouseout", js.undefined)
      
      inline def setOnMouseover(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onMouseover", js.Any.fromFunction3(value))
      
      inline def setOnMouseoverUndefined: Self = StObject.set(x, "onMouseover", js.undefined)
      
      inline def setOnProjectionChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onProjectionChanged", js.Any.fromFunction3(value))
      
      inline def setOnProjectionChangedUndefined: Self = StObject.set(x, "onProjectionChanged", js.undefined)
      
      inline def setOnReady(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onReady", js.Any.fromFunction3(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnRecenter(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onRecenter", js.Any.fromFunction3(value))
      
      inline def setOnRecenterUndefined: Self = StObject.set(x, "onRecenter", js.undefined)
      
      inline def setOnResize(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction3(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnRightclick(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onRightclick", js.Any.fromFunction3(value))
      
      inline def setOnRightclickUndefined: Self = StObject.set(x, "onRightclick", js.undefined)
      
      inline def setOnTilesloaded(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onTilesloaded", js.Any.fromFunction3(value))
      
      inline def setOnTilesloadedUndefined: Self = StObject.set(x, "onTilesloaded", js.undefined)
      
      inline def setOnTiltChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onTiltChanged", js.Any.fromFunction3(value))
      
      inline def setOnTiltChangedUndefined: Self = StObject.set(x, "onTiltChanged", js.undefined)
      
      inline def setOnZoomChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onZoomChanged", js.Any.fromFunction3(value))
      
      inline def setOnZoomChangedUndefined: Self = StObject.set(x, "onZoomChanged", js.undefined)
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.MarkerOptions * / any ]:? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.MarkerOptions * / any[P]} */ trait IMarkerProps extends StObject {
    
    var mapCenter: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLng */ Any
      ] = js.undefined
    
    var onClick: js.UndefOr[markerEventHandler] = js.undefined
    
    var onMouseover: js.UndefOr[markerEventHandler] = js.undefined
  }
  object IMarkerProps {
    
    inline def apply(): IMarkerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMarkerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMarkerProps] (val x: Self) extends AnyVal {
      
      inline def setMapCenter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLng */ Any
      ): Self = StObject.set(x, "mapCenter", value.asInstanceOf[js.Any])
      
      inline def setMapCenterUndefined: Self = StObject.set(x, "mapCenter", js.undefined)
      
      inline def setOnClick(
        value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseover(
        value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
            ], /* event */ Any) => Any
      ): Self = StObject.set(x, "onMouseover", js.Any.fromFunction3(value))
      
      inline def setOnMouseoverUndefined: Self = StObject.set(x, "onMouseover", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProvidedProps] (val x: Self) extends AnyVal {
      
      inline def setGoogle(value: GoogleAPI): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    }
  }
  
  type Omit[T1, T2] = Pick[T1, Exclude[/* keyof T1 */ String, /* keyof T2 */ String]]
  
  type Style = js.Object
  
  type mapEventHandler = js.Function3[
    /* mapProps */ js.UndefOr[IMapProps], 
    /* map */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
    ], 
    /* event */ Any, 
    Any
  ]
  
  type markerEventHandler = js.Function3[
    /* props */ js.UndefOr[IMarkerProps], 
    /* marker */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
    ], 
    /* event */ Any, 
    Any
  ]
}
