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
    if (clientEmail != null) __obj.updateDynamic("clientEmail")(clientEmail)
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ServiceAccount]
  }
}

