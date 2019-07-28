package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoText extends js.Object {
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AutoText {
  @scala.inline
  def apply(
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    suggestedTextStyleChanges: js.Object = null,
    textStyle: TextStyle = null,
    `type`: String = null
  ): AutoText = {
    val __obj = js.Dynamic.literal()
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds)
    if (suggestedTextStyleChanges != null) __obj.updateDynamic("suggestedTextStyleChanges")(suggestedTextStyleChanges)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AutoText]
  }
}

