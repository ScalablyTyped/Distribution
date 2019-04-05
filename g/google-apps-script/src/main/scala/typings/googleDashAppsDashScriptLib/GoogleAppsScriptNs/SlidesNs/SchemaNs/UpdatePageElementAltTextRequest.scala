package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePageElementAltTextRequest extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object UpdatePageElementAltTextRequest {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    objectId: java.lang.String = null,
    title: java.lang.String = null
  ): UpdatePageElementAltTextRequest = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UpdatePageElementAltTextRequest]
  }
}

