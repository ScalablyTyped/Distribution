package typings.atGoogleMaps.atGoogleMapsMod

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
    val __obj = js.Dynamic.literal(name = name, phone = phone, url = url)
  
    __obj.asInstanceOf[TransitAgency]
  }
}

