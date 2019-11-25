package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CreateSessionEntityTypeRequest. */
trait ICreateSessionEntityTypeRequest extends js.Object {
  /** CreateSessionEntityTypeRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  /** CreateSessionEntityTypeRequest sessionEntityType */
  var sessionEntityType: js.UndefOr[ISessionEntityType | Null] = js.undefined
}

object ICreateSessionEntityTypeRequest {
  @scala.inline
  def apply(parent: String = null, sessionEntityType: ISessionEntityType = null): ICreateSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (sessionEntityType != null) __obj.updateDynamic("sessionEntityType")(sessionEntityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateSessionEntityTypeRequest]
  }
}

