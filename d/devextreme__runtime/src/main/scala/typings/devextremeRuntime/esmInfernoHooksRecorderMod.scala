package typings.devextremeRuntime

import typings.devextremeRuntime.anon.Context
import typings.devextremeRuntime.anon.PartialHook
import typings.devextremeRuntime.anon.RenderFn
import typings.devextremeRuntime.esmInfernoHooksContainerMod.HookContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmInfernoHooksRecorderMod {
  
  @JSImport("@devextreme/runtime/esm/inferno-hooks/recorder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRecorder(component: HookContainer): Recorder = ^.asInstanceOf[js.Dynamic].applyDynamic("createRecorder")(component.asInstanceOf[js.Any]).asInstanceOf[Recorder]
  
  object currentComponent {
    
    @JSImport("@devextreme/runtime/esm/inferno-hooks/recorder", "currentComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devextreme/runtime/esm/inferno-hooks/recorder", "currentComponent.current")
    @js.native
    def current: Context = js.native
    inline def current_=(x: Context): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  }
  
  inline def renderChild(component: HookContainer, param1: Any, context: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderChild")(component.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type AddEffectFunc = js.Function1[/* effect */ js.Function0[Unit], Unit]
  
  @js.native
  trait Recorder extends StObject {
    
    def componentDidMount(): Unit = js.native
    
    def componentDidUpdate(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def getHook(
      _dependencies: js.Array[Any],
      fn: js.Function2[/* hook */ PartialHook, /* addEffectHook */ AddEffectFunc, Unit]
    ): Any = js.native
    def getHook(
      _dependencies: Double,
      fn: js.Function2[/* hook */ PartialHook, /* addEffectHook */ AddEffectFunc, Unit]
    ): Any = js.native
    def getHook(
      _dependencies: Unit,
      fn: js.Function2[/* hook */ PartialHook, /* addEffectHook */ AddEffectFunc, Unit]
    ): Any = js.native
    
    var renderResult: Unit = js.native
    
    def shouldComponentUpdate(nextProps: RenderFn, nextState: Any, context: Any): Boolean = js.native
  }
}
