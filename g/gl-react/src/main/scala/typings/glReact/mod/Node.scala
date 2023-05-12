package typings.glReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-react", "Node")
@js.native
open class Node protected ()
  extends Component[NodeProps, js.Object, Any] {
  def this(props: NodeProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: NodeProps, context: Any) = this()
  
  var backbuffer: js.UndefOr[Framebuffer] = js.native
  
  var capturePixelsArray: js.UndefOr[js.typedarray.Uint8Array] = js.native
  
  @JSName("context")
  var context_Node: SurfaceContext = js.native
  
  var dependencies: js.Array[Node | Bus] = js.native
  
  var dependents: js.Array[Node | Surface[Any]] = js.native
  
  var drawProps: NodeProps = js.native
  
  var framebuffer: js.UndefOr[Framebuffer] = js.native
  
  var id: Double = js.native
  
  var uniformsBus: StringDictionary[js.Array[js.UndefOr[Bus]]] = js.native
}
