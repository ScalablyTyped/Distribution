package typings.fluxible.mod

import typings.fluxible.AnonCreate
import typings.fluxible.AnonInstantiable
import typings.fluxible.baseStoreMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible", "ActionContext")
@js.native
class ActionContext () extends js.Object {
  /**
    * Data service. available only if fetch plugin is added
    */
  var service: js.UndefOr[AnonCreate] = js.native
  /**
    * Dispatches a payload to all registered callbacks.
    * @param action Action name
    * @param payload
    */
  def dispatch(action: String): Unit = js.native
  def dispatch(action: String, payload: js.Any): Unit = js.native
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
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ]
  ): Unit = js.native
  def executeAction(
    action: js.Function3[
      /* context */ this.type, 
      /* params */ js.Object, 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ],
    payload: js.Any
  ): Unit = js.native
  def executeAction(
    action: js.Function3[
      /* context */ this.type, 
      /* params */ js.Object, 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ],
    payload: js.Any,
    callback: js.Any
  ): Unit = js.native
  /**
    * Getter for store from dispatcher
    */
  def getStore[T /* <: ^[js.Object] */](store: AnonInstantiable[T]): T = js.native
}

