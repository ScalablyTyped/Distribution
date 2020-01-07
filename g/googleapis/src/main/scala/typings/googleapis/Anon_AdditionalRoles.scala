package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AdditionalRoles extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[String]] = js.native
  var primaryRole: js.UndefOr[String] = js.native
}

object Anon_AdditionalRoles {
  @scala.inline
  def apply(additionalRoles: js.Array[String] = null, primaryRole: String = null): Anon_AdditionalRoles = {
    val __obj = js.Dynamic.literal()
    if (additionalRoles != null) __obj.updateDynamic("additionalRoles")(additionalRoles.asInstanceOf[js.Any])
    if (primaryRole != null) __obj.updateDynamic("primaryRole")(primaryRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdditionalRoles]
  }
}

