package typings
package firebaseDashAdminLib.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccount extends js.Object {
  var clientEmail: js.UndefOr[java.lang.String] = js.undefined
  var privateKey: js.UndefOr[java.lang.String] = js.undefined
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceAccount {
  @scala.inline
  def apply(
    clientEmail: java.lang.String = null,
    privateKey: java.lang.String = null,
    projectId: java.lang.String = null
  ): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (clientEmail != null) __obj.updateDynamic("clientEmail")(clientEmail)
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ServiceAccount]
  }
}

