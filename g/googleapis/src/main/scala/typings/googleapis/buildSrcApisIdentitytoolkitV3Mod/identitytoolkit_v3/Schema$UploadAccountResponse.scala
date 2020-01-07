package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import typings.googleapis.Anon_Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Respone of uploading accounts in batch.
  */
@js.native
trait Schema$UploadAccountResponse extends js.Object {
  /**
    * The error encountered while processing the account info.
    */
  var error: js.UndefOr[js.Array[Anon_Index]] = js.native
  /**
    * The fixed string &quot;identitytoolkit#UploadAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$UploadAccountResponse {
  @scala.inline
  def apply(error: js.Array[Anon_Index] = null, kind: String = null): Schema$UploadAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UploadAccountResponse]
  }
}

