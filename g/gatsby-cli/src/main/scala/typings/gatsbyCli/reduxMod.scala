package typings.gatsbyCli

import typings.gatsbyCli.anon.CombinedStatelogsIGatsbyC
import typings.gatsbyCli.typesMod.ActionsUnion
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux", "dispatch")
  @js.native
  def dispatch(action: Thunk): Unit = js.native
  @JSImport("gatsby-cli/lib/reporter/redux", "dispatch")
  @js.native
  def dispatch(action: ActionsUnion): Unit = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux", "getStore")
  @js.native
  def getStore(): Store[CombinedStatelogsIGatsbyC, ActionsUnion] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux", "onLogAction")
  @js.native
  def onLogAction(fn: ActionLogListener): js.Function0[Unit] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux", "onStoreSwap")
  @js.native
  def onStoreSwap(fn: StoreListener): Unit = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux", "setStore")
  @js.native
  def setStore(s: GatsbyCLIStore): Unit = js.native
  
  type ActionLogListener = js.Function1[/* action */ ActionsUnion, js.Any]
  
  type GatsbyCLIStore = Store[CombinedStatelogsIGatsbyC, ActionsUnion]
  
  type StoreListener = js.Function1[/* store */ GatsbyCLIStore, Unit]
  
  type Thunk = js.Function1[/* repeated */ js.Any, ActionsUnion]
}
