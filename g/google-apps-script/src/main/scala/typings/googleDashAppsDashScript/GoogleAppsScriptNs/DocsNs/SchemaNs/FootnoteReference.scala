package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FootnoteReference extends js.Object {
  var footnoteId: js.UndefOr[String] = js.undefined
  var footnoteNumber: js.UndefOr[String] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object FootnoteReference {
  @scala.inline
  def apply(
    footnoteId: String = null,
    footnoteNumber: String = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    suggestedTextStyleChanges: js.Object = null,
    textStyle: TextStyle = null
  ): FootnoteReference = {
    val __obj = js.Dynamic.literal()
    if (footnoteId != null) __obj.updateDynamic("footnoteId")(footnoteId)
    if (footnoteNumber != null) __obj.updateDynamic("footnoteNumber")(footnoteNumber)
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds)
    if (suggestedTextStyleChanges != null) __obj.updateDynamic("suggestedTextStyleChanges")(suggestedTextStyleChanges)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[FootnoteReference]
  }
}

