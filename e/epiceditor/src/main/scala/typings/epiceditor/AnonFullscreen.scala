package typings.epiceditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullscreen extends js.Object {
  var fullscreen: Double
  var modifier: Double
  var preview: Double
}

object AnonFullscreen {
  @scala.inline
  def apply(fullscreen: Double, modifier: Double, preview: Double): AnonFullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFullscreen]
  }
}

