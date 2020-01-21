package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteSessionEntityTypeRequest. */
trait IDeleteSessionEntityTypeRequest extends js.Object {
  /** DeleteSessionEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IDeleteSessionEntityTypeRequest {
  @scala.inline
  def apply(name: String = null): IDeleteSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteSessionEntityTypeRequest]
  }
}

