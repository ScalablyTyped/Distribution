package typings.exceljs.anon

import typings.exceljs.exceljsStrings.image
import typings.exceljs.mod.ImageRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageId extends StObject {
  
  var imageId: String = js.native
  
  var range: ImageRange = js.native
  
  var `type`: image = js.native
}
object ImageId {
  
  @scala.inline
  def apply(imageId: String, range: ImageRange, `type`: image): ImageId = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageId]
  }
  
  @scala.inline
  implicit class ImageIdMutableBuilder[Self <: ImageId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: ImageRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
