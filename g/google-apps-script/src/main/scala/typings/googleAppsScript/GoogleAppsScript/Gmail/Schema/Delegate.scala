package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  var delegateEmail: js.UndefOr[String] = js.undefined
  var verificationStatus: js.UndefOr[String] = js.undefined
}

object Delegate {
  @scala.inline
  def apply(delegateEmail: String = null, verificationStatus: String = null): Delegate = {
    val __obj = js.Dynamic.literal()
    if (delegateEmail != null) __obj.updateDynamic("delegateEmail")(delegateEmail.asInstanceOf[js.Any])
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delegate]
  }
}

