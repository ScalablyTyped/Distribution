package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckValidCredsResponse extends js.Object {
  /** If set to `true`, the credentials exist and are valid. */
  var hasValidCreds: js.UndefOr[scala.Boolean] = js.undefined
}

object CheckValidCredsResponse {
  @scala.inline
  def apply(hasValidCreds: js.UndefOr[scala.Boolean] = js.undefined): CheckValidCredsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasValidCreds)) __obj.updateDynamic("hasValidCreds")(hasValidCreds)
    __obj.asInstanceOf[CheckValidCredsResponse]
  }
}

