package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_RoleSets extends js.Object {
  var roleSets: js.UndefOr[js.Array[Anon_AdditionalRoles]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Anon_RoleSets {
  @scala.inline
  def apply(roleSets: js.Array[Anon_AdditionalRoles] = null, `type`: String = null): Anon_RoleSets = {
    val __obj = js.Dynamic.literal()
    if (roleSets != null) __obj.updateDynamic("roleSets")(roleSets.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RoleSets]
  }
}

