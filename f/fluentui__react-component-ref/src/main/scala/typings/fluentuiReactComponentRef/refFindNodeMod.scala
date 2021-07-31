package typings.fluentuiReactComponentRef

import typings.fluentuiReactComponentRef.utilsMod.RefProps
import typings.react.mod.Component
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refFindNodeMod {
  
  @JSImport("@fluentui/react-component-ref/dist/es/RefFindNode", "RefFindNode")
  @js.native
  class RefFindNode protected ()
    extends Component[RefProps, js.Object, js.Any] {
    def this(props: RefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RefProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MRefFindNode(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRefFindNode(prevProps: RefProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRefFindNode(): Unit = js.native
    
    var prevNode: Node | Null = js.native
  }
}
