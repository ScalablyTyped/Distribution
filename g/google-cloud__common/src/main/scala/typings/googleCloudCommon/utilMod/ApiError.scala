package typings.googleCloudCommon.utilMod

import typings.std.Error
import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/common/build/src/util", "ApiError")
@js.native
class ApiError protected () extends Error {
  def this(errorBody: GoogleErrorBody) = this()
  def this(errorMessage: String) = this()
  
  var code: js.UndefOr[Double] = js.native
  
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  
  var response: js.UndefOr[Response[_]] = js.native
}
/* static members */
object ApiError {
  
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
  @JSImport("@google-cloud/common/build/src/util", "ApiError.createMultiErrorMessage")
  @js.native
  def createMultiErrorMessage(err: GoogleErrorBody): String = js.native
  @JSImport("@google-cloud/common/build/src/util", "ApiError.createMultiErrorMessage")
  @js.native
  def createMultiErrorMessage(err: GoogleErrorBody, errors: js.Array[GoogleInnerError]): String = js.native
}
