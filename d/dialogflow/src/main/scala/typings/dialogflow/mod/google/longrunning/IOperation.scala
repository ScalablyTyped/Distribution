package typings.dialogflow.mod.google.longrunning

import typings.dialogflow.mod.google.protobuf.IAny
import typings.dialogflow.mod.google.rpc.IStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Operation. */
trait IOperation extends js.Object {
  /** Operation done */
  var done: js.UndefOr[Boolean | Null] = js.undefined
  /** Operation error */
  var error: js.UndefOr[IStatus | Null] = js.undefined
  /** Operation metadata */
  var metadata: js.UndefOr[IAny | Null] = js.undefined
  /** Operation name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** Operation response */
  var response: js.UndefOr[IAny | Null] = js.undefined
}

object IOperation {
  @scala.inline
  def apply(
    done: js.UndefOr[Boolean] = js.undefined,
    error: IStatus = null,
    metadata: IAny = null,
    name: String = null,
    response: IAny = null
  ): IOperation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOperation]
  }
}

