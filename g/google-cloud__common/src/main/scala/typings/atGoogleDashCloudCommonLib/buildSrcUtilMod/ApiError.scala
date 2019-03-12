package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common/build/src/util", "ApiError")
@js.native
class ApiError protected ()
  extends stdLib.Error {
  def this(errorBody: GoogleErrorBody) = this()
  def this(errorMessage: java.lang.String) = this()
  var code: js.UndefOr[scala.Double] = js.native
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var response: js.UndefOr[requestLib.requestMod.requestNs.Response] = js.native
}

