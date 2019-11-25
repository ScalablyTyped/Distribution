package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutPlaceholderIdMapping extends js.Object {
  var layoutPlaceholder: js.UndefOr[Placeholder] = js.undefined
  var layoutPlaceholderObjectId: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
}

object LayoutPlaceholderIdMapping {
  @scala.inline
  def apply(
    layoutPlaceholder: Placeholder = null,
    layoutPlaceholderObjectId: String = null,
    objectId: String = null
  ): LayoutPlaceholderIdMapping = {
    val __obj = js.Dynamic.literal()
    if (layoutPlaceholder != null) __obj.updateDynamic("layoutPlaceholder")(layoutPlaceholder.asInstanceOf[js.Any])
    if (layoutPlaceholderObjectId != null) __obj.updateDynamic("layoutPlaceholderObjectId")(layoutPlaceholderObjectId.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutPlaceholderIdMapping]
  }
}

