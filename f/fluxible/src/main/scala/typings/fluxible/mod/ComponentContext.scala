package typings.fluxible.mod

import typings.fluxible.anon.Instantiable
import typings.fluxible.baseStoreMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluxible", "ComponentContext")
@js.native
class ComponentContext () extends js.Object {
  
  /**
    * Proxy function to execute action
    * @param action function that will be executed
    * @param payload
    * @param callback
    */
  def executeAction(
    action: js.Function3[
      /* context */ ActionContext, 
      /* params */ js.Object, 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ]
  ): Unit = js.native
  def executeAction(
    action: js.Function3[
      /* context */ ActionContext, 
      /* params */ js.Object, 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ],
    payload: js.Any
  ): Unit = js.native
  
  /**
    * Getter for store from dispatcher
    */
  def getStore[T /* <: ^[js.Object] */](store: Instantiable[T]): T = js.native
}
