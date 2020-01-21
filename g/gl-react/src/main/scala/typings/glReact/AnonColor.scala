package typings.glReact

import typings.glReact.mod.Vec4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: Vec4
}

object AnonColor {
  @scala.inline
  def apply(color: Vec4): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColor]
  }
}

