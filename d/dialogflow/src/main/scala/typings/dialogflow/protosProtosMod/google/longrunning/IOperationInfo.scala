package typings.dialogflow.protosProtosMod.google.longrunning

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
  def apply(metadataType: String = null, responseType: String = null): IOperationInfo = {
    val __obj = js.Dynamic.literal()
    if (metadataType != null) __obj.updateDynamic("metadataType")(metadataType)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    __obj.asInstanceOf[IOperationInfo]
  }
}

