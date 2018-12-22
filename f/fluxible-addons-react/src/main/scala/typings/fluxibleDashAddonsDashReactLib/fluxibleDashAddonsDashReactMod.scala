package typings
package fluxibleDashAddonsDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible-addons-react", JSImport.Namespace)
@js.native
object fluxibleDashAddonsDashReactMod extends js.Object {
  def connectToStores(
    Component: org.scalablytyped.runtime.Instantiable1[
      /* props */ stdLib.Readonly[js.Object], 
      reactLib.reactMod.Component[js.Object, js.Object, js.Object]
    ],
    stores: js.Array[
      (org.scalablytyped.runtime.Instantiable1[
        /* dispatcher */ dispatchrLib.dispatchrMod.DispatcherInterface, 
        fluxibleLib.addonsBaseStoreMod.namespaced[js.Object]
      ]) | java.lang.String
    ],
    getStateFromStores: js.Function2[/* context */ fluxibleLib.fluxibleMod.ComponentContext, /* props */ js.Any, _]
  ): org.scalablytyped.runtime.Instantiable1[
    /* props */ stdLib.Readonly[js.Object], 
    reactLib.reactMod.Component[js.Object, js.Object, js.Object]
  ] = js.native
  def connectToStores(
    Component: org.scalablytyped.runtime.Instantiable1[
      /* props */ stdLib.Readonly[js.Object], 
      reactLib.reactMod.Component[js.Object, js.Object, js.Object]
    ],
    stores: js.Array[
      (org.scalablytyped.runtime.Instantiable1[
        /* dispatcher */ dispatchrLib.dispatchrMod.DispatcherInterface, 
        fluxibleLib.addonsBaseStoreMod.namespaced[js.Object]
      ]) | java.lang.String
    ],
    getStateFromStores: js.Function2[/* context */ fluxibleLib.fluxibleMod.ComponentContext, /* props */ js.Any, _],
    customContextTypes: js.Any
  ): org.scalablytyped.runtime.Instantiable1[
    /* props */ stdLib.Readonly[js.Object], 
    reactLib.reactMod.Component[js.Object, js.Object, js.Object]
  ] = js.native
  def provideContext(
    Component: org.scalablytyped.runtime.Instantiable1[
      /* props */ stdLib.Readonly[js.Object], 
      reactLib.reactMod.Component[js.Object, js.Object, js.Object]
    ]
  ): org.scalablytyped.runtime.Instantiable1[
    /* props */ stdLib.Readonly[js.Object], 
    reactLib.reactMod.Component[js.Object, js.Object, js.Object]
  ] = js.native
  def provideContext(
    Component: org.scalablytyped.runtime.Instantiable1[
      /* props */ stdLib.Readonly[js.Object], 
      reactLib.reactMod.Component[js.Object, js.Object, js.Object]
    ],
    customContextTypes: js.Any
  ): org.scalablytyped.runtime.Instantiable1[
    /* props */ stdLib.Readonly[js.Object], 
    reactLib.reactMod.Component[js.Object, js.Object, js.Object]
  ] = js.native
}

