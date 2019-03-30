package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FootnoteReference extends js.Object {
  var footnoteId: js.UndefOr[java.lang.String] = js.undefined
  var footnoteNumber: js.UndefOr[java.lang.String] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggestedInsertionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object FootnoteReference {
  @scala.inline
  def apply(
    footnoteId: java.lang.String = null,
    footnoteNumber: java.lang.String = null,
    suggestedDeletionIds: js.Array[java.lang.String] = null,
    suggestedInsertionIds: js.Array[java.lang.String] = null,
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

