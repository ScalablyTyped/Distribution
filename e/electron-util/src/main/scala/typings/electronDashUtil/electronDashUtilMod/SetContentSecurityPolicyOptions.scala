package typings.electronDashUtil.electronDashUtilMod

import typings.electron.electronMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetContentSecurityPolicyOptions extends js.Object {
  /**
  	The session to apply the policy to.
  	Default: [`electron.session.defaultSession`](https://electronjs.org/docs/api/session#sessiondefaultsession)
  	*/
  val session: js.UndefOr[Session] = js.undefined
}

object SetContentSecurityPolicyOptions {
  @scala.inline
  def apply(session: Session = null): SetContentSecurityPolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetContentSecurityPolicyOptions]
  }
}

