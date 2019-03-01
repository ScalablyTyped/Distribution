package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitAgency extends js.Object {
  /** contains the name of the transit agency. */
  var name: java.lang.String
  /** contains the phone number of the transit agency. */
  var phone: java.lang.String
  /** contains the URL for the transit agency. */
  var url: java.lang.String
}

object TransitAgency {
  @scala.inline
  def apply(name: java.lang.String, phone: java.lang.String, url: java.lang.String): TransitAgency = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("phone")(phone)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TransitAgency]
  }
}

