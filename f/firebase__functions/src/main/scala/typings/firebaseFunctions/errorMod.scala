package typings.firebaseFunctions

import typings.firebaseFunctions.serializerMod.Serializer
import typings.firebaseFunctions.serviceMod.HttpResponseBody
import typings.firebaseFunctionsTypes.mod.FunctionsErrorCode
import typings.firebaseFunctionsTypes.mod.HttpsError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@firebase/functions/dist/src/api/error", "HttpsErrorImpl")
  @js.native
  class HttpsErrorImpl protected () extends HttpsError {
    def this(code: FunctionsErrorCode) = this()
    def this(code: FunctionsErrorCode, message: String) = this()
    def this(code: FunctionsErrorCode, message: js.UndefOr[scala.Nothing], details: js.Any) = this()
    def this(code: FunctionsErrorCode, message: String, details: js.Any) = this()
  }
  
  @JSImport("@firebase/functions/dist/src/api/error", "_errorForResponse")
  @js.native
  def errorForResponse(status: Double, bodyJSON: Null, serializer: Serializer): Error | Null = js.native
  @JSImport("@firebase/functions/dist/src/api/error", "_errorForResponse")
  @js.native
  def errorForResponse(status: Double, bodyJSON: HttpResponseBody, serializer: Serializer): Error | Null = js.native
}
