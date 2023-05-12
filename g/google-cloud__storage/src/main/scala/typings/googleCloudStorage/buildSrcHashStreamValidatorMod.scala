package typings.googleCloudStorage

import typings.googleCloudStorage.anon.PartialHashStreamValidato
import typings.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidator
import typings.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidatorGenerator
import typings.googleCloudStorage.googleCloudStorageStrings.crc32c
import typings.googleCloudStorage.googleCloudStorageStrings.md5
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcHashStreamValidatorMod {
  
  @JSImport("@google-cloud/storage/build/src/hash-stream-validator", "HashStreamValidator")
  @js.native
  open class HashStreamValidator () extends Transform {
    def this(options: PartialHashStreamValidato) = this()
    
    def _flush(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _transform(
      chunk: Buffer,
      encoding: BufferEncoding,
      callback: js.Function1[/* e */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    val crc32cEnabled: Boolean = js.native
    
    val crc32cExpected: js.UndefOr[String] = js.native
    
    val md5Enabled: Boolean = js.native
    
    val md5Expected: js.UndefOr[String] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def test(hash: crc32c | md5, sum: String): Boolean = js.native
    def test(hash: crc32c | md5, sum: Buffer): Boolean = js.native
    
    val updateHashesOnly: Boolean = js.native
  }
  
  trait HashStreamValidatorOptions extends StObject {
    
    /** Enables CRC32C calculation. To validate a provided value use `crc32cExpected`. */
    var crc32c: Boolean
    
    /** Sets the expected CRC32C value to verify once all data has been consumed. Also sets the `crc32c` option to `true` */
    var crc32cExpected: js.UndefOr[String] = js.undefined
    
    /** Set a custom CRC32C generator */
    def crc32cGenerator(): CRC32CValidator
    /** Set a custom CRC32C generator */
    @JSName("crc32cGenerator")
    var crc32cGenerator_Original: CRC32CValidatorGenerator
    
    /** Enables MD5 calculation. To validate a provided value use `md5Expected`. */
    var md5: Boolean
    
    /** Sets the expected MD5 value to verify once all data has been consumed. Also sets the `md5` option to `true` */
    var md5Expected: js.UndefOr[String] = js.undefined
    
    /** Indicates whether or not to run a validation check or only update the hash values */
    var updateHashesOnly: js.UndefOr[Boolean] = js.undefined
  }
  object HashStreamValidatorOptions {
    
    inline def apply(crc32c: Boolean, crc32cGenerator: () => CRC32CValidator, md5: Boolean): HashStreamValidatorOptions = {
      val __obj = js.Dynamic.literal(crc32c = crc32c.asInstanceOf[js.Any], crc32cGenerator = js.Any.fromFunction0(crc32cGenerator), md5 = md5.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashStreamValidatorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashStreamValidatorOptions] (val x: Self) extends AnyVal {
      
      inline def setCrc32c(value: Boolean): Self = StObject.set(x, "crc32c", value.asInstanceOf[js.Any])
      
      inline def setCrc32cExpected(value: String): Self = StObject.set(x, "crc32cExpected", value.asInstanceOf[js.Any])
      
      inline def setCrc32cExpectedUndefined: Self = StObject.set(x, "crc32cExpected", js.undefined)
      
      inline def setCrc32cGenerator(value: () => CRC32CValidator): Self = StObject.set(x, "crc32cGenerator", js.Any.fromFunction0(value))
      
      inline def setMd5(value: Boolean): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMd5Expected(value: String): Self = StObject.set(x, "md5Expected", value.asInstanceOf[js.Any])
      
      inline def setMd5ExpectedUndefined: Self = StObject.set(x, "md5Expected", js.undefined)
      
      inline def setUpdateHashesOnly(value: Boolean): Self = StObject.set(x, "updateHashesOnly", value.asInstanceOf[js.Any])
      
      inline def setUpdateHashesOnlyUndefined: Self = StObject.set(x, "updateHashesOnly", js.undefined)
    }
  }
}
