package typings.glReact.mod

import typings.std.Error
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react", "Visitor")
@js.native
class Visitor () extends js.Object {
  def onNodeDraw(node: Node, preparedUniforms: js.Array[_]): Unit = js.native
  def onNodeDrawEnd(node: Node): Unit = js.native
  def onNodeDrawSkipped(node: Node): Unit = js.native
  def onNodeDrawStart(node: Node): Unit = js.native
  def onNodeSyncDeps(node: Node, additions: js.Array[Node | Bus], deletions: js.Array[Node | Bus]): Unit = js.native
  def onSurfaceDrawEnd(surface: Surface[_]): Unit = js.native
  def onSurfaceDrawError(e: Error): Boolean = js.native
  def onSurfaceDrawSkipped(surface: Surface[_]): Unit = js.native
  def onSurfaceDrawStart(surface: Surface[_]): Unit = js.native
  def onSurfaceGLContextChange(surface: Surface[_]): Unit = js.native
  def onSurfaceGLContextChange(surface: Surface[_], gl: WebGLRenderingContext): Unit = js.native
  def onSurfaceMount(surface: Surface[_]): Unit = js.native
  def onSurfaceUnmount(surface: Surface[_]): Unit = js.native
}

