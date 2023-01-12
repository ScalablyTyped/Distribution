package typings.fluentuiReactComponentRef

import typings.fluentuiReactComponentRef.anon.Kind
import typings.fluentuiReactComponentRef.fluentuiReactComponentRefStrings.find
import typings.fluentuiReactComponentRef.fluentuiReactComponentRefStrings.forward
import typings.fluentuiReactComponentRef.fluentuiReactComponentRefStrings.self
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsRefMod {
  
  @JSImport("@fluentui/react-component-ref/dist/es/Ref", "Ref")
  @js.native
  open class Ref protected () extends Component[RefProps, RefState, Any] {
    def this(props: RefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RefProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MRef(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRef(prevProps: RefProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRef(): Unit = js.native
    
    var currentNode: js.UndefOr[Node | Null] = js.native
    
    def handleForwardRefOverride(node: HTMLElement): Unit = js.native
    
    def handleSelfOverride(node: HTMLElement): Unit = js.native
    
    var prevNode: js.UndefOr[Node | Null] = js.native
    
    @JSName("state")
    var state_Ref: Kind = js.native
  }
  /* static members */
  object Ref {
    
    @JSImport("@fluentui/react-component-ref/dist/es/Ref", "Ref")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(props: RefProps): RefState = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any]).asInstanceOf[RefState]
  }
  
  trait RefProps extends StObject {
    
    var children: ReactElement
    
    /**
      * Called when a child component will be mounted or updated.
      *
      * @param node - Referred node.
      */
    var innerRef: typings.react.mod.Ref[HTMLElement]
  }
  object RefProps {
    
    inline def apply(children: ReactElement): RefProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = null)
      __obj.asInstanceOf[RefProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setInnerRef(value: typings.react.mod.Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    }
  }
  
  trait RefState extends StObject {
    
    var kind: self | forward | find | Null
  }
  object RefState {
    
    inline def apply(): RefState = {
      val __obj = js.Dynamic.literal(kind = null)
      __obj.asInstanceOf[RefState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefState] (val x: Self) extends AnyVal {
      
      inline def setKind(value: self | forward | find): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindNull: Self = StObject.set(x, "kind", null)
    }
  }
}
