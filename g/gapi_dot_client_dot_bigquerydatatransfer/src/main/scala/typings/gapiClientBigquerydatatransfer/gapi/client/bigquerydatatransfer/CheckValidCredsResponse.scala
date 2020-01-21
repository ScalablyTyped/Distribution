package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckValidCredsResponse extends js.Object {
  /** If set to `true`, the credentials exist and are valid. */
  var hasValidCreds: js.UndefOr[Boolean] = js.undefined
}

object CheckValidCredsResponse {
  @scala.inline
  def apply(hasValidCreds: js.UndefOr[Boolean] = js.undefined): CheckValidCredsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasValidCreds)) __obj.updateDynamic("hasValidCreds")(hasValidCreds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckValidCredsResponse]
  }
}

