package typings.fundamentalReact.mod

import typings.fundamentalReact.libTreeTreeMod.TreeNodeProps
import typings.fundamentalReact.libTreeTreeMod.default
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "Tree")
@js.native
open class Tree () extends default
object Tree {
  
  @JSImport("fundamental-react", "Tree")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fundamental-react", "Tree.Node")
  @js.native
  open class Node protected () extends Component[TreeNodeProps, ComponentState, Any] {
    def this(props: TreeNodeProps) = this()
    def this(props: TreeNodeProps, context: Any) = this()
  }
  /* static member */
  @JSImport("fundamental-react", "Tree.Node")
  @js.native
  def Node: ComponentClass[TreeNodeProps, ComponentState] = js.native
  inline def Node_=(x: ComponentClass[TreeNodeProps, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
}
