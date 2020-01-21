package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountGoogleMyBusinessLink extends js.Object {
  var gmbEmail: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object AccountGoogleMyBusinessLink {
  @scala.inline
  def apply(gmbEmail: String = null, status: String = null): AccountGoogleMyBusinessLink = {
    val __obj = js.Dynamic.literal()
    if (gmbEmail != null) __obj.updateDynamic("gmbEmail")(gmbEmail.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountGoogleMyBusinessLink]
  }
}

