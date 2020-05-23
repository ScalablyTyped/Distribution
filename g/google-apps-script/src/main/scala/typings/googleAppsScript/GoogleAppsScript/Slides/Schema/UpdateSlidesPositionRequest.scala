package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSlidesPositionRequest extends js.Object {
  var insertionIndex: js.UndefOr[Double] = js.undefined
  var slideObjectIds: js.UndefOr[js.Array[String]] = js.undefined
}

object UpdateSlidesPositionRequest {
  @scala.inline
  def apply(insertionIndex: js.UndefOr[Double] = js.undefined, slideObjectIds: js.Array[String] = null): UpdateSlidesPositionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertionIndex)) __obj.updateDynamic("insertionIndex")(insertionIndex.get.asInstanceOf[js.Any])
    if (slideObjectIds != null) __obj.updateDynamic("slideObjectIds")(slideObjectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSlidesPositionRequest]
  }
}

