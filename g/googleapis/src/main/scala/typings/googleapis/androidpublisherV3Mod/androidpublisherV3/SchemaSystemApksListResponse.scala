package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSystemApksListResponse extends StObject {
  
  /**
    * All system APK variants created.
    */
  var variants: js.UndefOr[js.Array[SchemaVariant]] = js.undefined
}
object SchemaSystemApksListResponse {
  
  inline def apply(): SchemaSystemApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemApksListResponse]
  }
  
  extension [Self <: SchemaSystemApksListResponse](x: Self) {
    
    inline def setVariants(value: js.Array[SchemaVariant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: SchemaVariant*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
