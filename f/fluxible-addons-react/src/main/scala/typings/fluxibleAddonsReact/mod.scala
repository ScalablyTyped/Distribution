package typings.fluxibleAddonsReact

import org.scalablytyped.runtime.Instantiable1
import typings.dispatchr.mod.DispatcherInterface
import typings.fluxible.baseStoreMod.^
import typings.fluxible.mod.ComponentContext
import typings.fluxibleAddonsReact.anon.TypeofComponent
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluxible-addons-react", "connectToStores")
  @js.native
  def connectToStores(
    Component: TypeofComponent with (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      Component[js.Object, js.Object, js.Object]
    ]),
    stores: js.Array[(Instantiable1[/* dispatcher */ DispatcherInterface, ^[js.Object]]) | String],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ js.Any, _]
  ): TypeofComponent with (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = js.native
  @JSImport("fluxible-addons-react", "connectToStores")
  @js.native
  def connectToStores(
    Component: TypeofComponent with (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      Component[js.Object, js.Object, js.Object]
    ]),
    stores: js.Array[(Instantiable1[/* dispatcher */ DispatcherInterface, ^[js.Object]]) | String],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ js.Any, _],
    customContextTypes: js.Any
  ): TypeofComponent with (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = js.native
  
  @JSImport("fluxible-addons-react", "provideContext")
  @js.native
  def provideContext(
    Component: TypeofComponent with (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      Component[js.Object, js.Object, js.Object]
    ])
  ): TypeofComponent with (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = js.native
  @JSImport("fluxible-addons-react", "provideContext")
  @js.native
  def provideContext(
    Component: TypeofComponent with (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      Component[js.Object, js.Object, js.Object]
    ]),
    customContextTypes: js.Any
  ): TypeofComponent with (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = js.native
}
