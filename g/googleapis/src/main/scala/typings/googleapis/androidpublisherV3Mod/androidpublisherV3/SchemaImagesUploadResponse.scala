package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImagesUploadResponse extends StObject {
  
  var image: js.UndefOr[SchemaImage] = js.undefined
}
object SchemaImagesUploadResponse {
  
  @scala.inline
  def apply(): SchemaImagesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImagesUploadResponse]
  }
  
  @scala.inline
  implicit class SchemaImagesUploadResponseMutableBuilder[Self <: SchemaImagesUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
