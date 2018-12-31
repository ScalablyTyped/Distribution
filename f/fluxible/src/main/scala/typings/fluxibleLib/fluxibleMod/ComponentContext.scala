package typings
package fluxibleLib.fluxibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
      /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def executeAction(
    action: js.Function3[
      /* context */ ActionContext, 
      /* params */ js.Object, 
      /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
      scala.Unit
    ],
    payload: js.Any
  ): scala.Unit = js.native
  /**
    * Getter for store from dispatcher
    */
  def getStore[T /* <: fluxibleLib.addonsBaseStoreMod.namespaced[js.Object] */](store: fluxibleLib.Anon_Dispatcher[T]): T = js.native
}

