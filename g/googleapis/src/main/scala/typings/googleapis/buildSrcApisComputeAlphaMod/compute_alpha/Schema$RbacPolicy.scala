package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RbacPolicy extends js.Object {
  /**
    * Name of the RbacPolicy.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of permissions.
    */
  var permissions: js.UndefOr[js.Array[Schema$Permission]] = js.native
  /**
    * The list of principals.
    */
  var principals: js.UndefOr[js.Array[Schema$Principal]] = js.native
}

object Schema$RbacPolicy {
  @scala.inline
  def apply(
    name: String = null,
    permissions: js.Array[Schema$Permission] = null,
    principals: js.Array[Schema$Principal] = null
  ): Schema$RbacPolicy = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (principals != null) __obj.updateDynamic("principals")(principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RbacPolicy]
  }
}

