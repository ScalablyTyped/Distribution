package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofutf8 extends StObject {
  
  /**
    * Calculates the UTF8 byte length of a string.
    * @param string String
    * @returns Byte length
    */
  def length(string: String): Double
  
  /**
    * Reads UTF8 bytes as a string.
    * @param buffer Source buffer
    * @param start Source start
    * @param end Source end
    * @returns String read
    */
  def read(buffer: js.typedarray.Uint8Array, start: Double, end: Double): String
  
  /**
    * Writes a string as UTF8 bytes.
    * @param string Source string
    * @param buffer Destination buffer
    * @param offset Destination offset
    * @returns Bytes written
    */
  def write(string: String, buffer: js.typedarray.Uint8Array, offset: Double): Double
}
object Typeofutf8 {
  
  inline def apply(
    length: String => Double,
    read: (js.typedarray.Uint8Array, Double, Double) => String,
    write: (String, js.typedarray.Uint8Array, Double) => Double
  ): Typeofutf8 = {
    val __obj = js.Dynamic.literal(length = js.Any.fromFunction1(length), read = js.Any.fromFunction3(read), write = js.Any.fromFunction3(write))
    __obj.asInstanceOf[Typeofutf8]
  }
  
  extension [Self <: Typeofutf8](x: Self) {
    
    inline def setLength(value: String => Double): Self = StObject.set(x, "length", js.Any.fromFunction1(value))
    
    inline def setRead(value: (js.typedarray.Uint8Array, Double, Double) => String): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    
    inline def setWrite(value: (String, js.typedarray.Uint8Array, Double) => Double): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
  }
}
