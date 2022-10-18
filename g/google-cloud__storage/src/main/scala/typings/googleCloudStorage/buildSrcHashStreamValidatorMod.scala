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
    
    def _flush(callback: js.Function0[Unit]): Unit = js.native
    
    def _transform(
      chunk: Buffer,
      encoding: BufferEncoding,
      callback: js.Function1[/* e */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    val crc32cEnabled: Boolean = js.native
    
    val md5Enabled: Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    def test(hash: crc32c | md5, sum: String): Boolean = js.native
    def test(hash: crc32c | md5, sum: Buffer): Boolean = js.native
  }
  
  trait HashStreamValidatorOptions extends StObject {
    
    var crc32c: Boolean
    
    def crc32cGenerator(): CRC32CValidator
    @JSName("crc32cGenerator")
    var crc32cGenerator_Original: CRC32CValidatorGenerator
    
    var md5: Boolean
  }
  object HashStreamValidatorOptions {
    
    inline def apply(crc32c: Boolean, crc32cGenerator: () => CRC32CValidator, md5: Boolean): HashStreamValidatorOptions = {
      val __obj = js.Dynamic.literal(crc32c = crc32c.asInstanceOf[js.Any], crc32cGenerator = js.Any.fromFunction0(crc32cGenerator), md5 = md5.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashStreamValidatorOptions]
    }
    
    extension [Self <: HashStreamValidatorOptions](x: Self) {
      
      inline def setCrc32c(value: Boolean): Self = StObject.set(x, "crc32c", value.asInstanceOf[js.Any])
      
      inline def setCrc32cGenerator(value: () => CRC32CValidator): Self = StObject.set(x, "crc32cGenerator", js.Any.fromFunction0(value))
      
      inline def setMd5(value: Boolean): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    }
  }
}
