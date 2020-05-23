package typings.glReact.anon

import typings.glReact.mod.Vec4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: Vec4
}

object Color {
  @scala.inline
  def apply(color: Vec4): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

