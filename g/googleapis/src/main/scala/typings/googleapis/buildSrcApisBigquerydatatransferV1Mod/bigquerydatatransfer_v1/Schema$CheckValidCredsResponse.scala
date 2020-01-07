package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response indicating whether the credentials exist and are valid.
  */
@js.native
trait Schema$CheckValidCredsResponse extends js.Object {
  /**
    * If set to `true`, the credentials exist and are valid.
    */
  var hasValidCreds: js.UndefOr[Boolean] = js.native
}

object Schema$CheckValidCredsResponse {
  @scala.inline
  def apply(hasValidCreds: js.UndefOr[Boolean] = js.undefined): Schema$CheckValidCredsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasValidCreds)) __obj.updateDynamic("hasValidCreds")(hasValidCreds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CheckValidCredsResponse]
  }
}

