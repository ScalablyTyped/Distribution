package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TrainAgentRequest. */
trait ITrainAgentRequest extends js.Object {
  /** TrainAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object ITrainAgentRequest {
  @scala.inline
  def apply(parent: js.UndefOr[Null | String] = js.undefined): ITrainAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrainAgentRequest]
  }
}

