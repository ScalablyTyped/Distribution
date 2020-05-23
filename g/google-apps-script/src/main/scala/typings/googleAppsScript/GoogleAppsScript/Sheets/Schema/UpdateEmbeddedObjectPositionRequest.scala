package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEmbeddedObjectPositionRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var newPosition: js.UndefOr[EmbeddedObjectPosition] = js.undefined
  var objectId: js.UndefOr[Double] = js.undefined
}

object UpdateEmbeddedObjectPositionRequest {
  @scala.inline
  def apply(
    fields: String = null,
    newPosition: EmbeddedObjectPosition = null,
    objectId: js.UndefOr[Double] = js.undefined
  ): UpdateEmbeddedObjectPositionRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (newPosition != null) __obj.updateDynamic("newPosition")(newPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(objectId)) __obj.updateDynamic("objectId")(objectId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmbeddedObjectPositionRequest]
  }
}

