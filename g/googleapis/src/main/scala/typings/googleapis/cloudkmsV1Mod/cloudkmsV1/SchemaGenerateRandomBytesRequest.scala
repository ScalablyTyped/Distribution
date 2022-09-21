package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateRandomBytesRequest extends StObject {
  
  /**
    * The length in bytes of the amount of randomness to retrieve. Minimum 8 bytes, maximum 1024 bytes.
    */
  var lengthBytes: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The ProtectionLevel to use when generating the random data. Currently, only HSM protection level is supported.
    */
  var protectionLevel: js.UndefOr[String | Null] = js.undefined
}
object SchemaGenerateRandomBytesRequest {
  
  inline def apply(): SchemaGenerateRandomBytesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateRandomBytesRequest]
  }
  
  extension [Self <: SchemaGenerateRandomBytesRequest](x: Self) {
    
    inline def setLengthBytes(value: Double): Self = StObject.set(x, "lengthBytes", value.asInstanceOf[js.Any])
    
    inline def setLengthBytesNull: Self = StObject.set(x, "lengthBytes", null)
    
    inline def setLengthBytesUndefined: Self = StObject.set(x, "lengthBytes", js.undefined)
    
    inline def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevelNull: Self = StObject.set(x, "protectionLevel", null)
    
    inline def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
  }
}
