package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var endIndex: js.UndefOr[Double] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Range {
  @scala.inline
  def apply(
    endIndex: js.UndefOr[Double] = js.undefined,
    startIndex: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): Range = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endIndex)) __obj.updateDynamic("endIndex")(endIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

