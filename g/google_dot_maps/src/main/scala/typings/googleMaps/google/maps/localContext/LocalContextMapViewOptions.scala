package typings.googleMaps.google.maps.localContext

import typings.googleMaps.anon.DefaultLayoutMode
import typings.googleMaps.anon.DefaultPosition
import typings.googleMaps.anon.IsHighlighted
import typings.googleMaps.google.maps.Circle
import typings.googleMaps.google.maps.CircleLiteral
import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.LatLngLiteral
import typings.googleMaps.google.maps.Map
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Options for constructing a {@link
  * google.maps.localContext.LocalContextMapView}, or accessing an
  * existing {@link google.maps.localContext.LocalContextMapView}.
  */
trait LocalContextMapViewOptions extends StObject {
  
  /**
    * Options for customizing directions. If not set, directions and distance
    * will be disabled.
    */
  var directionsOptions: js.UndefOr[Null | MapDirectionsOptionsLiteral] = js.undefined
  
  /**
    * The DOM Element backing the view.
    */
  var element: js.UndefOr[Element | Null] = js.undefined
  
  /**
    * A soft boundary or hint to use when searching for places.
    * @defaultValue <code>null</code>
    */
  var locationBias: js.UndefOr[
    LatLng | LatLngLiteral | LatLngBounds | LatLngBoundsLiteral | Circle | CircleLiteral | String | Null
  ] = js.undefined
  
  /**
    * Bounds to constrain search results. If not specified, results will be
    * constrained to the map viewport.
    */
  var locationRestriction: js.UndefOr[LatLngBounds | LatLngBoundsLiteral | Null] = js.undefined
  
  /**
    * An already instantiated {@link google.maps.Map} instance. If passed in,
    * the map will be moved into the LocalContextMapView&#39;s DOM, and will
    * <strong>not</strong> be re-styled. The element associated with the Map
    * may also have styles and classes applied to it by the
    * <code>LocalContextMapView</code>.
    */
  var map: js.UndefOr[Map | Null] = js.undefined
  
  /**
    * The maximum number of places to show. When this parameter is 0, the Local
    * Context Library does not load places. [0,24]
    */
  var maxPlaceCount: Double
  
  /**
    * Configure the place marker icon based on the icon state. Invoked whenever
    * the input to the callback changes. Pass a function to dynamically
    * override the default setup when the LocalContextMapView draws the place
    * marker. Errors and invalid configurations may be determined
    * asynchronously, and will be ignored (defaults will be used, and errors
    * will be logged to the console).
    */
  var pinOptionsSetup: js.UndefOr[
    (js.Function1[/* a */ IsHighlighted, js.UndefOr[PinOptions | Null]]) | PinOptions | Null
  ] = js.undefined
  
  /**
    * Overrides the setup of the place chooser view. Pass a function to
    * dynamically override the default setup when the LocalContextMapView might
    * change its layout due to resizing. Errors and invalid configurations may
    * be determined asynchronously, and will be ignored (defaults will be used
    * instead, and errors will be logged to the console). Errors detected at
    * construction will cause errors to be thrown synchronously.
    */
  var placeChooserViewSetup: js.UndefOr[
    (js.Function1[/* a */ DefaultLayoutMode, js.UndefOr[PlaceChooserViewSetupOptions | Null]]) | PlaceChooserViewSetupOptions | Null
  ] = js.undefined
  
  /**
    * Overrides the setup of the place details view. Pass a function to
    * dynamically override the default setup when the LocalContextMapView might
    * change its layout due to resizing. Errors and invalid configurations may
    * be determined asynchronously, and will be ignored (defaults will be used,
    * and errors will be logged to the console). Errors detected at
    * construction will cause errors to be thrown synchronously.
    */
  var placeDetailsViewSetup: js.UndefOr[
    (js.Function1[/* a */ DefaultPosition, js.UndefOr[PlaceDetailsViewSetupOptions | Null]]) | PlaceDetailsViewSetupOptions | Null
  ] = js.undefined
  
  /**
    * The types of places to search for (up to 10). The type
    * <code>Iterable&lt;string|PlaceTypePreference&gt;</code> is also accepted,
    * but is only supported in browsers which natively support JavaScript
    * Symbols.
    */
  var placeTypePreferences: js.Array[PlaceTypePreference]
}
object LocalContextMapViewOptions {
  
