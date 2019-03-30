package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLineCategoryRequest extends js.Object {
  var lineCategory: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateLineCategoryRequest {
  @scala.inline
  def apply(lineCategory: java.lang.String = null, objectId: java.lang.String = null): UpdateLineCategoryRequest = {
    val __obj = js.Dynamic.literal()
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[UpdateLineCategoryRequest]
  }
}

