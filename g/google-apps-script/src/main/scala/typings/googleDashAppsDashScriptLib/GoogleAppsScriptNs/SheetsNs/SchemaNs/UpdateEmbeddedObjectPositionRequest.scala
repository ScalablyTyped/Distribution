package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEmbeddedObjectPositionRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var newPosition: js.UndefOr[EmbeddedObjectPosition] = js.undefined
  var objectId: js.UndefOr[scala.Double] = js.undefined
}

object UpdateEmbeddedObjectPositionRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    newPosition: EmbeddedObjectPosition = null,
    objectId: scala.Int | scala.Double = null
  ): UpdateEmbeddedObjectPositionRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (newPosition != null) __obj.updateDynamic("newPosition")(newPosition)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmbeddedObjectPositionRequest]
  }
}

