package typings.firebaseFirestore

import typings.std.ReadableStreamReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilByteStreamMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/util/byte_stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/util/byte_stream", "DEFAULT_BYTES_PER_READ")
  @js.native
  val DEFAULT_BYTES_PER_READ: /* 10240 */ Double = js.native
  
  inline def toByteStreamReaderHelper(source: js.typedarray.Uint8Array): ReadableStreamReader[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("toByteStreamReaderHelper")(source.asInstanceOf[js.Any]).asInstanceOf[ReadableStreamReader[js.typedarray.Uint8Array]]
  inline def toByteStreamReaderHelper(source: js.typedarray.Uint8Array, bytesPerRead: Double): ReadableStreamReader[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("toByteStreamReaderHelper")(source.asInstanceOf[js.Any], bytesPerRead.asInstanceOf[js.Any])).asInstanceOf[ReadableStreamReader[js.typedarray.Uint8Array]]
}
