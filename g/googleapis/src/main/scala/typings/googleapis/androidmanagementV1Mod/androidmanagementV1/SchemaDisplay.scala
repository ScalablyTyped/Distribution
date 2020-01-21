package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Device display information.
  */
@js.native
trait SchemaDisplay extends js.Object {
  /**
    * Display density expressed as dots-per-inch.
    */
  var density: js.UndefOr[Double] = js.native
  /**
    * Unique display id.
    */
  var displayId: js.UndefOr[Double] = js.native
  /**
    * Display height in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Name of the display.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Refresh rate of the display in frames per second.
    */
  var refreshRate: js.UndefOr[Double] = js.native
  /**
    * State of the display.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Display width in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaDisplay {
  @scala.inline
  def apply(
    density: Int | Double = null,
    displayId: Int | Double = null,
    height: Int | Double = null,
    name: String = null,
    refreshRate: Int | Double = null,
    state: String = null,
    width: Int | Double = null
  ): SchemaDisplay = {
    val __obj = js.Dynamic.literal()
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (displayId != null) __obj.updateDynamic("displayId")(displayId.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDisplay]
  }
}

