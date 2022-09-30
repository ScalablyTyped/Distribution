package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installationsRequestHandlerMod {
  
  @JSImport("firebase-admin/lib/installations/installations-request-handler", "FirebaseInstallationsRequestHandler")
  @js.native
  open class FirebaseInstallationsRequestHandler protected () extends StObject {
    /**
      * @param app - The app used to fetch access tokens to sign API requests.
      *
      * @constructor
      */
    def this(app: App) = this()
    
    /* private */ val app: Any = js.native
    
    def deleteInstallation(fid: String): js.Promise[Unit] = js.native
    
    /* private */ var getPathPrefix: Any = js.native
    
    /* private */ val host: Any = js.native
    
    /* private */ val httpClient: Any = js.native
    
    /**
      * Invokes the request handler based on the API settings object passed.
      *
      * @param apiSettings - The API endpoint settings to apply to request and response.
      * @returns A promise that resolves when the request is complete.
      */
    /* private */ var invokeRequestHandler: Any = js.native
    
    /* private */ var path: Any = js.native
    
    /* private */ val timeout: Any = js.native
  }
}
