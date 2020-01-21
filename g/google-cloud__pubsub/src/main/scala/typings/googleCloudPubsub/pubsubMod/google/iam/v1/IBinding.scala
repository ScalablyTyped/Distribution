package typings.googleCloudPubsub.pubsubMod.google.iam.v1

import typings.googleCloudPubsub.pubsubMod.google.`type`.IExpr
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
  def apply(condition: IExpr = null, members: js.Array[String] = null, role: String = null): IBinding = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBinding]
  }
}

