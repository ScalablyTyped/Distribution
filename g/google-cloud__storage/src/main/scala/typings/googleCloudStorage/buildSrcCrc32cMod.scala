package typings.googleCloudStorage

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCrc32cMod {
  
  @JSImport("@google-cloud/storage/build/src/crc32c", "CRC32C_DEFAULT_VALIDATOR_GENERATOR")
  @js.native
  val CRC32C_DEFAULT_VALIDATOR_GENERATOR: CRC32CValidatorGenerator = js.native
  
  object CRC32C_EXCEPTION_MESSAGES {
    
    @JSImport("@google-cloud/storage/build/src/crc32c", "CRC32C_EXCEPTION_MESSAGES")
    @js.native
    val ^ : js.Any = js.native
    
    inline def INVALID_INIT_BASE64_RANGE(l: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_INIT_BASE64_RANGE")(l.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def INVALID_INIT_BUFFER_LENGTH(l: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_INIT_BUFFER_LENGTH")(l.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def INVALID_INIT_INTEGER(l: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_INIT_INTEGER")(l.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /**
    * Ported from {@link https://github.com/google/crc32c/blob/21fc8ef30415a635e7351ffa0e5d5367943d4a94/src/crc32c_portable.cc#L16-L59 github.com/google/crc32c}
    */
  @JSImport("@google-cloud/storage/build/src/crc32c", "CRC32C_EXTENSIONS")
  @js.native
  val CRC32C_EXTENSIONS: js.Array[Any] = js.native
  
  @JSImport("@google-cloud/storage/build/src/crc32c", "CRC32C_EXTENSION_TABLE")
  @js.native
  val CRC32C_EXTENSION_TABLE: js.typedarray.Int32Array = js.native
  
  @js.native
  trait CRC32C
    extends StObject
       with CRC32CValidator {
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Returns a `Buffer` representation of the CRC32C value
      */
    def toBuffer(): Buffer = js.native
    
    /**
      * Returns a JSON-compatible, base64-encoded representation of the CRC32C value.
      *
      * See {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify `JSON#stringify`}
      */
    def toJSON(): String = js.native
    
    def validate(input: Double): Boolean = js.native
    def validate(input: CRC32CValidator): Boolean = js.native
    /**
      * Validates a provided input to the current CRC32C value.
      *
      * @param input A Buffer, `CRC32C`-compatible object, base64-encoded data (string), or signed 32-bit integer
      */
    def validate(input: Buffer): Boolean = js.native
  }
  
  /** An interface for CRC32C hashing and validation */
  trait CRC32CValidator extends StObject {
    
    /**
      * A method for passing `Buffer`s for CRC32C generation.
      *
      * @example
      * Hashing buffers from 'some ' and 'text\n'
      *
      * ```js
      * const buffer1 = Buffer.from('some ');
      * crc32c.update(buffer1);
      *
      * const buffer2 = Buffer.from('text\n');
      * crc32c.update(buffer2);
      *
      * crc32c.toString(); // 'DkjKuA=='
      * ```
      */
    def update(data: Buffer): Unit
    
    /**
      * A method validating a base64-encoded CRC32C string.
      *
      * @example
      * Should return `true` if the value matches, `false` otherwise
      *
      * ```js
      * const buffer = Buffer.from('data');
      * crc32c.update(buffer);
      * crc32c.validate('DkjKuA=='); // false
      * crc32c.validate('rth90Q=='); // true
      * ```
      */
    def validate(value: String): Boolean
  }
  object CRC32CValidator {
    
    inline def apply(update: Buffer => Unit, validate: String => Boolean): CRC32CValidator = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[CRC32CValidator]
    }
    
    extension [Self <: CRC32CValidator](x: Self) {
      
      inline def setUpdate(value: Buffer => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setValidate(value: String => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  /** A function that generates a CRC32C Validator */
  type CRC32CValidatorGenerator = js.Function0[CRC32CValidator]
}
