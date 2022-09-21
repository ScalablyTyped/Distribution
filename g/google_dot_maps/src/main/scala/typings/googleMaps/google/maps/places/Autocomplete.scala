package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.MVCObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A widget that provides Place predictions based on a user&#39;s text input.
  * It attaches to an input element of type <code>text</code>, and listens for
  * text entry in that field. The list of predictions is presented as a
  * drop-down list, and is updated as text is entered.
  */
@js.native
trait Autocomplete
  extends StObject
     with MVCObject {
  
  /**
    * Returns the bounds to which predictions are biased.
    */
  def getBounds(): js.UndefOr[LatLngBounds] = js.native
  
  /**
    * Returns the fields to be included for the Place in the details response
    * when the details are successfully retrieved. For a list of fields
    * see {@link google.maps.places.PlaceResult}.
    */
  def getFields(): js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Returns the details of the Place selected by user if the details were
    * successfully retrieved. Otherwise returns a stub Place object, with the
    * <code>name</code> property set to the current value of the input field.
    */
  def getPlace(): PlaceResult = js.native
  
  /**
    * Sets the preferred area within which to return Place results. Results are
    * biased towards, but not restricted to, this area.
    * @param bounds The biasing bounds.
    */
  def setBounds(): Unit = js.native
  def setBounds(bounds: LatLngBounds): Unit = js.native
  def setBounds(bounds: LatLngBoundsLiteral): Unit = js.native
  
  /**
    * Sets the component restrictions. Component restrictions are used to
    * restrict predictions to only those within the parent component. For
    * example, the country.
    * @param restrictions The restrictions to use.
    */
  def setComponentRestrictions(): Unit = js.native
  def setComponentRestrictions(restrictions: ComponentRestrictions): Unit = js.native
  
  /**
    * Sets the fields to be included for the Place in the details response when
    * the details are successfully retrieved. For a list of fields see {@link
    * google.maps.places.PlaceResult}.
    */
  def setFields(): Unit = js.native
  def setFields(fields: js.Array[String]): Unit = js.native
  
  def setOptions(): Unit = js.native
  def setOptions(options: AutocompleteOptions): Unit = js.native
  
  /**
    * Sets the types of predictions to be returned. For supported types, see
    * the <a
    * href="https://developers.google.com/maps/documentation/javascript/places-autocomplete#constrain-place-types">
    * developer&#39;s guide</a>. If no types are specified, all types will be
    * returned.
    * @param types The types of predictions to be included.
    */
  def setTypes(): Unit = js.native
  def setTypes(types: js.Array[String]): Unit = js.native
}
