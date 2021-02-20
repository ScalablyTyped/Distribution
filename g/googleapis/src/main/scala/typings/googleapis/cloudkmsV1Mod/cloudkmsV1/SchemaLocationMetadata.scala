package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud KMS metadata for the given google.cloud.location.Location.
  */
@js.native
trait SchemaLocationMetadata extends StObject {
  
  /**
    * Indicates whether CryptoKeys with protection_level HSM can be created in
    * this location.
    */
  var hsmAvailable: js.UndefOr[Boolean] = js.native
}
object SchemaLocationMetadata {
  
  @scala.inline
  def apply(): SchemaLocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationMetadata]
  }
  
  @scala.inline
  implicit class SchemaLocationMetadataMutableBuilder[Self <: SchemaLocationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmAvailable(value: Boolean): Self = StObject.set(x, "hsmAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmAvailableUndefined: Self = StObject.set(x, "hsmAvailable", js.undefined)
  }
}
