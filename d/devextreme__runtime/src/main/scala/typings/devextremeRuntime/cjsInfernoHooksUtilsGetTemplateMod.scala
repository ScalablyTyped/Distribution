package typings.devextremeRuntime

import typings.devextremeRuntime.anon.DefaultProps
import typings.inferno.distCoreTypesMod.ForwardRef
import typings.inferno.distCoreTypesMod.IComponent
import typings.inferno.distCoreTypesMod.Props
import typings.inferno.distCoreTypesMod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsInfernoHooksUtilsGetTemplateMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno-hooks/utils/get-template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTemplate(TemplateProp: InfernoComponent & DefaultProps): js.Function | (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) | (IComponent[Any, Any]) | (js.Function1[/* props */ js.UndefOr[Props[Any] | Null], VNode]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(TemplateProp.asInstanceOf[js.Any]).asInstanceOf[js.Function | (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) | (IComponent[Any, Any]) | (js.Function1[/* props */ js.UndefOr[Props[Any] | Null], VNode])]
  
  type InfernoComponent = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@devextreme/runtime.anon.FnCall>[1] */ js.Any
}
