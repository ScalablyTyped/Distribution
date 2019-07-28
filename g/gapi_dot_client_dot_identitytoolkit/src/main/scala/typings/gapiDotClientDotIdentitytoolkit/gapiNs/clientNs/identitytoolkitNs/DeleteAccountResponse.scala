package typings.gapiDotClientDotIdentitytoolkit.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAccountResponse extends js.Object {
  /** The fixed string "identitytoolkit#DeleteAccountResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object DeleteAccountResponse {
  @scala.inline
  def apply(kind: String = null): DeleteAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DeleteAccountResponse]
  }
}

