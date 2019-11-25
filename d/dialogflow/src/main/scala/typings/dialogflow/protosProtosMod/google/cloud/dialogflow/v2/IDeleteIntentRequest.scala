package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteIntentRequest. */
trait IDeleteIntentRequest extends js.Object {
  /** DeleteIntentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IDeleteIntentRequest {
  @scala.inline
  def apply(name: String = null): IDeleteIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteIntentRequest]
  }
}

