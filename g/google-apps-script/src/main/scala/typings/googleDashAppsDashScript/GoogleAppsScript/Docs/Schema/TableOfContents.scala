package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOfContents extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
}

object TableOfContents {
  @scala.inline
  def apply(
    content: js.Array[StructuralElement] = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null
  ): TableOfContents = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds)
    __obj.asInstanceOf[TableOfContents]
  }
}

