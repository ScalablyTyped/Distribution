package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account sign blob request.
  */
@js.native
trait Schema$SignBlobRequest extends js.Object {
  /**
    * The bytes to sign.
    */
  var bytesToSign: js.UndefOr[String] = js.native
}

object Schema$SignBlobRequest {
  @scala.inline
  def apply(bytesToSign: String = null): Schema$SignBlobRequest = {
    val __obj = js.Dynamic.literal()
    if (bytesToSign != null) __obj.updateDynamic("bytesToSign")(bytesToSign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SignBlobRequest]
  }
}

