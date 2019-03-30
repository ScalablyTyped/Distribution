package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOfContents extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggestedInsertionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TableOfContents {
  @scala.inline
  def apply(
    content: js.Array[StructuralElement] = null,
    suggestedDeletionIds: js.Array[java.lang.String] = null,
    suggestedInsertionIds: js.Array[java.lang.String] = null
  ): TableOfContents = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds)
    __obj.asInstanceOf[TableOfContents]
  }
}

