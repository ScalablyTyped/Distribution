package typings.firebaseFirestore

import typings.std.ReadableStreamReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundleDottestMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/util/bundle.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def byteStreamReaderFromString(content: String, bytesPerRead: Double): ReadableStreamReader[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("byteStreamReaderFromString")(content.asInstanceOf[js.Any], bytesPerRead.asInstanceOf[js.Any])).asInstanceOf[ReadableStreamReader[js.typedarray.Uint8Array]]
}
