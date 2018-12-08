package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleErrorBody extends js.Object {
  var code: scala.Double
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var response: requestLib.requestMod.requestNs.Response
}

