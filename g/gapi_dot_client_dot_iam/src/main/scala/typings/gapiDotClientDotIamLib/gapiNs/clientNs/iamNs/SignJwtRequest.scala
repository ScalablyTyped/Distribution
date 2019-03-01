package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignJwtRequest extends js.Object {
  /** The JWT payload to sign, a JSON JWT Claim set. */
  var payload: js.UndefOr[java.lang.String] = js.undefined
}

object SignJwtRequest {
  @scala.inline
  def apply(payload: java.lang.String = null): SignJwtRequest = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[SignJwtRequest]
  }
}

