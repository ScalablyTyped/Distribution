package typings
package atGoogleDashCloudTextDashToDashSpeechLib.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var credentials: js.UndefOr[ClientOptionsCredentials] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var keyFilename: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  var promise: js.UndefOr[js.Any] = js.undefined
  var servicePath: js.UndefOr[java.lang.String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    credentials: ClientOptionsCredentials = null,
    email: java.lang.String = null,
    keyFilename: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    projectId: java.lang.String = null,
    promise: js.Any = null,
    servicePath: java.lang.String = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (email != null) __obj.updateDynamic("email")(email)
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath)
    __obj.asInstanceOf[ClientOptions]
  }
}

