package typings.firebaseDashAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  /**
    * Whether email provider is enabled.
    */
  var enabled: Boolean
  /**
    * Whether password is required for email sign-in. When not required,
    * email sign-in can be performed with password or via email link sign-in.
    */
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
}

object Anon_Enabled {
  @scala.inline
  def apply(enabled: Boolean, passwordRequired: js.UndefOr[Boolean] = js.undefined): Anon_Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enabled]
  }
}

