package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1TotalMemoryEncryptionInfo extends StObject {
  
  /**
    * Memory encryption algorithm.
    */
  var encryptionAlgorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of memory encryption on the device.
    */
  var encryptionState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The length of the encryption keys.
    */
  var keyLength: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of keys that can be used for encryption.
    */
  var maxKeys: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1TotalMemoryEncryptionInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1TotalMemoryEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1TotalMemoryEncryptionInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1TotalMemoryEncryptionInfo](x: Self) {
    
    inline def setEncryptionAlgorithm(value: String): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmNull: Self = StObject.set(x, "encryptionAlgorithm", null)
    
    inline def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
    
    inline def setEncryptionState(value: String): Self = StObject.set(x, "encryptionState", value.asInstanceOf[js.Any])
    
    inline def setEncryptionStateNull: Self = StObject.set(x, "encryptionState", null)
    
    inline def setEncryptionStateUndefined: Self = StObject.set(x, "encryptionState", js.undefined)
    
    inline def setKeyLength(value: String): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthNull: Self = StObject.set(x, "keyLength", null)
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    inline def setMaxKeys(value: String): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
    
    inline def setMaxKeysNull: Self = StObject.set(x, "maxKeys", null)
    
    inline def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
  }
}
