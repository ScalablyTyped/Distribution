package typings.firebaseFirestore

import typings.firebaseFirestore.bundleReaderMod.BundleSource
import typings.std.ReadableStreamReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserLiteByteStreamReaderMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/platform/browser_lite/byte_stream_reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toByteStreamReader(source: BundleSource, bytesPerRead: Double): ReadableStreamReader[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("toByteStreamReader")(source.asInstanceOf[js.Any], bytesPerRead.asInstanceOf[js.Any])).asInstanceOf[ReadableStreamReader[js.typedarray.Uint8Array]]
}
