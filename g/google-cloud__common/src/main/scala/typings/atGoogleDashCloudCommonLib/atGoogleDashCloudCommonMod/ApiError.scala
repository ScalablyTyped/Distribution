package typings
package atGoogleDashCloudCommonLib.atGoogleDashCloudCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common", "ApiError")
@js.native
class ApiError protected ()
  extends atGoogleDashCloudCommonLib.buildSrcUtilMod.ApiError {
  def this(errorBody: atGoogleDashCloudCommonLib.buildSrcUtilMod.GoogleErrorBody) = this()
  def this(errorMessage: java.lang.String) = this()
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
  def createMultiErrorMessage(err: atGoogleDashCloudCommonLib.buildSrcUtilMod.GoogleErrorBody): java.lang.String = js.native
  def createMultiErrorMessage(
    err: atGoogleDashCloudCommonLib.buildSrcUtilMod.GoogleErrorBody,
    errors: js.Array[atGoogleDashCloudCommonLib.buildSrcUtilMod.GoogleInnerError]
  ): java.lang.String = js.native
}

