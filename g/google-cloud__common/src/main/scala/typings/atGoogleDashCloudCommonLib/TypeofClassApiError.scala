package typings
package atGoogleDashCloudCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassApiError
  extends org.scalablytyped.runtime.Instantiable1[
      /* errorMessage */ java.lang.String, 
      atGoogleDashCloudCommonLib.buildSrcUtilMod.ApiError
    ] {
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

