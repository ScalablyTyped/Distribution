package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response indicating whether the credentials exist and are valid.
  */
@js.native
trait SchemaCheckValidCredsResponse extends js.Object {
  /**
    * If set to `true`, the credentials exist and are valid.
    */
  var hasValidCreds: js.UndefOr[Boolean] = js.native
}

object SchemaCheckValidCredsResponse {
  @scala.inline
  def apply(hasValidCreds: js.UndefOr[Boolean] = js.undefined): SchemaCheckValidCredsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasValidCreds)) __obj.updateDynamic("hasValidCreds")(hasValidCreds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCheckValidCredsResponse]
  }
}

