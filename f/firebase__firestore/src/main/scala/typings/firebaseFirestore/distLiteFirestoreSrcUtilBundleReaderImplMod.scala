package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.distLiteFirestoreSrcUtilBundleReaderMod.BundleReader
import typings.std.ReadableStreamReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcUtilBundleReaderImplMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/bundle_reader_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newBundleReader(reader: ReadableStreamReader[js.typedarray.Uint8Array], serializer: JsonProtoSerializer): BundleReader = (^.asInstanceOf[js.Dynamic].applyDynamic("newBundleReader")(reader.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[BundleReader]
}
