package typings.googleCloudStorage.buildSrcStorageMod

import typings.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidator
import typings.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidatorGenerator
import typings.googleCloudStorage.buildSrcNodejsCommonServiceMod.ServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageOptions
  extends StObject
     with ServiceOptions {
  
  /**
    * The API endpoint of the service used to make requests.
    * Defaults to `storage.googleapis.com`.
    */
  var apiEndpoint: js.UndefOr[String] = js.undefined
  
  var crc32cGenerator: js.UndefOr[CRC32CValidatorGenerator] = js.undefined
  
  var retryOptions: js.UndefOr[RetryOptions] = js.undefined
}
object StorageOptions {
  
  inline def apply(): StorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageOptions]
  }
  
  extension [Self <: StorageOptions](x: Self) {
    
    inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
    
    inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
    
    inline def setCrc32cGenerator(value: () => CRC32CValidator): Self = StObject.set(x, "crc32cGenerator", js.Any.fromFunction0(value))
    
    inline def setCrc32cGeneratorUndefined: Self = StObject.set(x, "crc32cGenerator", js.undefined)
    
    inline def setRetryOptions(value: RetryOptions): Self = StObject.set(x, "retryOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryOptionsUndefined: Self = StObject.set(x, "retryOptions", js.undefined)
  }
}
