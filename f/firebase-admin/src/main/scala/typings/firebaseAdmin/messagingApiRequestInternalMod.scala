package typings.firebaseAdmin

import typings.firebaseAdmin.batchRequestInternalMod.SubRequest
import typings.firebaseAdmin.coreMod.App
import typings.firebaseAdmin.messagingApiMod.BatchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagingApiRequestInternalMod {
  
  @JSImport("firebase-admin/lib/messaging/messaging-api-request-internal", "FirebaseMessagingRequestHandler")
  @js.native
  open class FirebaseMessagingRequestHandler protected () extends StObject {
    /**
      * @param app - The app used to fetch access tokens to sign API requests.
      * @constructor
      */
    def this(app: App) = this()
    
    /* private */ val batchClient: Any = js.native
    
    /* private */ var buildSendResponse: Any = js.native
    
    /* private */ val httpClient: Any = js.native
    
    /**
      * Invokes the request handler with the provided request data.
      *
      * @param host - The host to which to send the request.
      * @param path - The path to which to send the request.
      * @param requestData - The request data.
      * @returns A promise that resolves with the response.
      */
    def invokeRequestHandler(host: String, path: String, requestData: js.Object): js.Promise[js.Object] = js.native
    
    /**
      * Sends the given array of sub requests as a single batch to FCM, and parses the result into
      * a BatchResponse object.
      *
      * @param requests - An array of sub requests to send.
      * @returns A promise that resolves when the send operation is complete.
      */
    def sendBatchRequest(requests: js.Array[SubRequest]): js.Promise[BatchResponse] = js.native
  }
}
