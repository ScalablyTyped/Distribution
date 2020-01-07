package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JWT credentials for a service account.
  */
@js.native
trait Schema$ServiceAccountJwtAccessCredentials extends js.Object {
  /**
    * Service account key.
    */
  var jsonKey: js.UndefOr[String] = js.native
  /**
    * The token lifetime seconds.
    */
  var tokenLifetimeSeconds: js.UndefOr[String] = js.native
}

object Schema$ServiceAccountJwtAccessCredentials {
  @scala.inline
  def apply(jsonKey: String = null, tokenLifetimeSeconds: String = null): Schema$ServiceAccountJwtAccessCredentials = {
    val __obj = js.Dynamic.literal()
    if (jsonKey != null) __obj.updateDynamic("jsonKey")(jsonKey.asInstanceOf[js.Any])
    if (tokenLifetimeSeconds != null) __obj.updateDynamic("tokenLifetimeSeconds")(tokenLifetimeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServiceAccountJwtAccessCredentials]
  }
}

