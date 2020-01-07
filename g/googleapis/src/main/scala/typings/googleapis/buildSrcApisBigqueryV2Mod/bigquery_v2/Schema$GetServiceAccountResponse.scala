package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GetServiceAccountResponse extends js.Object {
  /**
    * The service account email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$GetServiceAccountResponse {
  @scala.inline
  def apply(email: String = null, kind: String = null): Schema$GetServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetServiceAccountResponse]
  }
}

