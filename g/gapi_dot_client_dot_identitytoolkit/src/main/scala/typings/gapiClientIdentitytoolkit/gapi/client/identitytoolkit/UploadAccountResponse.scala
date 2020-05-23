package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typings.gapiClientIdentitytoolkit.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadAccountResponse extends js.Object {
  /** The error encountered while processing the account info. */
  var error: js.UndefOr[js.Array[Index]] = js.undefined
  /** The fixed string "identitytoolkit#UploadAccountResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object UploadAccountResponse {
  @scala.inline
  def apply(error: js.Array[Index] = null, kind: String = null): UploadAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadAccountResponse]
  }
}

