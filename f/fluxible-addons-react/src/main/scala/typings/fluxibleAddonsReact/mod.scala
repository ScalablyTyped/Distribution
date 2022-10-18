package typings.fluxibleAddonsReact

import org.scalablytyped.runtime.Instantiable1
import typings.dispatchr.mod.DispatcherInterface
import typings.fluxible.mod.ComponentContext
import typings.fluxibleAddonsReact.anon.TypeofComponent
import typings.react.mod.Component
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluxible-addons-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectToStores(
    Component: ConnectableComponent,
    stores: js.Array[
      (Instantiable1[
        /* dispatcher */ DispatcherInterface, 
        typings.fluxible.addonsBaseStoreMod.^[js.Object]
      ]) | String
    ],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ Any, Any]
  ): TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToStores")(Component.asInstanceOf[js.Any], stores.asInstanceOf[js.Any], getStateFromStores.asInstanceOf[js.Any])).asInstanceOf[TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ])]
  inline def connectToStores(
    Component: ConnectableComponent,
    stores: js.Array[
      (Instantiable1[
        /* dispatcher */ DispatcherInterface, 
        typings.fluxible.addonsBaseStoreMod.^[js.Object]
      ]) | String
    ],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ Any, Any],
    customContextTypes: Any
  ): TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToStores")(Component.asInstanceOf[js.Any], stores.asInstanceOf[js.Any], getStateFromStores.asInstanceOf[js.Any], customContextTypes.asInstanceOf[js.Any])).asInstanceOf[TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ])]
  
  inline def provideContext(Component: ConnectableComponent): TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("provideContext")(Component.asInstanceOf[js.Any]).asInstanceOf[TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ])]
  inline def provideContext(Component: ConnectableComponent, customContextTypes: Any): TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("provideContext")(Component.asInstanceOf[js.Any], customContextTypes.asInstanceOf[js.Any])).asInstanceOf[TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ])]
  
  type ConnectableComponent = (TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ])) | ComponentType[Any]
}
