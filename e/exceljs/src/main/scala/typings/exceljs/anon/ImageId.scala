package typings.exceljs.anon

import typings.exceljs.exceljsStrings.image
import typings.exceljs.mod.ImageRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageId extends js.Object {
  
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
  implicit class ImageIdOps[Self <: ImageId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: ImageRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: image): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
