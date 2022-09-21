package typings.googleCloudStorage.utilMod

import typings.std.Error
import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/storage/build/src/nodejs-common/util", "ApiError")
@js.native
open class ApiError protected ()
  extends StObject
     with Error {
  def this(errorBody: GoogleErrorBody) = this()
  def this(errorMessage: String) = this()
  
  var code: js.UndefOr[Double] = js.native
  
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var response: js.UndefOr[Response[Any]] = js.native
}
/* static members */
object ApiError {
  
  @JSImport("@google-cloud/storage/build/src/nodejs-common/util", "ApiError")
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
  inline def createMultiErrorMessage(err: GoogleErrorBody): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultiErrorMessage")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def createMultiErrorMessage(err: GoogleErrorBody, errors: js.Array[GoogleInnerError]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiErrorMessage")(err.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[String]
}
