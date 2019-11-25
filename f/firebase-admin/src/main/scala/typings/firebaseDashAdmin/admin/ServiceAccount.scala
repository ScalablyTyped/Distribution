package typings.firebaseDashAdmin.admin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccount extends js.Object {
  var clientEmail: js.UndefOr[String] = js.undefined
  var privateKey: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
}

object ServiceAccount {
  @scala.inline
  def apply(clientEmail: String = null, privateKey: String = null, projectId: String = null): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (clientEmail != null) __obj.updateDynamic("clientEmail")(clientEmail.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccount]
  }
}

