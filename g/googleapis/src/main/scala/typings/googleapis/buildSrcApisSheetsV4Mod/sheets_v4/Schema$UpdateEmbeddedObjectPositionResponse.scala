package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of updating an embedded object&#39;s position.
  */
@js.native
trait Schema$UpdateEmbeddedObjectPositionResponse extends js.Object {
  /**
    * The new position of the embedded object.
    */
  var position: js.UndefOr[Schema$EmbeddedObjectPosition] = js.native
}

object Schema$UpdateEmbeddedObjectPositionResponse {
  @scala.inline
  def apply(position: Schema$EmbeddedObjectPosition = null): Schema$UpdateEmbeddedObjectPositionResponse = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateEmbeddedObjectPositionResponse]
  }
}

