package typings.googleGax.mod.protobuf.util

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A minimal UTF8 implementation for number arrays. */
@JSImport("google-gax", "protobuf.util.utf8")
@js.native
object utf8 extends js.Object {
  /**
    * Calculates the UTF8 byte length of a string.
    * @param string String
    * @returns Byte length
    */
  def length(string: String): Double = js.native
  /**
    * Reads UTF8 bytes as a string.
    * @param buffer Source buffer
    * @param start Source start
    * @param end Source end
    * @returns String read
    */
  def read(buffer: Uint8Array, start: Double, end: Double): String = js.native
  /**
    * Writes a string as UTF8 bytes.
    * @param string Source string
    * @param buffer Destination buffer
    * @param offset Destination offset
    * @returns Bytes written
    */
  def write(string: String, buffer: Uint8Array, offset: Double): Double = js.native
}

