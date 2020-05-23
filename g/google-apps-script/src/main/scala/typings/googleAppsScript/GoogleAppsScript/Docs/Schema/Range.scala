package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var endIndex: js.UndefOr[Double] = js.undefined
  var segmentId: js.UndefOr[String] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
}

object Range {
  @scala.inline
  def apply(
    endIndex: js.UndefOr[Double] = js.undefined,
    segmentId: String = null,
    startIndex: js.UndefOr[Double] = js.undefined
  ): Range = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endIndex)) __obj.updateDynamic("endIndex")(endIndex.get.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

