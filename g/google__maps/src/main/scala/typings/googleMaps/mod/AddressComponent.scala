package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressComponent[T] extends js.Object {
  /** is the full text description or name of the address component as returned by the Geocoder. */
  var long_name: String
  /**
    * is an abbreviated textual name for the address component, if available.
    * For example, an address component for the state of Alaska may have a `long_name` of "Alaska" and a `short_name` of "AK"
    * using the 2-letter postal abbreviation.
    */
  var short_name: String
  /** is an array indicating the *type* of the address component. */
  var types: js.Array[T]
}

object AddressComponent {
  @scala.inline
  def apply[T](long_name: String, short_name: String, types: js.Array[T]): AddressComponent[T] = {
    val __obj = js.Dynamic.literal(long_name = long_name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressComponent[T]]
  }
}

