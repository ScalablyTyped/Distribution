package typings
package fluxibleDashAddonsDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible-addons-react", JSImport.Namespace)
@js.native
object fluxibleDashAddonsDashReactMod extends js.Object {
  def connectToStores(
    Component: ScalablyTyped.runtime.Instantiable1[
      /* props */ stdLib.Readonly[js.Object], 
      reactLib.reactMod.Component[js.Object, js.Object, js.Any]
    ],
    stores: js.Array[
      (ScalablyTyped.runtime.Instantiable1[
        /* dispatcher */ dispatchrLib.dispatchrMod.DispatcherInterface, 
        fluxibleLib.addonsBaseStoreMod.namespaced[js.Object]
      ]) | java.lang.String
    ],
    getStateFromStores: js.Function2[/* context */ fluxibleLib.fluxibleMod.ComponentContext, /* props */ js.Any, _]
  ): ScalablyTyped.runtime.Instantiable1[
    /* props */ stdLib.Readonly[js.Object], 
    reactLib.reactMod.Component[js.Object, js.Object, js.Any]
  ] = js.native
  def connectToStores(
    Component: ScalablyTyped.runtime.Instantiable1[
      /* props */ stdLib.Readonly[js.Object], 
      reactLib.reactMod.Component[js.Object, js.Object, js.Any]
    ],
    stores: js.Array[
      (ScalablyTyped.runtime.Instantiable1[
        /* dispatcher */ dispatchrLib.dispatchrMod.DispatcherInterface, 
        fluxibleLib.addonsBaseStoreMod.namespaced[js.Object]
      ]) | java.lang.String
    ],
    getStateFromStores: js.Function2[/* context */ fluxibleLib.fluxibleMod.ComponentContext, /* props */ js.Any, _],
    customContextTypes: js.Any
  ): ScalablyTyped.runtime.Instantiable1[
    /* props */ stdLib.Readonly[js.Object], 
    reactLib.reactMod.Component[js.Object, js.Object, js.Any]
  ] = js.native
  def provideContext(
    Component: ScalablyTyped.runtime.Instantiable1[
      /* props */ stdLib.Readonly[js.Object], 
      reactLib.reactMod.Component[js.Object, js.Object, js.Any]
    ]
  ): ScalablyTyped.runtime.Instantiable1[
    /* props */ stdLib.Readonly[js.Object], 
    reactLib.reactMod.Component[js.Object, js.Object, js.Any]
  ] = js.native
  def provideContext(
    Component: ScalablyTyped.runtime.Instantiable1[
      /* props */ stdLib.Readonly[js.Object], 
      reactLib.reactMod.Component[js.Object, js.Object, js.Any]
    ],
    customContextTypes: js.Any
  ): ScalablyTyped.runtime.Instantiable1[
    /* props */ stdLib.Readonly[js.Object], 
    reactLib.reactMod.Component[js.Object, js.Object, js.Any]
  ] = js.native
}

