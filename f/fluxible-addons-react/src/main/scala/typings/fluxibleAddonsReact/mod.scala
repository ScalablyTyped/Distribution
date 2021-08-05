package typings.fluxibleAddonsReact

import org.scalablytyped.runtime.Instantiable1
import typings.dispatchr.mod.DispatcherInterface
import typings.fluxible.mod.ComponentContext
import typings.fluxibleAddonsReact.anon.TypeofComponent
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluxible-addons-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectToStores(
    Component: TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      Component[js.Object, js.Object, js.Object]
    ]),
    stores: js.Array[
      (Instantiable1[/* dispatcher */ DispatcherInterface, typings.fluxible.baseStoreMod.^[js.Object]]) | String
    ],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ js.Any, js.Any]
  ): TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToStores")(Component.asInstanceOf[js.Any], stores.asInstanceOf[js.Any], getStateFromStores.asInstanceOf[js.Any])).asInstanceOf[TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ])]
  inline def connectToStores(
    Component: TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      Component[js.Object, js.Object, js.Object]
    ]),
    stores: js.Array[
      (Instantiable1[/* dispatcher */ DispatcherInterface, typings.fluxible.baseStoreMod.^[js.Object]]) | String
    ],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ js.Any, js.Any],
    customContextTypes: js.Any
  ): TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToStores")(Component.asInstanceOf[js.Any], stores.asInstanceOf[js.Any], getStateFromStores.asInstanceOf[js.Any], customContextTypes.asInstanceOf[js.Any])).asInstanceOf[TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ])]
  
  inline def provideContext(
    Component: TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      Component[js.Object, js.Object, js.Object]
    ])
  ): TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("provideContext")(Component.asInstanceOf[js.Any]).asInstanceOf[TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ])]
  inline def provideContext(
    Component: TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      Component[js.Object, js.Object, js.Object]
    ]),
    customContextTypes: js.Any
  ): TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("provideContext")(Component.asInstanceOf[js.Any], customContextTypes.asInstanceOf[js.Any])).asInstanceOf[TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ])]
}
