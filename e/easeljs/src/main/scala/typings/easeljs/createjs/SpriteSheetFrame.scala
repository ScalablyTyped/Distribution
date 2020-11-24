package typings.easeljs.createjs

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// what is returned from SpriteSheet.getFrame(number)
@js.native
trait SpriteSheetFrame extends js.Object {
  
  var image: HTMLImageElement = js.native
  
  var rect: Rectangle = js.native
}
object SpriteSheetFrame {
  
  @scala.inline
  def apply(image: HTMLImageElement, rect: Rectangle): SpriteSheetFrame = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheetFrame]
  }
  
  @scala.inline
  implicit class SpriteSheetFrameOps[Self <: SpriteSheetFrame] (val x: Self) extends AnyVal {
    
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
    def setImage(value: HTMLImageElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRect(value: Rectangle): Self = this.set("rect", value.asInstanceOf[js.Any])
  }
}
