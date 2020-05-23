package typings.glReact.mod

import typings.glReact.anon.GetGLSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceContext extends js.Object {
  var glParent: Node | Surface[_] | Bus
  var glSizable: GetGLSize
  var glSurface: Surface[_]
}

object SurfaceContext {
  @scala.inline
  def apply(glParent: Node | Surface[_] | Bus, glSizable: GetGLSize, glSurface: Surface[_]): SurfaceContext = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSizable = glSizable.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceContext]
  }
}

