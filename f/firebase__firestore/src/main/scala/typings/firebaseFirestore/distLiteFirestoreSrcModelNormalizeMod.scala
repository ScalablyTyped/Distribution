package typings.firebaseFirestore

import typings.firebaseFirestore.anon.Nanos
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Timestamp
import typings.firebaseFirestore.distLiteFirestoreSrcUtilByteStringMod.ByteString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcModelNormalizeMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeByteString(blob: String): ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeByteString")(blob.asInstanceOf[js.Any]).asInstanceOf[ByteString]
  inline def normalizeByteString(blob: js.typedarray.Uint8Array): ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeByteString")(blob.asInstanceOf[js.Any]).asInstanceOf[ByteString]
  
  inline def normalizeNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeNumber")().asInstanceOf[Double]
  inline def normalizeNumber(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def normalizeNumber(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def normalizeTimestamp(date: Timestamp): Nanos = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTimestamp")(date.asInstanceOf[js.Any]).asInstanceOf[Nanos]
}
