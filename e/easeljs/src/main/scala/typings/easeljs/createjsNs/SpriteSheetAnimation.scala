package typings.easeljs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// what is returned from SpriteSheet.getAnimation(string)
trait SpriteSheetAnimation extends js.Object {
  var frames: js.Array[Double]
  var name: String
  var next: String
  var speed: Double
}

object SpriteSheetAnimation {
  @scala.inline
  def apply(frames: js.Array[Double], name: String, next: String, speed: Double): SpriteSheetAnimation = {
    val __obj = js.Dynamic.literal(frames = frames, name = name, next = next, speed = speed)
  
    __obj.asInstanceOf[SpriteSheetAnimation]
  }
}

