package typings.devextremeRuntime

import typings.devextremeRuntime.containerMod.RefObject
import typings.inferno.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forwardRefMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno-hooks/forward_ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
