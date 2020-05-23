package typings.glReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlSurface extends js.Object {
  var glParent: js.Any
  var glSurface: js.Any
}

object GlSurface {
  @scala.inline
  def apply(glParent: js.Any, glSurface: js.Any): GlSurface = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlSurface]
  }
}

