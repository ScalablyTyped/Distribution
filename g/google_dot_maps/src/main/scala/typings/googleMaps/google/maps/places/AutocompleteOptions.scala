package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options that can be set on an <code>Autocomplete</code> object.
  */
trait AutocompleteOptions extends StObject {
  
  /**
    * The area in which to search for places.
    */
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  
  /**
    * The component restrictions. Component restrictions are used to restrict
    * predictions to only those within the parent component. For example, the
    * country.
    */
  var componentRestrictions: js.UndefOr[ComponentRestrictions] = js.undefined
  
  /**
    * Fields to be included for the Place in the details response when the
    * details are successfully retrieved, <a
    * href="https://developers.google.com/maps/billing/understanding-cost-of-use#places-product">which
    * will be billed for</a>. If <code>[&#39;ALL&#39;]</code> is passed in, all
    * available fields will be returned and billed for (this is not recommended
    * for production deployments). For a list of fields see {@link
    * google.maps.places.PlaceResult}. Nested fields can be specified with
    * dot-paths (for example, <code>"geometry.location"</code>). The default is
    * <code>[&#39;ALL&#39;]</code>.
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether to retrieve only Place IDs. The PlaceResult made available when
    * the place_changed event is fired will only have the place_id, types and
    * name fields, with the place_id, types and description returned by the
    * Autocomplete service. Disabled by default.
    * @deprecated <code>placeIdOnly</code> is deprecated as of January 15,
    *     2019, and will be turned off on January 15, 2020. Use {@link
    *     google.maps.places.AutocompleteOptions.fields} instead: <code>fields:
    *     [&#39;place_id&#39;, &#39;name&#39;, &#39;types&#39;]</code>.
    */
  var placeIdOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value, indicating that the Autocomplete widget should only
    * return those places that are inside the bounds of the Autocomplete widget
    * at the time the query is sent. Setting strictBounds to <code>false</code>
    * (which is the default) will make the results biased towards, but not
    * restricted to, places contained within the bounds.
    */
  var strictBounds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The types of predictions to be returned. For supported types, see the <a
    * href="https://developers.google.com/maps/documentation/javascript/places-autocomplete#constrain-place-types">
    * developer&#39;s guide</a>. If no types are specified, all types will be
    * returned.
    */
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object AutocompleteOptions {
  
  inline def apply(): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutocompleteOptions] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setComponentRestrictions(value: ComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
    
    inline def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setPlaceIdOnly(value: Boolean): Self = StObject.set(x, "placeIdOnly", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdOnlyUndefined: Self = StObject.set(x, "placeIdOnly", js.undefined)
    
    inline def setStrictBounds(value: Boolean): Self = StObject.set(x, "strictBounds", value.asInstanceOf[js.Any])
    
    inline def setStrictBoundsUndefined: Self = StObject.set(x, "strictBounds", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
