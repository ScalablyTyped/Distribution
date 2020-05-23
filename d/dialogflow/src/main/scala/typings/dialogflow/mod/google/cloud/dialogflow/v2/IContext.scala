package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Context. */
trait IContext extends js.Object {
  /** Context lifespanCount */
  var lifespanCount: js.UndefOr[Double | Null] = js.undefined
  /** Context name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** Context parameters */
  var parameters: js.UndefOr[IStruct | Null] = js.undefined
}

object IContext {
  @scala.inline
  def apply(
    lifespanCount: js.UndefOr[Null | Double] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    parameters: js.UndefOr[Null | IStruct] = js.undefined
  ): IContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lifespanCount)) __obj.updateDynamic("lifespanCount")(lifespanCount.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(parameters)) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContext]
  }
}

