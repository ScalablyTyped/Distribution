package typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var apiEndpoint: js.UndefOr[String] = js.undefined
  var credentials: js.UndefOr[js.Object] = js.undefined
  var keyFilename: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    apiEndpoint: String = null,
    credentials: js.Object = null,
    keyFilename: String = null,
    namespace: String = null,
    projectId: String = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[InitOptions]
  }
}

