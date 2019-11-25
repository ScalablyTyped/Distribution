package typings.easeljs.createjs

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
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpriteSheetAnimation]
  }
}

