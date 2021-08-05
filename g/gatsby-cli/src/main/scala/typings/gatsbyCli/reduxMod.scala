package typings.gatsbyCli

import typings.gatsbyCli.anon.CombinedStatelogsIGatsbyC
import typings.gatsbyCli.typesMod.ActionsUnion
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dispatch(action: Thunk): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def dispatch(action: ActionsUnion): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getStore(): Store[CombinedStatelogsIGatsbyC, ActionsUnion] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStore")().asInstanceOf[Store[CombinedStatelogsIGatsbyC, ActionsUnion]]
  
  inline def onLogAction(fn: ActionLogListener): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onLogAction")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def onStoreSwap(fn: StoreListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onStoreSwap")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setStore(s: GatsbyCLIStore): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStore")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ActionLogListener = js.Function1[/* action */ ActionsUnion, js.Any]
  
  type GatsbyCLIStore = Store[CombinedStatelogsIGatsbyC, ActionsUnion]
  
  type StoreListener = js.Function1[/* store */ GatsbyCLIStore, Unit]
  
  @js.native
  trait Thunk extends StObject {
    
    def apply(args: js.Any*): ActionsUnion = js.native
  }
}
