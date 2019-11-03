package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CreateContextRequest. */
trait ICreateContextRequest extends js.Object {
  /** CreateContextRequest context */
  var context: js.UndefOr[IContext | Null] = js.undefined
  /** CreateContextRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object ICreateContextRequest {
  @scala.inline
  def apply(context: IContext = null, parent: String = null): ICreateContextRequest = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ICreateContextRequest]
  }
}

