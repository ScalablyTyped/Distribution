package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var listProperties: js.UndefOr[ListProperties] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedInsertionId: js.UndefOr[String] = js.undefined
  var suggestedListPropertiesChanges: js.UndefOr[js.Object] = js.undefined
}

object List {
  @scala.inline
  def apply(
    listProperties: ListProperties = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionId: String = null,
    suggestedListPropertiesChanges: js.Object = null
  ): List = {
    val __obj = js.Dynamic.literal()
    if (listProperties != null) __obj.updateDynamic("listProperties")(listProperties.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionId != null) __obj.updateDynamic("suggestedInsertionId")(suggestedInsertionId.asInstanceOf[js.Any])
    if (suggestedListPropertiesChanges != null) __obj.updateDynamic("suggestedListPropertiesChanges")(suggestedListPropertiesChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

