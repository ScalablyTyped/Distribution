package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Respone of deleting account.
  */
@js.native
trait Schema$DeleteAccountResponse extends js.Object {
  /**
    * The fixed string &quot;identitytoolkit#DeleteAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$DeleteAccountResponse {
  @scala.inline
  def apply(kind: String = null): Schema$DeleteAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteAccountResponse]
  }
}

