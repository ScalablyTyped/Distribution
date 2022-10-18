package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/internal", "_ByteString")
@js.native
/* private */ open class ByteString () extends StObject {
  
  def approximateByteSize(): Double = js.native
  
  /* private */ val binaryString: Any = js.native
  
  def compareTo(other: ByteString): Double = js.native
  
  def isEqual(other: ByteString): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[Double]] = js.native
  
  def toBase64(): String = js.native
  
  def toUint8Array(): js.typedarray.Uint8Array = js.native
}
/* static members */
object ByteString {
  
  @JSImport("@firebase/firestore/dist/internal", "_ByteString")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/internal", "_ByteString.EMPTY_BYTE_STRING")
  @js.native
  val EMPTY_BYTE_STRING: ByteString = js.native
  
  inline def fromBase64String(base64: String): ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[ByteString]
  
  inline def fromUint8Array(array: js.typedarray.Uint8Array): ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[ByteString]
}
