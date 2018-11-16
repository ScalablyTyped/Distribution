package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Blob extends js.Object {
  /**
       * Returns true if this `Blob` is equal to the provided one.
       *
       * @param other The `Blob` to compare against.
       * @return true if this `Blob` is equal to the provided one.
       */
  def isEqual(other: Blob): scala.Boolean
  /**
       * Returns the bytes of this Blob as a Base64-encoded string.
       */
  def toBase64(): java.lang.String
  /**
       * Returns the bytes of this Blob in a new Uint8Array.
       */
  def toUint8Array(): stdLib.Uint8Array
}

