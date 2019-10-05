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
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (positionedObjectProperties != null) __obj.updateDynamic("positionedObjectProperties")(positionedObjectProperties)
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInsertionId != null) __obj.updateDynamic("suggestedInsertionId")(suggestedInsertionId)
    if (suggestedPositionedObjectPropertiesChanges != null) __obj.updateDynamic("suggestedPositionedObjectPropertiesChanges")(suggestedPositionedObjectPropertiesChanges)
    __obj.asInstanceOf[PositionedObject]
  }
}

