package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRun extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggestedInsertionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object TextRun {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    suggestedDeletionIds: js.Array[java.lang.String] = null,
    suggestedInsertionIds: js.Array[java.lang.String] = null,
    suggestedTextStyleChanges: js.Object = null,
    textStyle: TextStyle = null
  ): TextRun = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds)
    if (suggestedTextStyleChanges != null) __obj.updateDynamic("suggestedTextStyleChanges")(suggestedTextStyleChanges)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[TextRun]
  }
}

