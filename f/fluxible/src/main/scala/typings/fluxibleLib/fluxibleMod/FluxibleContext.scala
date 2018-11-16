package typings
package fluxibleLib.fluxibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible", "FluxibleContext")
@js.native
class FluxibleContext () extends js.Object {
  /**
       * @param options The options sharable by the context and context plugins
       */
  
  def this(options: FluxibleConfiguration) = this()
  /**
       * Returns a serializable context state
       */
  def dehydrate(): js.Any = js.native
  /**
       * Returns the context for action controllers
       * @return Action context information
       */
  def getActionContext(): ActionContext = js.native
  /**
       * Returns the context for action controllers
       * @return Component context information
       */
  def getComponentContext(): ComponentContext = js.native
  /**
       * Getter for store from dispatcher
       */
  def getStore[T /* <: fluxibleLib.addonsBaseStoreMod.namespaced[js.Object] */](store: fluxibleLib.Anon_Dispatcher[T]): T = js.native
  /**
       * Returns the context for stores
       * @return Store context information
       */
  def getStoreContext(): StoreContext = js.native
  /**
       * Provides plugin mechanism for adding application level settings that are persisted
       * between server/client and also modification of the FluxibleContext
       */
  def plug(plugin: js.Any): scala.Unit = js.native
  /**
       * Rehydrates the context state
       */
  def rehydrate(state: js.Any): scala.Unit = js.native
}

