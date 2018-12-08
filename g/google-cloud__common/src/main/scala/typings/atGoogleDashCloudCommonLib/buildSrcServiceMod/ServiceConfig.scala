package typings
package atGoogleDashCloudCommonLib.buildSrcServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServiceConfig extends js.Object {
  /**
       * The base URL to make API requests to.
       */
  var baseUrl: java.lang.String
  var packageJson: atGoogleDashCloudCommonLib.buildSrcUtilMod.PackageJson
  var projectIdRequired: js.UndefOr[scala.Boolean] = js.undefined
  var requestModule: js.Any
  /**
       * The scopes required for the request.
       */
  var scopes: js.Array[java.lang.String]
}

