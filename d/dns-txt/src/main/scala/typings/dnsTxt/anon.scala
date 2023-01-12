package typings.dnsTxt

import typings.dnsTxt.mod.DataToEncode
import typings.dnsTxt.mod.DecodedData
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Decode extends StObject {
    
    var decode: Typeofdecode
    
    var encode: Typeofencode
    
    def encodingLength(data: DataToEncode): Double
    @JSName("encodingLength")
    var encodingLength_Original: js.Function1[/* data */ DataToEncode, Double]
  }
  object Decode {
    
    inline def apply(decode: Typeofdecode, encode: Typeofencode, encodingLength: /* data */ DataToEncode => Double): Decode = {
      val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], encodingLength = js.Any.fromFunction1(encodingLength))
      __obj.asInstanceOf[Decode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decode] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: Typeofdecode): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      inline def setEncode(value: Typeofencode): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodingLength(value: /* data */ DataToEncode => Double): Self = StObject.set(x, "encodingLength", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Typeofdecode extends StObject {
    
    /**
      * Takes a buffer and returns a decoded key/value data object. Note that all keys will be
      * lowercased and all values will be `strings` if `binary` option is not set and all values
      * will be `Buffer` objects if `binary` option is set to `true`.
      *
      * @param buffer The buffer containing the encoded data object.
      * @param [offset=0] The byte offset into `buffer` at which to begin decoding the data object.
      * @param [length=buffer.length] The byte offset into `buffer` at which to stop decoding the data object.
      */
    def apply(buffer: Buffer): DecodedData = js.native
    def apply(buffer: Buffer, offset: Double): DecodedData = js.native
    def apply(buffer: Buffer, offset: Double, length: Double): DecodedData = js.native
    def apply(buffer: Buffer, offset: Unit, length: Double): DecodedData = js.native
    
    /**
      * After decoding, `bytes` is set to the amount of bytes used to
      * decode the data object.
      */
    val bytes: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait Typeofencode extends StObject {
    
    /**
      * Takes a key/value data object and returns a buffer with the encoded TXT
      * record.
      *
      * This module does not actively validate the key/value pairs, but keep the
      * following in rules in mind:
      *
      * - To be RFC compliant, each key should conform with the rules as
      *   specified in [section 6.4](https://tools.ietf.org/html/rfc6763#section-6.4).
      *
      * - To be RFC compliant, each value should conform with the rules as
      *   specified in [section 6.5](https://tools.ietf.org/html/rfc6763#section-6.5).
      *
      * @param data The data to encode.
      * @param buffer A buffer to use to encode `data` into. A new buffer will be allocated if not provided.
      * @param [offset=0] Byte offset in `buffer` where `data` should be encoded.
      */
    def apply(data: DataToEncode): Buffer = js.native
    def apply(data: DataToEncode, buffer: Unit, offset: Double): Buffer = js.native
    def apply(data: DataToEncode, buffer: Buffer): Buffer = js.native
    def apply(data: DataToEncode, buffer: Buffer, offset: Double): Buffer = js.native
    
    /**
      * After encoding, `bytes` is set to the amount of bytes used to
      * encode the `data`.
      */
    val bytes: js.UndefOr[Double] = js.native
  }
}
