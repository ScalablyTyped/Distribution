package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  var delegateEmail: js.UndefOr[java.lang.String] = js.undefined
  var verificationStatus: js.UndefOr[java.lang.String] = js.undefined
}

object Delegate {
  @scala.inline
  def apply(delegateEmail: java.lang.String = null, verificationStatus: java.lang.String = null): Delegate = {
    val __obj = js.Dynamic.literal()
    if (delegateEmail != null) __obj.updateDynamic("delegateEmail")(delegateEmail)
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus)
    __obj.asInstanceOf[Delegate]
  }
}

