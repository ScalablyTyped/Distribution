package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common/build/src/util", "ApiError")
@js.native
class ApiError protected ()
  extends nodeLib.Error {
  def this(errorBody: GoogleErrorBody) = this()
  def this(errorMessage: java.lang.String) = this()
  var code: js.UndefOr[scala.Double] = js.native
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  var response: js.UndefOr[requestLib.requestMod.requestNs.Response] = js.native
}

