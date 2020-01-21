package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteEntityTypeRequest. */
trait IDeleteEntityTypeRequest extends js.Object {
  /** DeleteEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IDeleteEntityTypeRequest {
  @scala.inline
  def apply(name: String = null): IDeleteEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteEntityTypeRequest]
  }
}

