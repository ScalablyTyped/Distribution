package typings
package atGoogleMapsLib.mapsMod

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
  var color: java.lang.String
  /** contains the URL for the icon associated with this line. */
  var icon: java.lang.String
  /** contains the full name of this transit line. eg. "7 Avenue Express". */
  var name: java.lang.String
  /** contains the short name of this transit line. This will normally be a line number, such as "M7" or "355". */
  var short_name: java.lang.String
  /** contains the color of text commonly used for signage of this line. The color will be specified as a hex string. */
  var text_color: java.lang.String
  /** contains the URL for this transit line as provided by the transit agency. */
  var url: java.lang.String
  /** contains the type of vehicle used on this line. */
  var vehicle: TransitVehicle
}

