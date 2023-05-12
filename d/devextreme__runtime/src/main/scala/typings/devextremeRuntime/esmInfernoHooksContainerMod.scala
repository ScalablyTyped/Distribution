package typings.devextremeRuntime

import typings.devextremeRuntime.anon.Id
import typings.devextremeRuntime.anon.RenderProps
import typings.devextremeRuntime.esmInfernoHooksRecorderMod.Recorder
import typings.inferno.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmInfernoHooksContainerMod {
  
  @JSImport("@devextreme/runtime/esm/inferno-hooks/container", "HookContainer")
  @js.native
  open class HookContainer () extends Component[RenderProps, Record[String, Any]] {
    def this(props: RenderProps) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: RenderProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MHookContainer(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MHookContainer(): Unit = js.native
    
    @JSName("componentWillMount")
    def componentWillMount_MHookContainer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MHookContainer(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def getContextValue(consumer: Id): Any = js.native
    
    def getHook(dependencies: js.Array[Any], fn: Any): Any = js.native
    def getHook(dependencies: Double, fn: Any): Any = js.native
    def getHook(dependencies: Unit, fn: Any): Any = js.native
    
    var recorder: js.UndefOr[ReturnType[js.Function1[/* component */ this.type, Recorder]]] = js.native
    
    def render(): Element = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MHookContainer(nextProps: Record[String, Any], nextState: Record[String, Any]): Boolean = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MHookContainer(nextProps: Record[String, Any], nextState: Record[String, Any], context: Record[String, Any]): Boolean = js.native
    
    @JSName("state")
    var state_HookContainer: Record[String, Any] = js.native
  }
  
  trait RefObject[T] extends StObject {
    
    var current: T | Null
  }
  object RefObject {
    
    inline def apply[T](): RefObject[T] = {
      val __obj = js.Dynamic.literal(current = null)
      __obj.asInstanceOf[RefObject[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefObject[?], T] (val x: Self & RefObject[T]) extends AnyVal {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
    }
  }
}
