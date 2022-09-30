package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofbase64 extends StObject {
  
  /**
    * Decodes a base64 encoded string to a buffer.
    * @param string Source string
    * @param buffer Destination buffer
    * @param offset Destination offset
    * @returns Number of bytes written
    * @throws {Error} If encoding is invalid
    */
  def decode(string: String, buffer: js.typedarray.Uint8Array, offset: Double): Double
  
  /**
    * Encodes a buffer to a base64 encoded string.
    * @param buffer Source buffer
    * @param start Source start
    * @param end Source end
    * @returns Base64 encoded string
    */
  def encode(buffer: js.typedarray.Uint8Array, start: Double, end: Double): String
  
  /**
    * Calculates the byte length of a base64 encoded string.
    * @param string Base64 encoded string
    * @returns Byte length
    */
  def length(string: String): Double
  
  /**
    * Tests if the specified string appears to be base64 encoded.
    * @param string String to test
    * @returns `true` if probably base64 encoded, otherwise false
    */
  def test(string: String): Boolean
}
object Typeofbase64 {
  
  inline def apply(
    decode: (String, js.typedarray.Uint8Array, Double) => Double,
    encode: (js.typedarray.Uint8Array, Double, Double) => String,
    length: String => Double,
    test: String => Boolean
  ): Typeofbase64 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction3(decode), encode = js.Any.fromFunction3(encode), length = js.Any.fromFunction1(length), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[Typeofbase64]
  }
  
  extension [Self <: Typeofbase64](x: Self) {
    
    inline def setDecode(value: (String, js.typedarray.Uint8Array, Double) => Double): Self = StObject.set(x, "decode", js.Any.fromFunction3(value))
    
    inline def setEncode(value: (js.typedarray.Uint8Array, Double, Double) => String): Self = StObject.set(x, "encode", js.Any.fromFunction3(value))
    
    inline def setLength(value: String => Double): Self = StObject.set(x, "length", js.Any.fromFunction1(value))
    
    inline def setTest(value: String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
  }
}
