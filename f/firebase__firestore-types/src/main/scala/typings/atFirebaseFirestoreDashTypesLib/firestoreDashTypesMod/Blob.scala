package typings
package atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "Blob")
@js.native
class Blob protected () extends js.Object {
  /**
    * Returns true if this `Blob` is equal to the provided one.
    *
    * @param other The `Blob` to compare against.
    * @return true if this `Blob` is equal to the provided one.
    */
  def isEqual(other: Blob): scala.Boolean = js.native
  /**
    * Returns the bytes of this Blob as a Base64-encoded string.
    */
  def toBase64(): java.lang.String = js.native
  /**
    * Returns the bytes of this Blob in a new Uint8Array.
    */
  def toUint8Array(): stdLib.Uint8Array = js.native
}

@JSImport("@firebase/firestore-types", "Blob")
@js.native
object Blob extends js.Object {
  /**
    * Creates a new Blob from the given Base64 string, converting it to
    * bytes.
    */
  def fromBase64String(base64: java.lang.String): atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Blob = js.native
  /**
    * Creates a new Blob from the given Uint8Array.
    */
  def fromUint8Array(array: stdLib.Uint8Array): atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Blob = js.native
}

