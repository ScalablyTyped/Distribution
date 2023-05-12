package typings.firebaseFirestore.distPackagesFirestoreSrcMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/packages/firestore/src", "Bytes")
@js.native
open class Bytes protected ()
  extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.Bytes {
  /** @hideconstructor */
  def this(byteString: typings.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString) = this()
}
/* static members */
object Bytes {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src", "Bytes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new `Bytes` object from the given Base64 string, converting it to
    * bytes.
    *
    * @param base64 - The Base64 string used to create the `Bytes` object.
    */
  inline def fromBase64String(base64: String): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiBytesMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiBytesMod.Bytes]
  
  /**
    * Creates a new `Bytes` object from the given Uint8Array.
    *
    * @param array - The Uint8Array used to create the `Bytes` object.
    */
  inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiBytesMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiBytesMod.Bytes]
}
