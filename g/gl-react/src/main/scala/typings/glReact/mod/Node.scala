package typings.glReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-react", "Node")
@js.native
class Node ()
  extends Component[NodeProps, js.Object, js.Any] {
  
  var backbuffer: js.UndefOr[Framebuffer] = js.native
  
  var capturePixelsArray: js.UndefOr[Uint8Array] = js.native
  
  @JSName("context")
  var context_Node: SurfaceContext = js.native
  
  var dependencies: js.Array[Node | Bus] = js.native
  
  var dependents: js.Array[Node | Surface[_]] = js.native
  
  var drawProps: NodeProps = js.native
  
  var framebuffer: js.UndefOr[Framebuffer] = js.native
  
  var id: Double = js.native
  
  var uniformsBus: StringDictionary[js.Array[js.UndefOr[Bus]]] = js.native
}
