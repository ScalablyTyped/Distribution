package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineObject extends js.Object {
  var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggestedInlineObjectPropertiesChanges: js.UndefOr[js.Object] = js.undefined
  var suggestedInsertionId: js.UndefOr[java.lang.String] = js.undefined
}

object InlineObject {
  @scala.inline
  def apply(
    inlineObjectProperties: InlineObjectProperties = null,
    objectId: java.lang.String = null,
    suggestedDeletionIds: js.Array[java.lang.String] = null,
    suggestedInlineObjectPropertiesChanges: js.Object = null,
    suggestedInsertionId: java.lang.String = null
  ): InlineObject = {
    val __obj = js.Dynamic.literal()
    if (inlineObjectProperties != null) __obj.updateDynamic("inlineObjectProperties")(inlineObjectProperties)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInlineObjectPropertiesChanges != null) __obj.updateDynamic("suggestedInlineObjectPropertiesChanges")(suggestedInlineObjectPropertiesChanges)
    if (suggestedInsertionId != null) __obj.updateDynamic("suggestedInsertionId")(suggestedInsertionId)
    __obj.asInstanceOf[InlineObject]
  }
}

