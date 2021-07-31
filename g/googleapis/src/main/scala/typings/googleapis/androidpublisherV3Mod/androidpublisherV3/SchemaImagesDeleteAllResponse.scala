package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImagesDeleteAllResponse extends StObject {
  
  var deleted: js.UndefOr[js.Array[SchemaImage]] = js.undefined
}
object SchemaImagesDeleteAllResponse {
  
  @scala.inline
  def apply(): SchemaImagesDeleteAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImagesDeleteAllResponse]
  }
  
  @scala.inline
  implicit class SchemaImagesDeleteAllResponseMutableBuilder[Self <: SchemaImagesDeleteAllResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: js.Array[SchemaImage]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDeletedVarargs(value: SchemaImage*): Self = StObject.set(x, "deleted", js.Array(value :_*))
  }
}
