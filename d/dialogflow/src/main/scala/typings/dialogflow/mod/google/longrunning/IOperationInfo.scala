package typings.dialogflow.mod.google.longrunning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OperationInfo. */
trait IOperationInfo extends js.Object {
  /** OperationInfo metadataType */
  var metadataType: js.UndefOr[String | Null] = js.undefined
  /** OperationInfo responseType */
  var responseType: js.UndefOr[String | Null] = js.undefined
}

object IOperationInfo {
  @scala.inline
  def apply(
    metadataType: js.UndefOr[Null | String] = js.undefined,
    responseType: js.UndefOr[Null | String] = js.undefined
  ): IOperationInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(metadataType)) __obj.updateDynamic("metadataType")(metadataType.asInstanceOf[js.Any])
    if (!js.isUndefined(responseType)) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOperationInfo]
  }
}

