package typings
package fluxibleLib.fluxibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible", "ActionContext")
@js.native
class ActionContext () extends js.Object {
  /**
    * Data service. available only if fetch plugin is added
    */
  var service: js.UndefOr[fluxibleLib.Anon_Body] = js.native
  /**
    * Dispatches a payload to all registered callbacks.
    * @param action Action name
    * @param payload
    */
  def dispatch(action: java.lang.String): scala.Unit = js.native
  def dispatch(action: java.lang.String, payload: js.Any): scala.Unit = js.native
  /**
    * Proxy function to execute action
    * @param action function that will be executed
    * @param payload
    * @param callback
    */
  def executeAction(
    action: js.Function3[
      /* context */ this.type, 
      /* params */ js.Object, 
      /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def executeAction(
    action: js.Function3[
      /* context */ this.type, 
      /* params */ js.Object, 
      /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
      scala.Unit
    ],
    payload: js.Any
  ): scala.Unit = js.native
  def executeAction(
    action: js.Function3[
      /* context */ this.type, 
      /* params */ js.Object, 
      /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
      scala.Unit
    ],
    payload: js.Any,
    callback: js.Any
  ): scala.Unit = js.native
  /**
    * Getter for store from dispatcher
    */
  def getStore[T /* <: fluxibleLib.addonsBaseStoreMod.^[js.Object] */](store: fluxibleLib.Anon_Dispatcher[T]): T = js.native
}

