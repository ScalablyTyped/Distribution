package typings.glReact.anon

import typings.glReact.mod.Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlParent extends js.Object {
  var glParent: Surface[_] | typings.glReact.mod.Node
  var glSurface: Surface[_]
}

object GlParent {
  @scala.inline
  def apply(glParent: Surface[_] | typings.glReact.mod.Node, glSurface: Surface[_]): GlParent = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlParent]
  }
}

