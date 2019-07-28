package typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceAccountResponse extends js.Object {
  /** The service account email address. */
  var email: js.UndefOr[String] = js.undefined
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.undefined
}

object GetServiceAccountResponse {
  @scala.inline
  def apply(email: String = null, kind: String = null): GetServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[GetServiceAccountResponse]
  }
}

