package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceOpeningHours extends StObject {
  
  /**
    * Check whether the place is open now (when no date is passed), or at the
    * given date. If this place does not have {@link
    * google.maps.places.PlaceResult.utc_offset_minutes} or {@link
    * google.maps.places.PlaceOpeningHours.periods} then <code>undefined</code>
    * is returned ({@link google.maps.places.PlaceOpeningHours.periods} is only
    * available via {@link google.maps.places.PlacesService.getDetails}). This
    * method does not take exceptional hours, such as holiday hours, into
    * consideration.
    */
  def isOpen(): js.UndefOr[Boolean] = js.native
  def isOpen(date: js.Date): js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the Place is open at the current time.
    * @deprecated <code>open_now</code> is deprecated as of November 2019. Use
    *     the {@link google.maps.places.PlaceOpeningHours.isOpen} method from
    *     a {@link google.maps.places.PlacesService.getDetails} result instead.
    *     See <a
    *     href="https://goo.gle/js-open-now">https://goo.gle/js-open-now</a>
    */
  var open_now: js.UndefOr[Boolean] = js.native
  
  /**
    * Opening periods covering for each day of the week, starting from Sunday,
    * in chronological order. Days in which the Place is not open are not
    * included. Only available with {@link
    * google.maps.places.PlacesService.getDetails}.
    */
  var periods: js.UndefOr[js.Array[PlaceOpeningHoursPeriod]] = js.native
  
  /**
    * An array of seven strings representing the formatted opening hours for
    * each day of the week. The Places Service will format and localize the
    * opening hours appropriately for the current language. The ordering of the
    * elements in this array depends on the language. Some languages start the
    * week on Monday while others start on Sunday. Only available with {@link
    * google.maps.places.PlacesService.getDetails}. Other calls may return an
    * empty array.
    */
  var weekday_text: js.UndefOr[js.Array[String]] = js.native
}
