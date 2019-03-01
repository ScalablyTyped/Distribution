package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Display extends js.Object {
  /** Display density expressed as dots-per-inch. */
  var density: js.UndefOr[scala.Double] = js.undefined
  /** Unique display id. */
  var displayId: js.UndefOr[scala.Double] = js.undefined
  /** Display height in pixels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Name of the display. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Refresh rate of the display in frames per second. */
  var refreshRate: js.UndefOr[scala.Double] = js.undefined
  /** State of the display. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Display width in pixels. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Display {
  @scala.inline
  def apply(
    density: scala.Int | scala.Double = null,
    displayId: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    refreshRate: scala.Int | scala.Double = null,
    state: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Display = {
    val __obj = js.Dynamic.literal()
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (displayId != null) __obj.updateDynamic("displayId")(displayId.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
}

