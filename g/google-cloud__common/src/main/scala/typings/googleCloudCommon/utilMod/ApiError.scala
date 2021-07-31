package typings.googleCloudCommon.utilMod

import typings.std.Error
import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/common/build/src/util", "ApiError")
@js.native
class ApiError protected ()
  extends StObject
     with Error {
  def this(errorBody: GoogleErrorBody) = this()
  def this(errorMessage: String) = this()
  
  var code: js.UndefOr[Double] = js.native
  
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  var response: js.UndefOr[Response[js.Any]] = js.native
}
/* static members */
object ApiError {
  
  @JSImport("@google-cloud/common/build/src/util", "ApiError")
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def createMultiErrorMessage(err: GoogleErrorBody): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultiErrorMessage")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def createMultiErrorMessage(err: GoogleErrorBody, errors: js.Array[GoogleInnerError]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiErrorMessage")(err.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[String]
}
