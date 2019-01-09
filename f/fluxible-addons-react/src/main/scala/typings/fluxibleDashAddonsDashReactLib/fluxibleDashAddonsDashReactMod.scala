package typings
package fluxibleDashAddonsDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible-addons-react", JSImport.Namespace)
@js.native
object fluxibleDashAddonsDashReactMod extends js.Object {
  def connectToStores(
    Component: fluxibleDashAddonsDashReactLib.Anon_ContextType,
    stores: js.Array[
      (org.scalablytyped.runtime.Instantiable1[
        /* dispatcher */ dispatchrLib.dispatchrMod.DispatcherInterface, 
        fluxibleLib.addonsBaseStoreMod.namespaced[js.Object]
      ]) | java.lang.String
    ],
    getStateFromStores: js.Function2[/* context */ fluxibleLib.fluxibleMod.ComponentContext, /* props */ js.Any, _]
  ): fluxibleDashAddonsDashReactLib.Anon_ContextType = js.native
  def connectToStores(
    Component: fluxibleDashAddonsDashReactLib.Anon_ContextType,
    stores: js.Array[
      (org.scalablytyped.runtime.Instantiable1[
        /* dispatcher */ dispatchrLib.dispatchrMod.DispatcherInterface, 
        fluxibleLib.addonsBaseStoreMod.namespaced[js.Object]
      ]) | java.lang.String
    ],
    getStateFromStores: js.Function2[/* context */ fluxibleLib.fluxibleMod.ComponentContext, /* props */ js.Any, _],
    customContextTypes: js.Any
  ): fluxibleDashAddonsDashReactLib.Anon_ContextType = js.native
  def provideContext(Component: fluxibleDashAddonsDashReactLib.Anon_ContextType): fluxibleDashAddonsDashReactLib.Anon_ContextType = js.native
  def provideContext(Component: fluxibleDashAddonsDashReactLib.Anon_ContextType, customContextTypes: js.Any): fluxibleDashAddonsDashReactLib.Anon_ContextType = js.native
}

