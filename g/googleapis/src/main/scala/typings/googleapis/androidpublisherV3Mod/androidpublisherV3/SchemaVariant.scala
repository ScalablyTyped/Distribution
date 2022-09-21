package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVariant extends StObject {
  
  /**
    * The device spec used to generate the APK.
    */
  var deviceSpec: js.UndefOr[SchemaDeviceSpec] = js.undefined
  
  /**
    * Output only. The ID of a previously created system APK variant.
    */
  var variantId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaVariant {
  
  inline def apply(): SchemaVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVariant]
  }
  
  extension [Self <: SchemaVariant](x: Self) {
    
    inline def setDeviceSpec(value: SchemaDeviceSpec): Self = StObject.set(x, "deviceSpec", value.asInstanceOf[js.Any])
    
    inline def setDeviceSpecUndefined: Self = StObject.set(x, "deviceSpec", js.undefined)
    
    inline def setVariantId(value: Double): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    inline def setVariantIdNull: Self = StObject.set(x, "variantId", null)
    
    inline def setVariantIdUndefined: Self = StObject.set(x, "variantId", js.undefined)
  }
}
