package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateContextRequest. */
trait IUpdateContextRequest extends js.Object {
  /** UpdateContextRequest context */
  var context: js.UndefOr[IContext | Null] = js.undefined
  /** UpdateContextRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateContextRequest {
  @scala.inline
  def apply(context: IContext = null, updateMask: IFieldMask = null): IUpdateContextRequest = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateContextRequest]
  }
}

