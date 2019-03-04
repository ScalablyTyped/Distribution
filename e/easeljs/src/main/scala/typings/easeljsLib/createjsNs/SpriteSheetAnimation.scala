package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// what is returned from SpriteSheet.getAnimation(string)
trait SpriteSheetAnimation extends js.Object {
  var frames: js.Array[scala.Double]
  var name: java.lang.String
  var next: java.lang.String
  var speed: scala.Double
}

object SpriteSheetAnimation {
  @scala.inline
  def apply(
    frames: js.Array[scala.Double],
    name: java.lang.String,
    next: java.lang.String,
    speed: scala.Double
  ): SpriteSheetAnimation = {
    val __obj = js.Dynamic.literal(frames = frames, name = name, next = next, speed = speed)
  
    __obj.asInstanceOf[SpriteSheetAnimation]
  }
}

