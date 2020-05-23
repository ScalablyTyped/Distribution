package typings.epiceditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fullscreen extends js.Object {
  var fullscreen: Double
  var modifier: Double
  var preview: Double
}

object Fullscreen {
  @scala.inline
  def apply(fullscreen: Double, modifier: Double, preview: Double): Fullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullscreen]
  }
}

