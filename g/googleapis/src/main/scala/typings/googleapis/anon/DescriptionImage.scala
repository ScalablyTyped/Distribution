package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionImage extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[HeightType] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object DescriptionImage {
  
  @scala.inline
  def apply(): DescriptionImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionImage]
  }
  
  @scala.inline
  implicit class DescriptionImageMutableBuilder[Self <: DescriptionImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setImage(value: HeightType): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
