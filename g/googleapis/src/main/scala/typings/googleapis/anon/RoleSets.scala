package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleSets extends js.Object {
  var roleSets: js.UndefOr[js.Array[AdditionalRoles]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object RoleSets {
  @scala.inline
  def apply(roleSets: js.Array[AdditionalRoles] = null, `type`: String = null): RoleSets = {
    val __obj = js.Dynamic.literal()
    if (roleSets != null) __obj.updateDynamic("roleSets")(roleSets.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleSets]
  }
}

