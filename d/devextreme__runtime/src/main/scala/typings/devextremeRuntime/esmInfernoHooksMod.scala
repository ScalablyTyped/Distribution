package typings.devextremeRuntime

import typings.devextremeRuntime.anon.Context
import typings.devextremeRuntime.anon.DefaultProps
import typings.devextremeRuntime.anon.DefaultValue
import typings.devextremeRuntime.anon.DefaultValueId
import typings.devextremeRuntime.anon.RenderProps
import typings.devextremeRuntime.esmInfernoHooksContainerMod.RefObject
import typings.devextremeRuntime.esmInfernoHooksHooksMod.Dispatch
import typings.devextremeRuntime.esmInfernoHooksHooksMod.SetStateAction
import typings.devextremeRuntime.esmInfernoHooksPortalMod.PortalProps
import typings.devextremeRuntime.esmInfernoHooksRecorderMod.Recorder
import typings.devextremeRuntime.esmInfernoHooksUtilsGetTemplateMod.InfernoComponent
import typings.inferno.distCoreTypesMod.ForwardRef
import typings.inferno.distCoreTypesMod.IComponent
import typings.inferno.distCoreTypesMod.Props
import typings.inferno.distCoreTypesMod.VNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmInfernoHooksMod {
  
  @JSImport("@devextreme/runtime/esm/inferno-hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@devextreme/runtime/esm/inferno-hooks", "HookContainer")
  @js.native
  open class HookContainer ()
    extends typings.devextremeRuntime.esmInfernoHooksContainerMod.HookContainer {
    def this(props: RenderProps) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: RenderProps, context: Any) = this()
  }
  
  @JSImport("@devextreme/runtime/esm/inferno-hooks", "InfernoWrapperComponent")
  @js.native
  open class InfernoWrapperComponent ()
    extends typings.devextremeRuntime.esmInfernoHooksBaseHooksComponentMod.InfernoWrapperComponent {
    def this(props: RenderProps) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: RenderProps, context: Any) = this()
  }
  
  inline def Portal(param0: PortalProps): VNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Portal")(param0.asInstanceOf[js.Any]).asInstanceOf[VNode | Null]
  
  inline def collectChildren(): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__collectChildren")().asInstanceOf[Record[String, Any]]
  
  inline def createContext[T](defaultValue: T): DefaultValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[DefaultValue]
  
  inline def createRecorder(component: typings.devextremeRuntime.esmInfernoHooksContainerMod.HookContainer): Recorder = ^.asInstanceOf[js.Dynamic].applyDynamic("createRecorder")(component.asInstanceOf[js.Any]).asInstanceOf[Recorder]
  
  object currentComponent {
    
    @JSImport("@devextreme/runtime/esm/inferno-hooks", "currentComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devextreme/runtime/esm/inferno-hooks", "currentComponent.current")
    @js.native
    def current: Context = js.native
    inline def current_=(x: Context): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  }
  
  inline def equalByValue(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalByValue")().asInstanceOf[Boolean]
  
  inline def forwardRef[T, P](
    render: js.Function2[
      /* props */ T, 
      /* ref */ RefObject[P], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfernoElement<T> */ Any
    ]
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFC<T> */ Any) & (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFC<T> */ Any) & (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ])]
  
  inline def getTemplate(TemplateProp: InfernoComponent & DefaultProps): js.Function | (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) | (IComponent[Any, Any]) | (js.Function1[/* props */ js.UndefOr[Props[Any] | Null], VNode]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(TemplateProp.asInstanceOf[js.Any]).asInstanceOf[js.Function | (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) | (IComponent[Any, Any]) | (js.Function1[/* props */ js.UndefOr[Props[Any] | Null], VNode])]
  
  inline def renderChild(
    component: typings.devextremeRuntime.esmInfernoHooksContainerMod.HookContainer,
    param1: Any,
    context: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderChild")(component.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useCallback[T /* <: js.Function1[/* repeated */ scala.Nothing, Any] */](fn: T, dependencies: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(fn.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useContext(consumer: DefaultValueId): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(consumer.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useEffect(fn: js.Function0[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def useEffect(fn: js.Function0[Any], dependencies: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(fn.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useImperativeHandle(ref: Any, init: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def useImperativeHandle(ref: Any, init: js.Function0[Any], dependencies: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useMemo[T](fn: js.Function0[T], dependencies: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(fn.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useReRenderEffect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useReRenderEffect")().asInstanceOf[Unit]
  
  inline def useRef[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[Any]
  inline def useRef[T](initialValue: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
}
