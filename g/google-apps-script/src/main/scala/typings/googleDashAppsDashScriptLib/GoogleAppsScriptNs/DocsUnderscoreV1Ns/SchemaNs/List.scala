package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var listProperties: js.UndefOr[ListProperties] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggestedInsertionId: js.UndefOr[java.lang.String] = js.undefined
  var suggestedListPropertiesChanges: js.UndefOr[js.Object] = js.undefined
}

object List {
  @scala.inline
  def apply(
    listProperties: ListProperties = null,
    suggestedDeletionIds: js.Array[java.lang.String] = null,
    suggestedInsertionId: java.lang.String = null,
    suggestedListPropertiesChanges: js.Object = null
  ): List = {
    val __obj = js.Dynamic.literal()
    if (listProperties != null) __obj.updateDynamic("listProperties")(listProperties)
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInsertionId != null) __obj.updateDynamic("suggestedInsertionId")(suggestedInsertionId)
    if (suggestedListPropertiesChanges != null) __obj.updateDynamic("suggestedListPropertiesChanges")(suggestedListPropertiesChanges)
    __obj.asInstanceOf[List]
  }
}

