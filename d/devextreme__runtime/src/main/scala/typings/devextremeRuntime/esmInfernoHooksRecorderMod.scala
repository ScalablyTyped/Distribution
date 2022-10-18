package typings.devextremeRuntime

import typings.devextremeRuntime.anon.ComponentDidMount
import typings.devextremeRuntime.anon.Context
import typings.devextremeRuntime.esmInfernoHooksContainerMod.HookContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmInfernoHooksRecorderMod {
  
  @JSImport("@devextreme/runtime/esm/inferno-hooks/recorder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRecorder(component: HookContainer): ComponentDidMount = ^.asInstanceOf[js.Dynamic].applyDynamic("createRecorder")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentDidMount]
  
  object currentComponent {
    
    @JSImport("@devextreme/runtime/esm/inferno-hooks/recorder", "currentComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devextreme/runtime/esm/inferno-hooks/recorder", "currentComponent.current")
    @js.native
    def current: Context = js.native
    inline def current_=(x: Context): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  }
  
  inline def renderChild(component: HookContainer, hasRenderFnRenderPropsRenderRef: Any, context: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderChild")(component.asInstanceOf[js.Any], hasRenderFnRenderPropsRenderRef.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
}
