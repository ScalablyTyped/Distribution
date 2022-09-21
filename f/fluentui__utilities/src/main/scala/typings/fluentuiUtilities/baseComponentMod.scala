package typings.fluentuiUtilities

import typings.fluentuiUtilities.asyncMod.Async
import typings.fluentuiUtilities.baseComponentTypesMod.IBaseProps
import typings.fluentuiUtilities.eventGroupMod.EventGroup
import typings.fluentuiUtilities.idisposableMod.IDisposable
import typings.fluentuiUtilities.warnWarnMod.ISettingsMap
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseComponentMod {
  
  @JSImport("@fluentui/utilities/lib/BaseComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/utilities/lib/BaseComponent", "BaseComponent")
  @js.native
  open class BaseComponent[TProps /* <: IBaseProps[Any] */, TState] protected () extends Component[TProps, TState, Any] {
    /**
      * BaseComponent constructor
      * @param props - The props for the component.
      * @param context - The context for the component.
      */
    def this(props: TProps) = this()
    def this(props: TProps, context: Any) = this()
    
    /* private */ var __async: Any = js.native
    
    /* private */ var __className: Any = js.native
    
    /* private */ var __disposables: Any = js.native
    
    /* private */ var __events: Any = js.native
    
    /* private */ var __resolves: Any = js.native
    
    /**
      * Gets the async instance associated with the component, created on demand. The async instance gives
      * subclasses a way to execute setTimeout/setInterval async calls safely, where the callbacks
      * will be cleared/ignored automatically after unmounting. The helpers within the async object also
      * preserve the this pointer so that you don't need to "bind" the callbacks.
      */
    /* protected */ def _async: Async = js.native
    
    /**
      * Allows subclasses to push things to this._disposables to be auto disposed.
      */
    /* protected */ def _disposables: js.Array[IDisposable] = js.native
    
    /**
      * Gets the event group instance assocaited with the component, created on demand. The event instance
      * provides on/off methods for listening to DOM (or regular javascript object) events. The event callbacks
      * will be automatically disconnected after unmounting. The helpers within the events object also
      * preserve the this reference so that you don't need to "bind" the callbacks.
      */
    /* protected */ def _events: EventGroup = js.native
    
    /**
      * Helper to return a memoized ref resolver function.
      * @param refName - Name of the member to assign the ref to.
      * @returns A function instance keyed from the given refname.
      * @deprecated Use `createRef` from React.createRef.
      */
    /* protected */ def _resolveRef(refName: String): js.Function1[/* ref */ ReactNode, ReactNode] = js.native
    
    /* private */ var _setComponentRef: Any = js.native
    
    /**
      * Controls whether the componentRef prop will be resolved by this component instance. If you are
      * implementing a passthrough (higher-order component), you would set this to false and pass through
      * the props to the inner component, allowing it to resolve the componentRef.
      */
    /* protected */ var _skipComponentRefResolution: Boolean = js.native
    
    /**
      * Updates the componentRef (by calling it with "this" when necessary.)
      */
    /* protected */ def _updateComponentRef(currentProps: IBaseProps[Any]): Unit = js.native
    /* protected */ def _updateComponentRef(currentProps: IBaseProps[Any], newProps: IBaseProps[Any]): Unit = js.native
    
    /**
      * Warns when props are required if a condition is met.
      *
      * @param requiredProps - The name of the props that are required when the condition is met.
      * @param conditionalPropName - The name of the prop that the condition is based on.
      * @param condition - Whether the condition is met.
      */
    /* protected */ def _warnConditionallyRequiredProps(requiredProps: js.Array[String], conditionalPropName: String, condition: Boolean): Unit = js.native
    
    /**
      * Warns when a deprecated props are being used.
      *
      * @param deprecationMap - The map of deprecations, where key is the prop name and the value is
      * either null or a replacement prop name.
      */
    /* protected */ def _warnDeprecations(deprecationMap: ISettingsMap[TProps]): Unit = js.native
    
    /**
      * Warns when props which are mutually exclusive with each other are both used.
      *
      * @param mutuallyExclusiveMap - The map of mutually exclusive props.
      */
    /* protected */ def _warnMutuallyExclusive(mutuallyExclusiveMap: ISettingsMap[TProps]): Unit = js.native
    
    /**
      * Gets the object's class name.
      */
    def className: String = js.native
    
    /**
      * When the component has mounted, update the componentRef.
      */
    @JSName("componentDidMount")
    def componentDidMount_MBaseComponent(): Unit = js.native
    
    /**
      * When the component receives props, make sure the componentRef is updated.
      */
    @JSName("componentDidUpdate")
    def componentDidUpdate_MBaseComponent(prevProps: TProps, prevState: TState): Unit = js.native
    
    /**
      * If we have disposables, dispose them automatically on unmount.
      */
    @JSName("componentWillUnmount")
    def componentWillUnmount_MBaseComponent(): Unit = js.native
  }
  /* static members */
  object BaseComponent {
    
    @JSImport("@fluentui/utilities/lib/BaseComponent", "BaseComponent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @deprecated Use React's error boundaries instead.
      */
    inline def onError(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")().asInstanceOf[Unit]
    inline def onError(errorMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(errorMessage: String, ex: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onError")(errorMessage.asInstanceOf[js.Any], ex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onError(errorMessage: Unit, ex: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onError")(errorMessage.asInstanceOf[js.Any], ex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def nullRender(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("nullRender")().asInstanceOf[Element | Null]
}
