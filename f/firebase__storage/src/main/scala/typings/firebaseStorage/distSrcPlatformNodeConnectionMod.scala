package typings.firebaseStorage

import typings.firebaseStorage.anon.FnCall
import typings.firebaseStorage.distSrcImplementationConnectionMod.Connection
import typings.firebaseStorage.distSrcImplementationConnectionMod.ConnectionType
import typings.firebaseStorage.distSrcImplementationConnectionMod.ErrorCode
import typings.node.NodeJS.ReadableStream
import typings.nodeFetch.mod.Headers
import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.Response
import typings.std.Blob
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPlatformNodeConnectionMod {
  
  @JSImport("@firebase/storage/dist/src/platform/node/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/src/platform/node/connection", "FetchBytesConnection")
  @js.native
  open class FetchBytesConnection ()
    extends StObject
       with FetchConnection[js.typedarray.ArrayBuffer]
  
  @JSImport("@firebase/storage/dist/src/platform/node/connection", "FetchStreamConnection")
  @js.native
  open class FetchStreamConnection ()
    extends StObject
       with FetchConnection[ReadableStream] {
    
    /* private */ var stream_ : Any = js.native
  }
  
  @JSImport("@firebase/storage/dist/src/platform/node/connection", "FetchTextConnection")
  @js.native
  open class FetchTextConnection ()
    extends StObject
       with FetchConnection[String]
  
  inline def injectTestConnection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectTestConnection")().asInstanceOf[Unit]
  inline def injectTestConnection(factory: js.Function0[Connection[String]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectTestConnection")(factory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def newBlobConnection(): Connection[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("newBlobConnection")().asInstanceOf[Connection[Blob]]
  
  inline def newBytesConnection(): Connection[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("newBytesConnection")().asInstanceOf[Connection[js.typedarray.ArrayBuffer]]
  
  inline def newStreamConnection(): Connection[ReadableStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("newStreamConnection")().asInstanceOf[Connection[ReadableStream]]
  
  inline def newTextConnection(): Connection[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextConnection")().asInstanceOf[Connection[String]]
  
  /**
    * Network layer that works in Node.
    *
    * This network implementation should not be used in browsers as it does not
    * support progress updates.
    */
  @js.native
  trait FetchConnection[T /* <: ConnectionType */]
    extends StObject
       with Connection[T] {
    
    /* protected */ var body_ : js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
    /* protected */ var errorCode_ : ErrorCode = js.native
    
    /* protected */ var errorText_ : String = js.native
    
    /* protected */ def fetch_(url: RequestInfo): js.Promise[Response] = js.native
    /* protected */ def fetch_(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    /* protected */ def fetch_(url: URL): js.Promise[Response] = js.native
    /* protected */ def fetch_(url: URL, init: RequestInit): js.Promise[Response] = js.native
    /* protected */ @JSName("fetch_")
    var fetch__Original: FnCall = js.native
    
    /* protected */ var headers_ : js.UndefOr[Headers] = js.native
    
    /* protected */ var sent_ : Boolean = js.native
    
    /* protected */ var statusCode_ : js.UndefOr[Double] = js.native
  }
}
