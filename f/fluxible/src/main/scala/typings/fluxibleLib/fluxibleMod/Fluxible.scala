package typings
package fluxibleLib.fluxibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible", "Fluxible")
@js.native
/**
  * @param [options]
  * @example
  *      var app = new Fluxible({
  *          component: require('./components/App.jsx')
  *      });
  */
class Fluxible () extends js.Object {
  def this(options: FluxibleConfiguration) = this()
  /**
    * Creates an isolated context for a request/session
    * @param [contextOptions] The options object.  Please refer to FluxibleContext's constructor
    *         doc for supported subfields and detailed description.
    */
  def createContext(): FluxibleContext = js.native
  def createContext(contextOptions: js.Any): FluxibleContext = js.native
  /**
    * Creates a new dispatcher instance using the application's dispatchr class. Used by
    * FluxibleContext to create new dispatcher instance
    * @param contextOptions The context options to be provided to each store instance
    */
  def createDispatcherInstance(): dispatchrLib.dispatchrMod.Dispatcher = js.native
  def createDispatcherInstance(contextOptions: js.Any): dispatchrLib.dispatchrMod.Dispatcher = js.native
  /**
    * Creates a serializable state of the application and a given context for sending to the client
    * @param context
    */
  def dehydrate(): js.Any = js.native
  def dehydrate(context: FluxibleContext): js.Any = js.native
  /**
    * Getter for the top level react component for the application
    */
  def getComponent(): js.Any = js.native
  /**
    * Provides access to a plugin instance by name
    * @param pluginName The plugin name
    */
  def getPlugin(pluginName: java.lang.String): js.Any = js.native
  /**
    * Provides plugin mechanism for adding application level settings that are persisted
    * between server/client and also modification of the FluxibleContext
    * @param plugin
    * @param plugin.name Name of the plugin
    * @param plugin.plugContext Method called after context is created to allow
    *  dynamically plugging the context
    * @param [plugin.dehydrate] Method called to serialize the plugin settings to be persisted
    *  to the client
    * @param [plugin.rehydrate] Method called to rehydrate the plugin settings from the server
    */
  def plug(plugin: js.Any): scala.Unit = js.native
  /**
    * Registers a store to the dispatcher so it can listen for actions
    */
  def registerStore(store: dispatchrLib.dispatchrMod.StoreClass): scala.Unit = js.native
  def registerStore(
    store: org.scalablytyped.runtime.Instantiable1[
      /* dispatcher */ dispatchrLib.dispatchrMod.DispatcherInterface, 
      fluxibleLib.addonsBaseStoreMod.^[js.Object]
    ]
  ): scala.Unit = js.native
  /**
    * Rehydrates the application and creates a new context with the state from the server
    * @param obj Raw object of dehydrated state
    * @param obj.plugins Dehydrated app plugin state
    * @param obj.context Dehydrated context state. See FluxibleContext's
    *                 rehydrate() for subfields in this object.
    * @param callback
    * @async Rehydration may require more asset loading or async IO calls
    */
  def rehydrate(state: js.Any): scala.Unit = js.native
}

