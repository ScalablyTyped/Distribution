package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImagesDeleteAllResponse extends StObject {
  
  /**
    * The deleted images.
    */
  var deleted: js.UndefOr[js.Array[SchemaImage]] = js.undefined
}
object SchemaImagesDeleteAllResponse {
  
  inline def apply(): SchemaImagesDeleteAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImagesDeleteAllResponse]
  }
  
  extension [Self <: SchemaImagesDeleteAllResponse](x: Self) {
    
    inline def setDeleted(value: js.Array[SchemaImage]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDeletedVarargs(value: SchemaImage*): Self = StObject.set(x, "deleted", js.Array(value*))
  }
}
