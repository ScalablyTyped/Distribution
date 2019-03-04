package typings
package glDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GlParent extends js.Object {
  var glParent: glDashReactLib.glDashReactMod.Surface[_] | glDashReactLib.glDashReactMod.Node
  var glSurface: glDashReactLib.glDashReactMod.Surface[_]
}

object Anon_GlParent {
  @scala.inline
  def apply(
    glParent: glDashReactLib.glDashReactMod.Surface[_] | glDashReactLib.glDashReactMod.Node,
    glSurface: glDashReactLib.glDashReactMod.Surface[_]
  ): Anon_GlParent = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface)
  
    __obj.asInstanceOf[Anon_GlParent]
  }
}

