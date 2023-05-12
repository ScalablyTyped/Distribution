package typings.firebaseFirestore.distLiteFirestoreSrcIndexDotrnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/index.rn", "_ByteString")
@js.native
/* private */ open class ByteString ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcApiMod.ByteString
/* static members */
object ByteString {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/index.rn", "_ByteString")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/index.rn", "_ByteString.EMPTY_BYTE_STRING")
  @js.native
  val EMPTY_BYTE_STRING: typings.firebaseFirestore.distLiteFirestoreSrcUtilByteStringMod.ByteString = js.native
  
  inline def fromBase64String(base64: String): typings.firebaseFirestore.distLiteFirestoreSrcUtilByteStringMod.ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcUtilByteStringMod.ByteString]
  
  inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.distLiteFirestoreSrcUtilByteStringMod.ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcUtilByteStringMod.ByteString]
}
