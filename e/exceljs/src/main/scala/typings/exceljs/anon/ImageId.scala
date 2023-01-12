package typings.exceljs.anon

import typings.exceljs.exceljsStrings.image
import typings.exceljs.mod.ImageRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageId extends StObject {
  
  var imageId: String
  
  var range: ImageRange
  
  var `type`: image
}
object ImageId {
  
  inline def apply(imageId: String, range: ImageRange): ImageId = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[ImageId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageId] (val x: Self) extends AnyVal {
    
    inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setRange(value: ImageRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
