package typings.firebase.mod.firestore

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "firestore.Blob")
@js.native
class Blob protected () extends js.Object {
  /**
    * Returns true if this `Blob` is equal to the provided one.
    *
    * @param other The `Blob` to compare against.
    * @return true if this `Blob` is equal to the provided one.
    */
  def isEqual(other: Blob): Boolean = js.native
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
@JSImport("firebase", "firestore.Blob")
@js.native
object Blob extends js.Object {
  /**
    * Creates a new Blob from the given Base64 string, converting it to
    * bytes.
    *
    * @param base64
    *   The Base64 string used to create the Blob object.
    */
  def fromBase64String(base64: String): Blob = js.native
  /**
    * Creates a new Blob from the given Uint8Array.
    *
    * @param array
    *   The Uint8Array used to create the Blob object.
    */
  def fromUint8Array(array: Uint8Array): Blob = js.native
}

