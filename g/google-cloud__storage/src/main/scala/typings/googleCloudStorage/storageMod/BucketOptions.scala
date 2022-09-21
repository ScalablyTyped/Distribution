package typings.googleCloudStorage.storageMod

import typings.googleCloudStorage.crc32cMod.CRC32CValidator
import typings.googleCloudStorage.crc32cMod.CRC32CValidatorGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketOptions extends StObject {
  
  var crc32cGenerator: js.UndefOr[CRC32CValidatorGenerator] = js.undefined
  
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  var preconditionOpts: js.UndefOr[PreconditionOptions] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object BucketOptions {
  
  inline def apply(): BucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketOptions]
  }
  
  extension [Self <: BucketOptions](x: Self) {
    
    inline def setCrc32cGenerator(value: () => CRC32CValidator): Self = StObject.set(x, "crc32cGenerator", js.Any.fromFunction0(value))
    
    inline def setCrc32cGeneratorUndefined: Self = StObject.set(x, "crc32cGenerator", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setPreconditionOpts(value: PreconditionOptions): Self = StObject.set(x, "preconditionOpts", value.asInstanceOf[js.Any])
    
    inline def setPreconditionOptsUndefined: Self = StObject.set(x, "preconditionOpts", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
