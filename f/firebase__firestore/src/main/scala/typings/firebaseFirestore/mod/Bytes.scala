package typings.firebaseFirestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore", "Bytes")
@js.native
/* private */ open class Bytes () extends StObject {
  
  /**
    * Returns true if this `Bytes` object is equal to the provided one.
    *
    * @param other - The `Bytes` object to compare against.
    * @returns true if this `Bytes` object is equal to the provided one.
    */
  def isEqual(other: Bytes): Boolean = js.native
  
  /**
    * Returns the underlying bytes as a Base64-encoded string.
    *
    * @returns The Base64-encoded string created from the `Bytes` object.
    */
  def toBase64(): String = js.native
  
  /**
    * Returns the underlying bytes in a new `Uint8Array`.
    *
    * @returns The Uint8Array created from the `Bytes` object.
    */
  def toUint8Array(): js.typedarray.Uint8Array = js.native
}
/* static members */
object Bytes {
  
  @JSImport("@firebase/firestore", "Bytes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new `Bytes` object from the given Base64 string, converting it to
    * bytes.
    *
    * @param base64 - The Base64 string used to create the `Bytes` object.
    */
  inline def fromBase64String(base64: String): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[Bytes]
  
  /**
    * Creates a new `Bytes` object from the given Uint8Array.
    *
    * @param array - The Uint8Array used to create the `Bytes` object.
    */
  inline def fromUint8Array(array: js.typedarray.Uint8Array): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[Bytes]
}
