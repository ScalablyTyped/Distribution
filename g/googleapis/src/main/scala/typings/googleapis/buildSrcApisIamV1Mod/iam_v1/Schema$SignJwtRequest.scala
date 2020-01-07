package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account sign JWT request.
  */
@js.native
trait Schema$SignJwtRequest extends js.Object {
  /**
    * The JWT payload to sign, a JSON JWT Claim set.
    */
  var payload: js.UndefOr[String] = js.native
}

object Schema$SignJwtRequest {
  @scala.inline
  def apply(payload: String = null): Schema$SignJwtRequest = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SignJwtRequest]
  }
}

