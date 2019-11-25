package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceAccountResponse extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object GetServiceAccountResponse {
  @scala.inline
  def apply(email: String = null, kind: String = null): GetServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceAccountResponse]
  }
}

