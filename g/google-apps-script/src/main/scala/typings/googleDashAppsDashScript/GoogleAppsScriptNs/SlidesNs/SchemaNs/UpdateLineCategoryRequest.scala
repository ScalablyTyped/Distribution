package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

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
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[UpdateLineCategoryRequest]
  }
}

