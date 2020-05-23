package typings.googleCloudPubsub.protosMod.google.iam.v1

import typings.googleCloudPubsub.protosMod.google.`type`.IExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Binding. */
trait IBinding extends js.Object {
  /** Binding condition */
  var condition: js.UndefOr[IExpr | Null] = js.undefined
  /** Binding members */
  var members: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** Binding role */
  var role: js.UndefOr[String | Null] = js.undefined
}

object IBinding {
  @scala.inline
  def apply(
    condition: js.UndefOr[Null | IExpr] = js.undefined,
    members: js.UndefOr[Null | js.Array[String]] = js.undefined,
    role: js.UndefOr[Null | String] = js.undefined
  ): IBinding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(condition)) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (!js.isUndefined(members)) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (!js.isUndefined(role)) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBinding]
  }
}

