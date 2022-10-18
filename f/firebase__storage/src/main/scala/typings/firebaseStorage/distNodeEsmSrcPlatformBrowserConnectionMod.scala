package typings.firebaseStorage

import typings.firebaseStorage.distNodeEsmSrcImplementationConnectionMod.Connection
import typings.firebaseStorage.distNodeEsmSrcImplementationConnectionMod.ConnectionType
import typings.node.NodeJS.ReadableStream
import typings.std.Blob
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcPlatformBrowserConnectionMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/platform/browser/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/node-esm/src/platform/browser/connection", "XhrBlobConnection")
  @js.native
  open class XhrBlobConnection ()
    extends StObject
       with XhrConnection[Blob]
  
  @JSImport("@firebase/storage/dist/node-esm/src/platform/browser/connection", "XhrBytesConnection")
  @js.native
  open class XhrBytesConnection ()
    extends StObject
       with XhrConnection[js.typedarray.ArrayBuffer] {
    
    /* private */ var data_ : Any = js.native
  }
  
  @JSImport("@firebase/storage/dist/node-esm/src/platform/browser/connection", "XhrTextConnection")
  @js.native
  open class XhrTextConnection ()
    extends StObject
       with XhrConnection[String]
  
  inline def injectTestConnection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectTestConnection")().asInstanceOf[Unit]
  inline def injectTestConnection(factory: js.Function0[Connection[String]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectTestConnection")(factory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def newBlobConnection(): Connection[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("newBlobConnection")().asInstanceOf[Connection[Blob]]
  
  inline def newBytesConnection(): Connection[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("newBytesConnection")().asInstanceOf[Connection[js.typedarray.ArrayBuffer]]
  
  inline def newStreamConnection(): Connection[ReadableStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("newStreamConnection")().asInstanceOf[Connection[ReadableStream]]
  
  inline def newTextConnection(): Connection[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextConnection")().asInstanceOf[Connection[String]]
  
  /**
    * Network layer for browsers. We use this instead of goog.net.XhrIo because
    * goog.net.XhrIo is hyuuuuge and doesn't work in React Native on Android.
    */
  @js.native
  trait XhrConnection[T /* <: ConnectionType */]
    extends StObject
       with Connection[T] {
    
    /* private */ var errorCode_ : Any = js.native
    
    def initXhr(): Unit = js.native
    
    /* private */ var sendPromise_ : Any = js.native
    
    /* protected */ var sent_ : Boolean = js.native
    
    /* protected */ var xhr_ : XMLHttpRequest = js.native
  }
}
