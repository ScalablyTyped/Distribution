package typings.glDashReact

import typings.glDashReact.glDashReactMod.Node
import typings.glDashReact.glDashReactMod.Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GlParent extends js.Object {
  var glParent: Surface[_] | Node
  var glSurface: Surface[_]
}

object Anon_GlParent {
  @scala.inline
  def apply(glParent: Surface[_] | Node, glSurface: Surface[_]): Anon_GlParent = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GlParent]
  }
}

