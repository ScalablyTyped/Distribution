package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionedObject extends js.Object {
  var objectId: js.UndefOr[String] = js.undefined
  var positionedObjectProperties: js.UndefOr[PositionedObjectProperties] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedInsertionId: js.UndefOr[String] = js.undefined
  var suggestedPositionedObjectPropertiesChanges: js.UndefOr[js.Object] = js.undefined
}

object PositionedObject {
  @scala.inline
  def apply(
    objectId: String = null,
    positionedObjectProperties: PositionedObjectProperties = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionId: String = null,
    suggestedPositionedObjectPropertiesChanges: js.Object = null
  ): PositionedObject = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (positionedObjectProperties != null) __obj.updateDynamic("positionedObjectProperties")(positionedObjectProperties.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionId != null) __obj.updateDynamic("suggestedInsertionId")(suggestedInsertionId.asInstanceOf[js.Any])
    if (suggestedPositionedObjectPropertiesChanges != null) __obj.updateDynamic("suggestedPositionedObjectPropertiesChanges")(suggestedPositionedObjectPropertiesChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionedObject]
  }
}

