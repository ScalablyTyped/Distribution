package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common/build/src/util", "PartialFailureError")
@js.native
class PartialFailureError protected ()
  extends nodeLib.Error {
  def this(b: GoogleErrorBody) = this()
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  var response: js.UndefOr[requestLib.requestMod.requestNs.Response] = js.native
}

