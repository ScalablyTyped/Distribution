package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressComponent extends js.Object {
  /** is the full text description or name of the address component as returned by the Geocoder. */
  var long_name: java.lang.String
  /**
    * is an abbreviated textual name for the address component, if available.
    * For example, an address component for the state of Alaska may have a `long_name` of "Alaska" and a `short_name` of "AK"
    * using the 2-letter postal abbreviation.
    */
  var short_name: java.lang.String
  /** is an array indicating the *type* of the address component. */
  var types: js.Array[AddressType | GeocodingAddressComponentType]
}

