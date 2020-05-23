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
    done: js.UndefOr[Null | Boolean] = js.undefined,
    error: js.UndefOr[Null | IStatus] = js.undefined,
    metadata: js.UndefOr[Null | IAny] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    response: js.UndefOr[Null | IAny] = js.undefined
  ): IOperation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(metadata)) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(response)) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOperation]
  }
}

