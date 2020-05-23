package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

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
  def apply(
    parent: js.UndefOr[Null | String] = js.undefined,
    sessionEntityType: js.UndefOr[Null | ISessionEntityType] = js.undefined
  ): ICreateSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionEntityType)) __obj.updateDynamic("sessionEntityType")(sessionEntityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateSessionEntityTypeRequest]
  }
}

