package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitAgency extends js.Object {
  /** contains the name of the transit agency. */
  var name: String
  /** contains the phone number of the transit agency. */
  var phone: String
  /** contains the URL for the transit agency. */
  var url: String
}

object TransitAgency {
  @scala.inline
  def apply(name: String, phone: String, url: String): TransitAgency = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitAgency]
  }
}

