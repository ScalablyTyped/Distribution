package typings.fluentuiReactComponentRef

import typings.fluentuiReactComponentRef.utilsMod.RefProps
import typings.react.mod.Component
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/react-component-ref/dist/es/RefForward", JSImport.Namespace)
@js.native
object refForwardMod extends js.Object {
  
  @js.native
  class RefForward ()
    extends Component[RefProps, js.Object, js.Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRefForward(prevProps: RefProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRefForward(): Unit = js.native
    
    var currentNode: Node | Null = js.native
    
    def handleRefOverride(node: HTMLElement): Unit = js.native
  }
}
