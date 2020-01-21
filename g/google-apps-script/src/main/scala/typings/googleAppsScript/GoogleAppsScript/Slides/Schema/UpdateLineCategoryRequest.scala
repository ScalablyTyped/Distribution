package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLineCategoryRequest extends js.Object {
  var lineCategory: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
}

object UpdateLineCategoryRequest {
  @scala.inline
  def apply(lineCategory: String = null, objectId: String = null): UpdateLineCategoryRequest = {
    val __obj = js.Dynamic.literal()
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLineCategoryRequest]
  }
}

