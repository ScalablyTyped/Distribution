package typings
package atGoogleDashCloudStorageLib.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccount extends js.Object {
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceAccount {
  @scala.inline
  def apply(emailAddress: java.lang.String = null): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    __obj.asInstanceOf[ServiceAccount]
  }
}

