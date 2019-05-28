package typings
package fluxibleDashAddonsDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible-addons-react", JSImport.Namespace)
@js.native
object fluxibleDashAddonsDashReactMod extends js.Object {
  def connectToStores(
    Component: fluxibleDashAddonsDashReactLib.TypeofClassComponent,
    stores: js.Array[
      (org.scalablytyped.runtime.Instantiable1[
        /* dispatcher */ dispatchrLib.dispatchrMod.DispatcherInterface, 
        fluxibleLib.addonsBaseStoreMod.^[js.Object]
      ]) | java.lang.String
    ],
    getStateFromStores: js.Function2[/* context */ fluxibleLib.fluxibleMod.ComponentContext, /* props */ js.Any, _]
  ): fluxibleDashAddonsDashReactLib.TypeofClassComponent = js.native
  def connectToStores(
    Component: fluxibleDashAddonsDashReactLib.TypeofClassComponent,
    stores: js.Array[
      (org.scalablytyped.runtime.Instantiable1[
        /* dispatcher */ dispatchrLib.dispatchrMod.DispatcherInterface, 
        fluxibleLib.addonsBaseStoreMod.^[js.Object]
      ]) | java.lang.String
    ],
    getStateFromStores: js.Function2[/* context */ fluxibleLib.fluxibleMod.ComponentContext, /* props */ js.Any, _],
    customContextTypes: js.Any
  ): fluxibleDashAddonsDashReactLib.TypeofClassComponent = js.native
  def provideContext(Component: fluxibleDashAddonsDashReactLib.TypeofClassComponent): fluxibleDashAddonsDashReactLib.TypeofClassComponent = js.native
  def provideContext(Component: fluxibleDashAddonsDashReactLib.TypeofClassComponent, customContextTypes: js.Any): fluxibleDashAddonsDashReactLib.TypeofClassComponent = js.native
}

