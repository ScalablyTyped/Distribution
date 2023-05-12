package typings.firebaseFirestore.distLitePackagesFirestoreTestIntegrationUtilFirebaseExportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/test/integration/util/firebase_export", "_ByteString")
@js.native
/* private */ open class ByteString ()
  extends typings.firebaseFirestore.distLitePackagesFirestoreSrcMod.ByteString
/* static members */
object ByteString {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/integration/util/firebase_export", "_ByteString")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/integration/util/firebase_export", "_ByteString.EMPTY_BYTE_STRING")
  @js.native
  val EMPTY_BYTE_STRING: typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilByteStringMod.ByteString = js.native
  
  inline def fromBase64String(base64: String): typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilByteStringMod.ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilByteStringMod.ByteString]
  
  inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilByteStringMod.ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilByteStringMod.ByteString]
}
