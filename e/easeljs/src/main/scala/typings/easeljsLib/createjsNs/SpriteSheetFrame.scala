package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// what is returned from SpriteSheet.getFrame(number)
trait SpriteSheetFrame extends js.Object {
  var image: stdLib.HTMLImageElement
  var rect: Rectangle
}

object SpriteSheetFrame {
  @scala.inline
  def apply(image: stdLib.HTMLImageElement, rect: Rectangle): SpriteSheetFrame = {
    val __obj = js.Dynamic.literal(image = image, rect = rect)
  
    __obj.asInstanceOf[SpriteSheetFrame]
  }
}

