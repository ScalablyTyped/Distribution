package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The patch service account request.
  */
@js.native
trait Schema$PatchServiceAccountRequest extends js.Object {
  var serviceAccount: js.UndefOr[Schema$ServiceAccount] = js.native
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$PatchServiceAccountRequest {
  @scala.inline
  def apply(serviceAccount: Schema$ServiceAccount = null, updateMask: String = null): Schema$PatchServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PatchServiceAccountRequest]
  }
}

