package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient

import typings.atGoogleDashCloudKms.Anon_Clientemail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationObject extends js.Object {
  var credentials: js.UndefOr[Anon_Clientemail] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var keyFilename: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var promise: js.UndefOr[js.Any] = js.undefined
  var servicePath: js.UndefOr[String] = js.undefined
}

object ConfigurationObject {
  @scala.inline
  def apply(
    credentials: Anon_Clientemail = null,
    email: String = null,
    keyFilename: String = null,
    port: Int | Double = null,
    projectId: String = null,
    promise: js.Any = null,
    servicePath: String = null
  ): ConfigurationObject = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (email != null) __obj.updateDynamic("email")(email)
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath)
    __obj.asInstanceOf[ConfigurationObject]
  }
}

