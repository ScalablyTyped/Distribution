package typings.firebaseStorage

import typings.firebaseStorage.distNodeEsmSrcImplementationConnectionMod.Connection
import typings.node.NodeJS.ReadableStream
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcPlatformConnectionMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/platform/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def injectTestConnection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectTestConnection")().asInstanceOf[Unit]
  inline def injectTestConnection(factory: js.Function0[Connection[String]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectTestConnection")(factory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def newBlobConnection(): Connection[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("newBlobConnection")().asInstanceOf[Connection[Blob]]
  
  inline def newBytesConnection(): Connection[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("newBytesConnection")().asInstanceOf[Connection[js.typedarray.ArrayBuffer]]
  
  inline def newStreamConnection(): Connection[ReadableStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("newStreamConnection")().asInstanceOf[Connection[ReadableStream]]
  
  inline def newTextConnection(): Connection[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextConnection")().asInstanceOf[Connection[String]]
}
