package typings.firebaseFunctions

import typings.firebaseFunctions.serializerMod.Serializer
import typings.firebaseFunctions.serviceMod.HttpResponseBody
import typings.firebaseFunctionsTypes.mod.FunctionsErrorCode
import typings.firebaseFunctionsTypes.mod.HttpsError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/functions/dist/src/api/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  
  @JSName("_errorForResponse")
  def errorForResponse(status: Double, bodyJSON: Null, serializer: Serializer): Error | Null = js.native
  @JSName("_errorForResponse")
  def errorForResponse(status: Double, bodyJSON: HttpResponseBody, serializer: Serializer): Error | Null = js.native
  
  @js.native
  class HttpsErrorImpl protected () extends HttpsError {
    def this(code: FunctionsErrorCode) = this()
    def this(code: FunctionsErrorCode, message: String) = this()
    def this(code: FunctionsErrorCode, message: js.UndefOr[scala.Nothing], details: js.Any) = this()
    def this(code: FunctionsErrorCode, message: String, details: js.Any) = this()
  }
}
