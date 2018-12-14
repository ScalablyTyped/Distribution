package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react", "Node")
@js.native
class Node ()
  extends reactLib.reactMod.Component[NodeProps, js.Object, js.Any] {
  var backbuffer: js.UndefOr[Framebuffer] = js.native
  var capturePixelsArray: js.UndefOr[stdLib.Uint8Array] = js.native
  @JSName("context")
  var context_Node: SurfaceContext = js.native
  var dependencies: js.Array[Node | Bus] = js.native
  var dependents: js.Array[Node | Surface[_]] = js.native
  var drawProps: NodeProps = js.native
  var framebuffer: js.UndefOr[Framebuffer] = js.native
  var id: scala.Double = js.native
  var uniformsBus: org.scalablytyped.runtime.StringDictionary[js.Array[js.UndefOr[Bus]]] = js.native
}

