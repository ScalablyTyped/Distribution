package typings.atGoogleDashCloudStorage.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccount extends js.Object {
  var emailAddress: js.UndefOr[String] = js.undefined
}

object ServiceAccount {
  @scala.inline
  def apply(emailAddress: String = null): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccount]
  }
}

