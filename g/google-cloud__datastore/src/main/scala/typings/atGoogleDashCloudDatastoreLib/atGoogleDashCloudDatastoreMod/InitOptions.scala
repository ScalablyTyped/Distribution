package typings
package atGoogleDashCloudDatastoreLib.atGoogleDashCloudDatastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var apiEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var credentials: js.UndefOr[js.Object] = js.undefined
  var keyFilename: js.UndefOr[java.lang.String] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    apiEndpoint: java.lang.String = null,
    credentials: js.Object = null,
    keyFilename: java.lang.String = null,
    namespace: java.lang.String = null,
    projectId: java.lang.String = null
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

