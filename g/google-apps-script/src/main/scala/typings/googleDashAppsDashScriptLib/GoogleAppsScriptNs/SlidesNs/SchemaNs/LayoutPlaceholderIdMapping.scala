package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutPlaceholderIdMapping extends js.Object {
  var layoutPlaceholder: js.UndefOr[Placeholder] = js.undefined
  var layoutPlaceholderObjectId: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object LayoutPlaceholderIdMapping {
  @scala.inline
  def apply(
    layoutPlaceholder: Placeholder = null,
    layoutPlaceholderObjectId: java.lang.String = null,
    objectId: java.lang.String = null
  ): LayoutPlaceholderIdMapping = {
    val __obj = js.Dynamic.literal()
    if (layoutPlaceholder != null) __obj.updateDynamic("layoutPlaceholder")(layoutPlaceholder)
    if (layoutPlaceholderObjectId != null) __obj.updateDynamic("layoutPlaceholderObjectId")(layoutPlaceholderObjectId)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[LayoutPlaceholderIdMapping]
  }
}

