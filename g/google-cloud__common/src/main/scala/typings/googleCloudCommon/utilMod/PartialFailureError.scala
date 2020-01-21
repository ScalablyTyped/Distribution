package typings.googleCloudCommon.utilMod

import typings.std.Error
import typings.teenyRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common/build/src/util", "PartialFailureError")
@js.native
class PartialFailureError protected () extends Error {
  def this(b: GoogleErrorBody) = this()
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var response: js.UndefOr[Response[_]] = js.native
}

