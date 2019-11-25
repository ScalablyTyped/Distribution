package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSlidesPositionRequest extends js.Object {
  var insertionIndex: js.UndefOr[Double] = js.undefined
  var slideObjectIds: js.UndefOr[js.Array[String]] = js.undefined
}

object UpdateSlidesPositionRequest {
  @scala.inline
  def apply(insertionIndex: Int | Double = null, slideObjectIds: js.Array[String] = null): UpdateSlidesPositionRequest = {
    val __obj = js.Dynamic.literal()
    if (insertionIndex != null) __obj.updateDynamic("insertionIndex")(insertionIndex.asInstanceOf[js.Any])
    if (slideObjectIds != null) __obj.updateDynamic("slideObjectIds")(slideObjectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSlidesPositionRequest]
  }
}

