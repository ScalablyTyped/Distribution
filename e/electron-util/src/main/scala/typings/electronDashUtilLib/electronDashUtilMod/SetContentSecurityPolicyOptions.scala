package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetContentSecurityPolicyOptions extends js.Object {
  /**
  	The session to apply the policy to.
  	Default: [`electron.session.defaultSession`](https://electronjs.org/docs/api/session#sessiondefaultsession)
  	*/
  val session: js.UndefOr[electronLib.electronMod.Session] = js.undefined
}

object SetContentSecurityPolicyOptions {
  @scala.inline
  def apply(session: electronLib.electronMod.Session = null): SetContentSecurityPolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[SetContentSecurityPolicyOptions]
  }
}

