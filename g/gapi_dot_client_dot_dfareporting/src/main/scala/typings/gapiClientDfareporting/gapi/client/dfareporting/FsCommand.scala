package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsCommand extends js.Object {
  /** Distance from the left of the browser.Applicable when positionOption is DISTANCE_FROM_TOP_LEFT_CORNER. */
  var left: js.UndefOr[Double] = js.undefined
  /** Position in the browser where the window will open. */
  var positionOption: js.UndefOr[String] = js.undefined
  /** Distance from the top of the browser. Applicable when positionOption is DISTANCE_FROM_TOP_LEFT_CORNER. */
  var top: js.UndefOr[Double] = js.undefined
  /** Height of the window. */
  var windowHeight: js.UndefOr[Double] = js.undefined
  /** Width of the window. */
  var windowWidth: js.UndefOr[Double] = js.undefined
}

object FsCommand {
  @scala.inline
  def apply(
    left: Int | Double = null,
    positionOption: String = null,
    top: Int | Double = null,
    windowHeight: Int | Double = null,
    windowWidth: Int | Double = null
  ): FsCommand = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (positionOption != null) __obj.updateDynamic("positionOption")(positionOption.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (windowHeight != null) __obj.updateDynamic("windowHeight")(windowHeight.asInstanceOf[js.Any])
    if (windowWidth != null) __obj.updateDynamic("windowWidth")(windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsCommand]
  }
}

