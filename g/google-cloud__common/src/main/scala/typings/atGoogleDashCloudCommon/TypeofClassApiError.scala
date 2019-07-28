package typings.atGoogleDashCloudCommon

import org.scalablytyped.runtime.Instantiable1
import typings.atGoogleDashCloudCommon.buildSrcUtilMod.ApiError
import typings.atGoogleDashCloudCommon.buildSrcUtilMod.GoogleErrorBody
import typings.atGoogleDashCloudCommon.buildSrcUtilMod.GoogleInnerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassApiError extends Instantiable1[/* errorMessage */ String, ApiError] {
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

