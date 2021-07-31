package typings.firebaseFunctions

import typings.firebaseFunctions.serializerMod.Serializer
import typings.firebaseFunctions.serviceMod.HttpResponseBody
import typings.firebaseFunctionsTypes.mod.FunctionsErrorCode
import typings.firebaseFunctionsTypes.mod.HttpsError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@firebase/functions/dist/src/api/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/functions/dist/src/api/error", "HttpsErrorImpl")
  @js.native
  class HttpsErrorImpl protected ()
    extends StObject
       with HttpsError {
    def this(code: FunctionsErrorCode) = this()
    def this(code: FunctionsErrorCode, message: String) = this()
    def this(code: FunctionsErrorCode, message: String, details: js.Any) = this()
    def this(code: FunctionsErrorCode, message: Unit, details: js.Any) = this()
    
    /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    /* CompleteClass */
    override val code: FunctionsErrorCode = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @scala.inline
  def errorForResponse(status: Double, bodyJSON: Null, serializer: Serializer): Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_errorForResponse")(status.asInstanceOf[js.Any], bodyJSON.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[Error | Null]
  @scala.inline
  def errorForResponse(status: Double, bodyJSON: HttpResponseBody, serializer: Serializer): Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_errorForResponse")(status.asInstanceOf[js.Any], bodyJSON.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[Error | Null]
}
