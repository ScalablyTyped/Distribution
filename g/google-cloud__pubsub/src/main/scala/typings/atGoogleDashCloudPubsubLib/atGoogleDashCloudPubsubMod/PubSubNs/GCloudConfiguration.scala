package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @version: Google PubSub 0.18.0
  */
trait GCloudConfiguration extends js.Object {
  var apiEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var autoRetry: js.UndefOr[scala.Boolean] = js.undefined
  var credentials: js.UndefOr[atGoogleDashCloudPubsubLib.Anon_Clientemail] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var keyFilename: js.UndefOr[java.lang.String] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  var promise: js.UndefOr[js.Any] = js.undefined
}

object GCloudConfiguration {
  @scala.inline
  def apply(
    apiEndpoint: java.lang.String = null,
    autoRetry: js.UndefOr[scala.Boolean] = js.undefined,
    credentials: atGoogleDashCloudPubsubLib.Anon_Clientemail = null,
    email: java.lang.String = null,
    keyFilename: java.lang.String = null,
    maxRetries: scala.Int | scala.Double = null,
    projectId: java.lang.String = null,
    promise: js.Any = null
  ): GCloudConfiguration = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint)
    if (!js.isUndefined(autoRetry)) __obj.updateDynamic("autoRetry")(autoRetry)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (email != null) __obj.updateDynamic("email")(email)
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[GCloudConfiguration]
  }
}

