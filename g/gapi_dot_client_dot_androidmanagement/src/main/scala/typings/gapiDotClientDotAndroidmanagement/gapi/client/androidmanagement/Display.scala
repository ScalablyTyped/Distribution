package typings.gapiDotClientDotAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Display extends js.Object {
  /** Display density expressed as dots-per-inch. */
  var density: js.UndefOr[Double] = js.undefined
  /** Unique display id. */
  var displayId: js.UndefOr[Double] = js.undefined
  /** Display height in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  /** Name of the display. */
  var name: js.UndefOr[String] = js.undefined
  /** Refresh rate of the display in frames per second. */
  var refreshRate: js.UndefOr[Double] = js.undefined
  /** State of the display. */
  var state: js.UndefOr[String] = js.undefined
  /** Display width in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object Display {
  @scala.inline
  def apply(
    density: Int | Double = null,
    displayId: Int | Double = null,
    height: Int | Double = null,
    name: String = null,
    refreshRate: Int | Double = null,
    state: String = null,
    width: Int | Double = null
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

