package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationMetadata extends StObject {
  
  /**
    * Indicates whether CryptoKeys with protection_level EXTERNAL can be created in this location.
    */
  var ekmAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether CryptoKeys with protection_level HSM can be created in this location.
    */
  var hsmAvailable: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaLocationMetadata {
  
  inline def apply(): SchemaLocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationMetadata]
  }
  
  extension [Self <: SchemaLocationMetadata](x: Self) {
    
    inline def setEkmAvailable(value: Boolean): Self = StObject.set(x, "ekmAvailable", value.asInstanceOf[js.Any])
    
    inline def setEkmAvailableNull: Self = StObject.set(x, "ekmAvailable", null)
    
    inline def setEkmAvailableUndefined: Self = StObject.set(x, "ekmAvailable", js.undefined)
    
    inline def setHsmAvailable(value: Boolean): Self = StObject.set(x, "hsmAvailable", value.asInstanceOf[js.Any])
    
    inline def setHsmAvailableNull: Self = StObject.set(x, "hsmAvailable", null)
    
    inline def setHsmAvailableUndefined: Self = StObject.set(x, "hsmAvailable", js.undefined)
  }
}
