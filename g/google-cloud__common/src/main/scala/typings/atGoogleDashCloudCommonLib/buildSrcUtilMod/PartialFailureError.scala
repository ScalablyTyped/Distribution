package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common/build/src/util", "PartialFailureError")
@js.native
class PartialFailureError protected ()
  extends stdLib.Error {
  def this(b: GoogleErrorBody) = this()
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var response: js.UndefOr[requestLib.requestMod.Response] = js.native
}

