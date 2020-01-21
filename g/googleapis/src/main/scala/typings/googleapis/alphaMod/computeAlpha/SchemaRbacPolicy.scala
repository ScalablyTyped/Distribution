package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRbacPolicy extends js.Object {
  /**
    * Name of the RbacPolicy.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of permissions.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
  /**
    * The list of principals.
    */
  var principals: js.UndefOr[js.Array[SchemaPrincipal]] = js.native
}

object SchemaRbacPolicy {
  @scala.inline
  def apply(
    name: String = null,
    permissions: js.Array[SchemaPermission] = null,
    principals: js.Array[SchemaPrincipal] = null
  ): SchemaRbacPolicy = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (principals != null) __obj.updateDynamic("principals")(principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRbacPolicy]
  }
}