  inline def apply(maxPlaceCount: Double, placeTypePreferences: js.Array[PlaceTypePreference]): LocalContextMapViewOptions = {
    val __obj = js.Dynamic.literal(maxPlaceCount = maxPlaceCount.asInstanceOf[js.Any], placeTypePreferences = placeTypePreferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalContextMapViewOptions]
  }
  
  extension [Self <: LocalContextMapViewOptions](x: Self) {
    
    inline def setDirectionsOptions(value: MapDirectionsOptionsLiteral): Self = StObject.set(x, "directionsOptions", value.asInstanceOf[js.Any])
    
    inline def setDirectionsOptionsNull: Self = StObject.set(x, "directionsOptions", null)
    
    inline def setDirectionsOptionsUndefined: Self = StObject.set(x, "directionsOptions", js.undefined)
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementNull: Self = StObject.set(x, "element", null)
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setLocationBias(
      value: LatLng | LatLngLiteral | LatLngBounds | LatLngBoundsLiteral | Circle | CircleLiteral | String
    ): Self = StObject.set(x, "locationBias", value.asInstanceOf[js.Any])
    
    inline def setLocationBiasNull: Self = StObject.set(x, "locationBias", null)
    
    inline def setLocationBiasUndefined: Self = StObject.set(x, "locationBias", js.undefined)
    
    inline def setLocationRestriction(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "locationRestriction", value.asInstanceOf[js.Any])
    
    inline def setLocationRestrictionNull: Self = StObject.set(x, "locationRestriction", null)
    
    inline def setLocationRestrictionUndefined: Self = StObject.set(x, "locationRestriction", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMaxPlaceCount(value: Double): Self = StObject.set(x, "maxPlaceCount", value.asInstanceOf[js.Any])
    
    inline def setPinOptionsSetup(value: (js.Function1[/* a */ IsHighlighted, js.UndefOr[PinOptions | Null]]) | PinOptions): Self = StObject.set(x, "pinOptionsSetup", value.asInstanceOf[js.Any])
    
    inline def setPinOptionsSetupFunction1(value: /* a */ IsHighlighted => js.UndefOr[PinOptions | Null]): Self = StObject.set(x, "pinOptionsSetup", js.Any.fromFunction1(value))
    
    inline def setPinOptionsSetupNull: Self = StObject.set(x, "pinOptionsSetup", null)
    
    inline def setPinOptionsSetupUndefined: Self = StObject.set(x, "pinOptionsSetup", js.undefined)
    
    inline def setPlaceChooserViewSetup(
      value: (js.Function1[/* a */ DefaultLayoutMode, js.UndefOr[PlaceChooserViewSetupOptions | Null]]) | PlaceChooserViewSetupOptions
    ): Self = StObject.set(x, "placeChooserViewSetup", value.asInstanceOf[js.Any])
    
    inline def setPlaceChooserViewSetupFunction1(value: /* a */ DefaultLayoutMode => js.UndefOr[PlaceChooserViewSetupOptions | Null]): Self = StObject.set(x, "placeChooserViewSetup", js.Any.fromFunction1(value))
    
    inline def setPlaceChooserViewSetupNull: Self = StObject.set(x, "placeChooserViewSetup", null)
    
    inline def setPlaceChooserViewSetupUndefined: Self = StObject.set(x, "placeChooserViewSetup", js.undefined)
    
    inline def setPlaceDetailsViewSetup(
      value: (js.Function1[/* a */ DefaultPosition, js.UndefOr[PlaceDetailsViewSetupOptions | Null]]) | PlaceDetailsViewSetupOptions
    ): Self = StObject.set(x, "placeDetailsViewSetup", value.asInstanceOf[js.Any])
    
    inline def setPlaceDetailsViewSetupFunction1(value: /* a */ DefaultPosition => js.UndefOr[PlaceDetailsViewSetupOptions | Null]): Self = StObject.set(x, "placeDetailsViewSetup", js.Any.fromFunction1(value))
    
    inline def setPlaceDetailsViewSetupNull: Self = StObject.set(x, "placeDetailsViewSetup", null)
    
    inline def setPlaceDetailsViewSetupUndefined: Self = StObject.set(x, "placeDetailsViewSetup", js.undefined)
    
    inline def setPlaceTypePreferences(value: js.Array[PlaceTypePreference]): Self = StObject.set(x, "placeTypePreferences", value.asInstanceOf[js.Any])
    
    inline def setPlaceTypePreferencesVarargs(value: PlaceTypePreference*): Self = StObject.set(x, "placeTypePreferences", js.Array(value*))
  }
}
