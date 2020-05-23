package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsCommand extends js.Object {
  var left: js.UndefOr[Double] = js.undefined
  var positionOption: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
  var windowHeight: js.UndefOr[Double] = js.undefined
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

