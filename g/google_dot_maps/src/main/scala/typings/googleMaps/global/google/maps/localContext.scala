package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.LatLngLiteral
import typings.googleMaps.google.maps.MapsEventListener
import typings.googleMaps.google.maps.localContext.LocalContextMapViewOptions
import typings.googleMaps.google.maps.localContext.PlaceTypePreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localContext {
  
  @JSGlobal("google.maps.localContext.LocalContextMapView")
  @js.native
  open class LocalContextMapView protected ()
    extends StObject
       with typings.googleMaps.google.maps.localContext.LocalContextMapView {
    /**
      * Available only in the v=beta channel: https://goo.gle/3oAthT3.
      *
      * Shows a Local Context experience with a {@link google.maps.Map}.
      *
      * Access by calling `const {LocalContextMapView} = await
      * google.maps.importLibrary("localContext")`. See
      * https://developers.google.com/maps/documentation/javascript/libraries.
      * @deprecated Local Context is deprecated, and no longer recommended for
      *     new websites. The feature will continue to work, and 12 months notice
      *     will be given before support is discontinued. If you are interested
      *     in building a Local Context-like experience yourself, we suggest that
      *     you check out the &quot;Neighborhood Discovery&quot; solution in <a
      *     href="https://mapsplatform.google.com/resources/quick-builder/">Quick
      *     Builder</a> or use the <a
      *     href="https://developers.google.com/maps/documentation/javascript/places">Places
      *     Library</a>, Maps JavaScript API. <a
      *     href="https://developers.google.com/maps/documentation/javascript/examples#places">Code
      *     samples</a> and <a
      *     href="https://codelabs.developers.google.com/?product=googlemapsplatform&text=places">codelabs</a>
      *     for the Places Library can help you.
      */
    def this(options: LocalContextMapViewOptions) = this()
    
    /**
      * Adds the given listener function to the given event name.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * Hides the place details.
      */
    /* CompleteClass */
    override def hidePlaceDetailsView(): Unit = js.native
    
    /**
      * Is set to <code>true</code> before {@link
      * google.maps.localContext.LocalContextMapView} begins changing the bounds
      * of the inner {@link google.maps.Map}, and set to <code>false</code>
      * after {@link google.maps.localContext.LocalContextMapView} finishes
      * changing the bounds of the inner {@link google.maps.Map}. (Not set when
      * layout mode changes happen due to responsive resizing.)
      */
    /* CompleteClass */
    var isTransitioningMapBounds: Boolean = js.native
    
    /**
      * The maximum number of places to show. When this parameter is 0, the Local
      * Context Library does not load places. [0,24]
      */
    /* CompleteClass */
    var maxPlaceCount: Double = js.native
    
    /**
      * The types of places to search for (up to 10). The type
      * <code>Iterable&lt;string|PlaceTypePreference&gt;</code> is also accepted,
      * but is only supported in browsers which natively support JavaScript
      * Symbols.
      */
    /* CompleteClass */
    var placeTypePreferences: js.Array[PlaceTypePreference] = js.native
    
    /**
      * Searches for places to show the user based on the current
      * <code>maxPlaceCount</code>, <code>placeTypePreferences</code>,
      * <code>locationRestriction</code>, and <code>locationBias</code>.
      */
    /* CompleteClass */
    override def search(): Unit = js.native
  }
  
  @JSGlobal("google.maps.localContext.MapDirectionsOptions")
  @js.native
  open class MapDirectionsOptions ()
    extends StObject
       with typings.googleMaps.google.maps.localContext.MapDirectionsOptions {
    
    /**
      * Adds the given listener function to the given event name.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * Origin for directions and distance.
      */
    /* CompleteClass */
    var origin: typings.googleMaps.google.maps.LatLng | LatLngLiteral = js.native
  }
  
  @JSGlobal("google.maps.localContext.PlaceChooserLayoutMode")
  @js.native
  object PlaceChooserLayoutMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.localContext.PlaceChooserLayoutMode & String] = js.native
    
    /* "HIDDEN" */ val HIDDEN: typings.googleMaps.google.maps.localContext.PlaceChooserLayoutMode.HIDDEN & String = js.native
    
    /* "SHEET" */ val SHEET: typings.googleMaps.google.maps.localContext.PlaceChooserLayoutMode.SHEET & String = js.native
  }
  
  @JSGlobal("google.maps.localContext.PlaceChooserPosition")
  @js.native
  object PlaceChooserPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.localContext.PlaceChooserPosition & String] = js.native
    
    /* "BLOCK_END" */ val BLOCK_END: typings.googleMaps.google.maps.localContext.PlaceChooserPosition.BLOCK_END & String = js.native
    
    /* "INLINE_END" */ val INLINE_END: typings.googleMaps.google.maps.localContext.PlaceChooserPosition.INLINE_END & String = js.native
    
    /* "INLINE_START" */ val INLINE_START: typings.googleMaps.google.maps.localContext.PlaceChooserPosition.INLINE_START & String = js.native
  }
  
  @JSGlobal("google.maps.localContext.PlaceDetailsLayoutMode")
  @js.native
  object PlaceDetailsLayoutMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.localContext.PlaceDetailsLayoutMode & String] = js.native
    
    /* "INFO_WINDOW" */ val INFO_WINDOW: typings.googleMaps.google.maps.localContext.PlaceDetailsLayoutMode.INFO_WINDOW & String = js.native
    
    /* "SHEET" */ val SHEET: typings.googleMaps.google.maps.localContext.PlaceDetailsLayoutMode.SHEET & String = js.native
  }
  
  @JSGlobal("google.maps.localContext.PlaceDetailsPosition")
  @js.native
  object PlaceDetailsPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.localContext.PlaceDetailsPosition & String] = js.native
    
    /* "INLINE_END" */ val INLINE_END: typings.googleMaps.google.maps.localContext.PlaceDetailsPosition.INLINE_END & String = js.native
    
    /* "INLINE_START" */ val INLINE_START: typings.googleMaps.google.maps.localContext.PlaceDetailsPosition.INLINE_START & String = js.native
  }
}
