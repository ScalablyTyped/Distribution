package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$UndeleteServiceAccountResponse extends js.Object {
  /**
    * Metadata for the restored service account.
    */
  var restoredAccount: js.UndefOr[Schema$ServiceAccount] = js.native
}

object Schema$UndeleteServiceAccountResponse {
  @scala.inline
  def apply(restoredAccount: Schema$ServiceAccount = null): Schema$UndeleteServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (restoredAccount != null) __obj.updateDynamic("restoredAccount")(restoredAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UndeleteServiceAccountResponse]
  }
}

