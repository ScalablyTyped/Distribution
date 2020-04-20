package typings.fslightboxReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoDimensions extends js.Object {
  var height: Double
  var width: Double
}

object VideoDimensions {
  @scala.inline
  def apply(height: Double, width: Double): VideoDimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDimensions]
  }
}

