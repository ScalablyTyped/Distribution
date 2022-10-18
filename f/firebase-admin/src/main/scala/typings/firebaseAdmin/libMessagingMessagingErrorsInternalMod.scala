package typings.firebaseAdmin

import typings.firebaseAdmin.libUtilsApiRequestMod.HttpError
import typings.firebaseAdmin.libUtilsErrorMod.FirebaseMessagingError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessagingMessagingErrorsInternalMod {
  
  @JSImport("firebase-admin/lib/messaging/messaging-errors-internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFirebaseError(err: HttpError): FirebaseMessagingError = ^.asInstanceOf[js.Dynamic].applyDynamic("createFirebaseError")(err.asInstanceOf[js.Any]).asInstanceOf[FirebaseMessagingError]
  
  inline def getErrorCode(response: Any): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorCode")(response.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
