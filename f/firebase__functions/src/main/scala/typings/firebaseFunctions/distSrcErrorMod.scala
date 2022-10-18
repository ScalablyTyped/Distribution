package typings.firebaseFunctions

import typings.firebaseFunctions.distSrcPublicTypesMod.FunctionsErrorCodeCore
import typings.firebaseFunctions.distSrcServiceMod.HttpResponseBody
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorMod {
  
  @JSImport("@firebase/functions/dist/src/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/functions/dist/src/error", "FunctionsError")
  @js.native
  open class FunctionsError protected () extends FirebaseError {
    def this(/**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    code: FunctionsErrorCodeCore) = this()
    def this(
      /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    code: FunctionsErrorCodeCore,
      message: String
    ) = this()
    def this(
      /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    code: FunctionsErrorCodeCore,
      message: String,
      /**
      * Extra data to be converted to JSON and included in the error response.
      */
    details: Any
    ) = this()
    def this(
      /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    code: FunctionsErrorCodeCore,
      message: Unit,
      /**
      * Extra data to be converted to JSON and included in the error response.
      */
    details: Any
    ) = this()
    
    /**
      * Extra data to be converted to JSON and included in the error response.
      */
    val details: js.UndefOr[Any] = js.native
  }
  
  inline def errorForResponse(status: Double): js.Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_errorForResponse")(status.asInstanceOf[js.Any]).asInstanceOf[js.Error | Null]
  inline def errorForResponse(status: Double, bodyJSON: HttpResponseBody): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_errorForResponse")(status.asInstanceOf[js.Any], bodyJSON.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
}
