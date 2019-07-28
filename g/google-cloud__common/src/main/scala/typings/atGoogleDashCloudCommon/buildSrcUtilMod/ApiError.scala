package typings.atGoogleDashCloudCommon.buildSrcUtilMod

import typings.request.requestMod.Response
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common/build/src/util", "ApiError")
@js.native
class ApiError protected () extends Error {
  def this(errorBody: GoogleErrorBody) = this()
  def this(errorMessage: String) = this()
  var code: js.UndefOr[Double] = js.native
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var response: js.UndefOr[Response] = js.native
}

/* static members */
@JSImport("@google-cloud/common/build/src/util", "ApiError")
@js.native
object ApiError extends js.Object {
  /**
    * Pieces together an error message by combining all unique error messages
    * returned from a single GoogleError
    *
    * @private
    *
    * @param {GoogleErrorBody} err The original error.
    * @param {GoogleInnerError[]} [errors] Inner errors, if any.
    * @returns {string}
    */
  def createMultiErrorMessage(err: GoogleErrorBody): String = js.native
  def createMultiErrorMessage(err: GoogleErrorBody, errors: js.Array[GoogleInnerError]): String = js.native
}

