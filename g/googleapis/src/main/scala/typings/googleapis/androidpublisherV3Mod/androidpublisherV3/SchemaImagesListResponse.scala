package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImagesListResponse extends StObject {
  
  var images: js.UndefOr[js.Array[SchemaImage]] = js.undefined
}
object SchemaImagesListResponse {
  
  inline def apply(): SchemaImagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImagesListResponse]
  }
  
  extension [Self <: SchemaImagesListResponse](x: Self) {
    
    inline def setImages(value: js.Array[SchemaImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: SchemaImage*): Self = StObject.set(x, "images", js.Array(value :_*))
  }
}
