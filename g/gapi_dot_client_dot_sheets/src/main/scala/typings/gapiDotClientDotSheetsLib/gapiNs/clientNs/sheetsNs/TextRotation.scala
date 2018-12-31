package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRotation extends js.Object {
  /**
    * The angle between the standard orientation and the desired orientation.
    * Measured in degrees. Valid values are between -90 and 90. Positive
    * angles are angled upwards, negative are angled downwards.
    *
    * Note: For LTR text direction positive angles are in the counterclockwise
    * direction, whereas for RTL they are in the clockwise direction
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, text reads top to bottom, but the orientation of individual
    * characters is unchanged.
    * For example:
    *
    * | V |
    * | e |
    * | r |
    * | t |
    * | i |
    * | c |
    * | a |
    * | l |
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

