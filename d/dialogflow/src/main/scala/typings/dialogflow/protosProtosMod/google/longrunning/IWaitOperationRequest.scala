package typings.dialogflow.protosProtosMod.google.longrunning

import typings.dialogflow.protosProtosMod.google.protobuf.IDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a WaitOperationRequest. */
trait IWaitOperationRequest extends js.Object {
  /** WaitOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** WaitOperationRequest timeout */
  var timeout: js.UndefOr[IDuration | Null] = js.undefined
}

object IWaitOperationRequest {
  @scala.inline
  def apply(name: String = null, timeout: IDuration = null): IWaitOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[IWaitOperationRequest]
  }
}

