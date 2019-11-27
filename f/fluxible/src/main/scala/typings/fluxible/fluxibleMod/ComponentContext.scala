package typings.fluxible.fluxibleMod

import typings.fluxible.Anon_Dispatcher
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
  def getStore[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BaseStore */ js.Any */](store: Anon_Dispatcher[T]): T = js.native
}

