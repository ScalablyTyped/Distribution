package typings.atGoogleDashCloudCommon.atGoogleDashCloudCommonMod

import typings.atGoogleDashCloudCommon.buildSrcUtilMod.GoogleErrorBody
import typings.atGoogleDashCloudCommon.buildSrcUtilMod.GoogleInnerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common", "ApiError")
@js.native
class ApiError protected ()
  extends typings.atGoogleDashCloudCommon.buildSrcUtilMod.ApiError {
  def this(errorBody: GoogleErrorBody) = this()
  def this(errorMessage: String) = this()
}

/* static members */
@JSImport("@google-cloud/common", "ApiError")
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

