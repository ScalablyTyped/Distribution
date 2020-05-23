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
    left: js.UndefOr[Double] = js.undefined,
    positionOption: String = null,
    top: js.UndefOr[Double] = js.undefined,
    windowHeight: js.UndefOr[Double] = js.undefined,
    windowWidth: js.UndefOr[Double] = js.undefined
  ): FsCommand = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (positionOption != null) __obj.updateDynamic("positionOption")(positionOption.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowHeight)) __obj.updateDynamic("windowHeight")(windowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowWidth)) __obj.updateDynamic("windowWidth")(windowWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsCommand]
  }
}

