package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a table.
  */
@js.native
trait Schema$CreateTableResponse extends js.Object {
  /**
    * The object ID of the created table.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$CreateTableResponse {
  @scala.inline
  def apply(objectId: String = null): Schema$CreateTableResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateTableResponse]
  }
}

