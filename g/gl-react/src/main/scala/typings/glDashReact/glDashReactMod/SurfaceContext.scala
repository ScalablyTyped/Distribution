package typings.glDashReact.glDashReactMod

import typings.glDashReact.Anon_GetGLSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceContext extends js.Object {
  var glParent: Node | Surface[_] | Bus
  var glSizable: Anon_GetGLSize
  var glSurface: Surface[_]
}

object SurfaceContext {
  @scala.inline
  def apply(glParent: Node | Surface[_] | Bus, glSizable: Anon_GetGLSize, glSurface: Surface[_]): SurfaceContext = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSizable = glSizable, glSurface = glSurface)
  
    __obj.asInstanceOf[SurfaceContext]
  }
}

