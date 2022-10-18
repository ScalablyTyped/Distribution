package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilBundleReaderMod.BundleReader
import typings.std.ReadableStreamReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcUtilBundleReaderImplMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/util/bundle_reader_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newBundleReader(reader: ReadableStreamReader[js.typedarray.Uint8Array], serializer: JsonProtoSerializer): BundleReader = (^.asInstanceOf[js.Dynamic].applyDynamic("newBundleReader")(reader.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[BundleReader]
}
