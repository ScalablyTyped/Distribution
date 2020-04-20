package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitLine extends js.Object {
  /**
    * is an array containing a single `TransitAgency` object.
    * The `TransitAgency` object provides information about the operator of the line
    */
  var agencies: js.Array[TransitAgency]
  /** contains the color commonly used in signage for this transit line. The color will be specified as a hex string such as: #FF0033. */
  var color: String
  /** contains the URL for the icon associated with this line. */
  var icon: String
  /** contains the full name of this transit line. eg. "7 Avenue Express". */
  var name: String
  /** contains the short name of this transit line. This will normally be a line number, such as "M7" or "355". */
  var short_name: String
  /** contains the color of text commonly used for signage of this line. The color will be specified as a hex string. */
  var text_color: String
  /** contains the URL for this transit line as provided by the transit agency. */
  var url: String
  /** contains the type of vehicle used on this line. */
  var vehicle: TransitVehicle
}

object TransitLine {
  @scala.inline
  def apply(
    agencies: js.Array[TransitAgency],
    color: String,
    icon: String,
    name: String,
    short_name: String,
    text_color: String,
    url: String,
    vehicle: TransitVehicle
  ): TransitLine = {
    val __obj = js.Dynamic.literal(agencies = agencies.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitLine]
  }
}

