package typings.firebaseAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
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

object AnonEnabled {
  @scala.inline
  def apply(enabled: Boolean, passwordRequired: js.UndefOr[Boolean] = js.undefined): AnonEnabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnabled]
  }
}

