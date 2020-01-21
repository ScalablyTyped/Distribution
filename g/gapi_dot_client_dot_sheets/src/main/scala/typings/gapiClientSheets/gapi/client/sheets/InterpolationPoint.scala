package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolationPoint extends js.Object {
  /** The color this interpolation point should use. */
  var color: js.UndefOr[Color] = js.undefined
  /** How the value should be interpreted. */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The value this interpolation point uses.  May be a formula.
    * Unused if type is MIN or
    * MAX.
    */
  var value: js.UndefOr[String] = js.undefined
}

object InterpolationPoint {
  @scala.inline
  def apply(color: Color = null, `type`: String = null, value: String = null): InterpolationPoint = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationPoint]
  }
}

