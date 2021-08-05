package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud KMS metadata for the given google.cloud.location.Location.
  */
trait SchemaLocationMetadata extends StObject {
  
  /**
    * Indicates whether CryptoKeys with protection_level HSM can be created in
    * this location.
    */
  var hsmAvailable: js.UndefOr[Boolean] = js.undefined
}
object SchemaLocationMetadata {
  
  inline def apply(): SchemaLocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationMetadata]
  }
  
  extension [Self <: SchemaLocationMetadata](x: Self) {
    
    inline def setHsmAvailable(value: Boolean): Self = StObject.set(x, "hsmAvailable", value.asInstanceOf[js.Any])
    
    inline def setHsmAvailableUndefined: Self = StObject.set(x, "hsmAvailable", js.undefined)
  }
}
