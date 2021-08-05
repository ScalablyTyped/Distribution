package typings.firebase.mod.default.firestore

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "default.firestore.Blob")
@js.native
/* private */ class Blob () extends StObject {
  
  /**
    * Returns true if this `Blob` is equal to the provided one.
    *
    * @param other The `Blob` to compare against.
    * @return true if this `Blob` is equal to the provided one.
    */
  def isEqual(other: typings.firebase.mod.firebase.firestore.Blob): Boolean = js.native
  
  /**
    * Returns the bytes of a Blob as a Base64-encoded string.
    *
    * @return
    *   The Base64-encoded string created from the Blob object.
    */
  def toBase64(): String = js.native
  
  /**
    * Returns the bytes of a Blob in a new Uint8Array.
    *
    * @return
    *   The Uint8Array created from the Blob object.
    */
  def toUint8Array(): Uint8Array = js.native
}
/* static members */
object Blob {
  
  @JSImport("firebase", "default.firestore.Blob")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Blob from the given Base64 string, converting it to
    * bytes.
    *
    * @param base64
    *   The Base64 string used to create the Blob object.
    */
  inline def fromBase64String(base64: String): typings.firebase.mod.firebase.firestore.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.firestore.Blob]
  
  /**
    * Creates a new Blob from the given Uint8Array.
    *
    * @param array
    *   The Uint8Array used to create the Blob object.
    */
  inline def fromUint8Array(array: Uint8Array): typings.firebase.mod.firebase.firestore.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.firestore.Blob]
}
