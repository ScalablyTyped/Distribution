package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcUtilBundleReaderMod.BundleSource
import typings.std.ReadableStreamReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcPlatformByteStreamReaderMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/platform/byte_stream_reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toByteStreamReader(source: BundleSource): ReadableStreamReader[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("toByteStreamReader")(source.asInstanceOf[js.Any]).asInstanceOf[ReadableStreamReader[js.typedarray.Uint8Array]]
  inline def toByteStreamReader(source: BundleSource, bytesPerRead: Double): ReadableStreamReader[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("toByteStreamReader")(source.asInstanceOf[js.Any], bytesPerRead.asInstanceOf[js.Any])).asInstanceOf[ReadableStreamReader[js.typedarray.Uint8Array]]
}
