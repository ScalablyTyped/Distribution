package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcApiCredentialsMod.Token
import typings.firebaseFirestore.firestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.firestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.packagesFirestoreSrcRemoteConnectionMod.Connection
import typings.firebaseFirestore.packagesFirestoreSrcUtilTypesMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreSrcRemoteRestConnectionMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/rest_connection", "RestConnection")
  @js.native
  abstract class RestConnection protected ()
    extends StObject
       with Connection {
    def this(databaseInfo: DatabaseInfo) = this()
    
    /* protected */ val baseUrl: String = js.native
    
    /* protected */ val databaseId: DatabaseId = js.native
    
    /* private */ val databaseInfo: Any = js.native
    
    /* private */ val databaseRoot: Any = js.native
    
    /* private */ var makeUrl: Any = js.native
    
    /**
      * Modifies the headers for a request, adding any authorization token if
      * present and any additional headers for the request.
      */
    /* protected */ def modifyHeadersForRequest(headers: StringMap): Unit = js.native
    /* protected */ def modifyHeadersForRequest(headers: StringMap, authToken: Null, appCheckToken: Token): Unit = js.native
    /* protected */ def modifyHeadersForRequest(headers: StringMap, authToken: Token): Unit = js.native
    /* protected */ def modifyHeadersForRequest(headers: StringMap, authToken: Token, appCheckToken: Token): Unit = js.native
    
    /**
      * Performs an RPC request using an implementation specific networking layer.
      */
    /* protected */ def performRPCRequest[Req, Resp](rpcName: String, url: String, headers: StringMap, body: Req): js.Promise[Resp] = js.native
  }
}
