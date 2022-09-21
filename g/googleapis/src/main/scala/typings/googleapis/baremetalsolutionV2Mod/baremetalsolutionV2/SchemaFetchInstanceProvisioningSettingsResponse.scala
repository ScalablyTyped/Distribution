package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFetchInstanceProvisioningSettingsResponse extends StObject {
  
  /**
    * The OS images available.
    */
  var images: js.UndefOr[js.Array[SchemaOSImage]] = js.undefined
}
object SchemaFetchInstanceProvisioningSettingsResponse {
  
  inline def apply(): SchemaFetchInstanceProvisioningSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchInstanceProvisioningSettingsResponse]
  }
  
  extension [Self <: SchemaFetchInstanceProvisioningSettingsResponse](x: Self) {
    
    inline def setImages(value: js.Array[SchemaOSImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: SchemaOSImage*): Self = StObject.set(x, "images", js.Array(value*))
  }
}
