package typings.glReact.mod

import typings.std.Error
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-react", "Visitor")
@js.native
class Visitor () extends StObject {
  
  def onNodeDraw(node: Node, preparedUniforms: js.Array[js.Any]): Unit = js.native
  
  def onNodeDrawEnd(node: Node): Unit = js.native
  
  def onNodeDrawSkipped(node: Node): Unit = js.native
  
  def onNodeDrawStart(node: Node): Unit = js.native
  
  def onNodeSyncDeps(node: Node, additions: js.Array[Node | Bus], deletions: js.Array[Node | Bus]): Unit = js.native
  
  def onSurfaceDrawEnd(surface: Surface[js.Any]): Unit = js.native
  
  def onSurfaceDrawError(e: Error): Boolean = js.native
  
  def onSurfaceDrawSkipped(surface: Surface[js.Any]): Unit = js.native
  
  def onSurfaceDrawStart(surface: Surface[js.Any]): Unit = js.native
  
  def onSurfaceGLContextChange(surface: Surface[js.Any]): Unit = js.native
  def onSurfaceGLContextChange(surface: Surface[js.Any], gl: WebGLRenderingContext): Unit = js.native
  
  def onSurfaceMount(surface: Surface[js.Any]): Unit = js.native
  
  def onSurfaceUnmount(surface: Surface[js.Any]): Unit = js.native
}
