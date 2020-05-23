package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

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
    density: js.UndefOr[Double] = js.undefined,
    displayId: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    name: String = null,
    refreshRate: js.UndefOr[Double] = js.undefined,
    state: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Display = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(density)) __obj.updateDynamic("density")(density.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayId)) __obj.updateDynamic("displayId")(displayId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshRate)) __obj.updateDynamic("refreshRate")(refreshRate.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
}

