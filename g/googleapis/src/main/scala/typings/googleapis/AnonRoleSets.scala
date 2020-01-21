package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRoleSets extends js.Object {
  var roleSets: js.UndefOr[js.Array[AnonAdditionalRoles]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonRoleSets {
  @scala.inline
  def apply(roleSets: js.Array[AnonAdditionalRoles] = null, `type`: String = null): AnonRoleSets = {
    val __obj = js.Dynamic.literal()
    if (roleSets != null) __obj.updateDynamic("roleSets")(roleSets.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRoleSets]
  }
}

