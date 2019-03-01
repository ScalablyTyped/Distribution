package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceAccountResponse extends js.Object {
  /** The service account email address. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** The resource type of the response. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object GetServiceAccountResponse {
  @scala.inline
  def apply(email: java.lang.String = null, kind: java.lang.String = null): GetServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[GetServiceAccountResponse]
  }
}

