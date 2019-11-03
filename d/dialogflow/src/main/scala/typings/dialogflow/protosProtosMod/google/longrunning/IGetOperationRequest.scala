package typings.dialogflow.protosProtosMod.google.longrunning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetOperationRequest. */
trait IGetOperationRequest extends js.Object {
  /** GetOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetOperationRequest {
  @scala.inline
  def apply(name: String = null): IGetOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IGetOperationRequest]
  }
}

