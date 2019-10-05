package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePageElementTransformRequest extends js.Object {
  var applyMode: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.AffineTransform] = js.undefined
}

object UpdatePageElementTransformRequest {
  @scala.inline
  def apply(
    applyMode: String = null,
    objectId: String = null,
    transform: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.AffineTransform = null
  ): UpdatePageElementTransformRequest = {
    val __obj = js.Dynamic.literal()
    if (applyMode != null) __obj.updateDynamic("applyMode")(applyMode)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[UpdatePageElementTransformRequest]
  }
}

