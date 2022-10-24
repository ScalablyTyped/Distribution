package typings.devextremeRuntime

import typings.devextremeRuntime.anon.DefaultValue
import typings.devextremeRuntime.cjsInfernoPortalMod.PortalProps
import typings.devextremeRuntime.cjsInfernoRenderTemplateMod.IProps
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsInfernoMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@devextreme/runtime/cjs/inferno", "BaseInfernoComponent")
  @js.native
  open class BaseInfernoComponent[P, S] ()
    extends typings.devextremeRuntime.cjsInfernoBaseComponentMod.BaseInfernoComponent[P, S] {
    def this(props: P) = this()
    def this(props: P, context: Any) = this()
    def this(props: Unit, context: Any) = this()
  }
  
  @JSImport("@devextreme/runtime/cjs/inferno", "InfernoComponent")
  @js.native
  open class InfernoComponent[P, S] ()
    extends typings.devextremeRuntime.cjsInfernoBaseComponentMod.InfernoComponent[P, S] {
    def this(props: P) = this()
    def this(props: P, context: Any) = this()
    def this(props: Unit, context: Any) = this()
  }
  
  @JSImport("@devextreme/runtime/cjs/inferno", "InfernoEffect")
  @js.native
  open class InfernoEffect protected ()
    extends typings.devextremeRuntime.cjsInfernoEffectMod.InfernoEffect {
    def this(effect: js.Function0[js.Function0[Unit] | Unit], dependency: js.Array[Any]) = this()
  }
  
  object InfernoEffectHost {
    
    @JSImport("@devextreme/runtime/cjs/inferno", "InfernoEffectHost")
    @js.native
    val ^ : js.Any = js.native
    
    inline def callEffects(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callEffects")().asInstanceOf[Unit]
    
    @JSImport("@devextreme/runtime/cjs/inferno", "InfernoEffectHost.callbacks")
    @js.native
    def callbacks: js.Array[js.Function0[Unit]] = js.native
    inline def callbacks_=(x: js.Array[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(x.asInstanceOf[js.Any])
    
    inline def lock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")().asInstanceOf[Unit]
    
    @JSImport("@devextreme/runtime/cjs/inferno", "InfernoEffectHost.lockCount")
    @js.native
    def lockCount: Double = js.native
    inline def lockCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lockCount")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@devextreme/runtime/cjs/inferno", "InfernoWrapperComponent")
  @js.native
  open class InfernoWrapperComponent[P, S] ()
    extends typings.devextremeRuntime.cjsInfernoBaseComponentMod.InfernoWrapperComponent[P, S] {
    def this(props: P) = this()
    def this(props: P, context: Any) = this()
    def this(props: Unit, context: Any) = this()
  }
  
  inline def Portal(param0: PortalProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Portal")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createContext[T](defaultValue: T): DefaultValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[DefaultValue]
  
  inline def createReRenderEffect(): typings.devextremeRuntime.cjsInfernoEffectMod.InfernoEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("createReRenderEffect")().asInstanceOf[typings.devextremeRuntime.cjsInfernoEffectMod.InfernoEffect]
  
  inline def hasTemplate(name: String, properties: Record[String, Any], _component: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hydrate(input: Any, parentDOM: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(input: Any, parentDOM: Element, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normalizeStyles(styles: Any): js.UndefOr[Record[String, String | Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record[String, String | Double]]]
  
  inline def renderTemplate(template: String, props: IProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderTemplate(template: String, props: IProps, _component: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
