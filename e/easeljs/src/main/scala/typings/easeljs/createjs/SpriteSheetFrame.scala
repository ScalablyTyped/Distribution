package typings.easeljs.createjs

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// what is returned from SpriteSheet.getFrame(number)
trait SpriteSheetFrame extends StObject {
  
  var image: HTMLImageElement
  
  var rect: Rectangle
}
object SpriteSheetFrame {
  
  inline def apply(image: HTMLImageElement, rect: Rectangle): SpriteSheetFrame = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheetFrame]
  }
  
  extension [Self <: SpriteSheetFrame](x: Self) {
    
    inline def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setRect(value: Rectangle): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
