package typings.glReact.mod

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-react", "Visitor")
@js.native
open class Visitor () extends StObject {
  
  def onNodeDraw(node: Node, preparedUniforms: js.Array[Any]): Unit = js.native
  
  def onNodeDrawEnd(node: Node): Unit = js.native
  
  def onNodeDrawSkipped(node: Node): Unit = js.native
  
  def onNodeDrawStart(node: Node): Unit = js.native
  
  def onNodeSyncDeps(node: Node, additions: js.Array[Node | Bus], deletions: js.Array[Node | Bus]): Unit = js.native
  
  def onSurfaceDrawEnd(surface: Surface[Any]): Unit = js.native
  
  def onSurfaceDrawError(e: js.Error): Boolean = js.native
  
  def onSurfaceDrawSkipped(surface: Surface[Any]): Unit = js.native
  
  def onSurfaceDrawStart(surface: Surface[Any]): Unit = js.native
  
  def onSurfaceGLContextChange(surface: Surface[Any]): Unit = js.native
  def onSurfaceGLContextChange(surface: Surface[Any], gl: WebGLRenderingContext): Unit = js.native
  
  def onSurfaceMount(surface: Surface[Any]): Unit = js.native
  
  def onSurfaceUnmount(surface: Surface[Any]): Unit = js.native
}
