package typings.firebaseStorage

import typings.firebaseStorage.publicTypesMod.StorageReference
import typings.std.Blob
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiBrowserMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/api.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBlob(ref: StorageReference): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  inline def getBlob(ref: StorageReference, maxDownloadSizeBytes: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  
  inline def getStream(ref: StorageReference): ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(ref.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Any]]
  inline def getStream(ref: StorageReference, maxDownloadSizeBytes: Double): ReadableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[ReadableStream[Any]]
}
