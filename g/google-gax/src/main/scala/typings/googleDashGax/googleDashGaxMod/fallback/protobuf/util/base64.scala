package typings.googleDashGax.googleDashGaxMod.fallback.protobuf.util

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A minimal base64 implementation for number arrays. */
@JSImport("google-gax", "fallback.protobuf.util.base64")
@js.native
object base64 extends js.Object {
  /**
    * Decodes a base64 encoded string to a buffer.
    * @param string Source string
    * @param buffer Destination buffer
    * @param offset Destination offset
    * @returns Number of bytes written
    * @throws {Error} If encoding is invalid
    */
  def decode(string: String, buffer: Uint8Array, offset: Double): Double = js.native
  /**
    * Encodes a buffer to a base64 encoded string.
    * @param buffer Source buffer
    * @param start Source start
    * @param end Source end
    * @returns Base64 encoded string
    */
  def encode(buffer: Uint8Array, start: Double, end: Double): String = js.native
  /**
    * Calculates the byte length of a base64 encoded string.
    * @param string Base64 encoded string
    * @returns Byte length
    */
  def length(string: String): Double = js.native
  /**
    * Tests if the specified string appears to be base64 encoded.
    * @param string String to test
    * @returns `true` if probably base64 encoded, otherwise false
    */
  def test(string: String): Boolean = js.native
}

