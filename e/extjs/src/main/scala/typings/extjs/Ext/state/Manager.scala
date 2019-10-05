package typings.extjs.Ext.state

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.state.Manager")
@js.native
class Manager () extends js.Object

/* static members */
@JSGlobal("Ext.state.Manager")
@js.native
object Manager extends js.Object {
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] Clears a value from the state
  		* @param name String The key name
  		*/
  def clear(): Unit = js.native
  def clear(name: java.lang.String): Unit = js.native
  /** [Method] Returns the current value for a key
  		* @param name String The key name
  		* @param defaultValue Object The default value to return if the key lookup does not match
  		* @returns Object The state data
  		*/
  def get(): js.Any = js.native
  def get(name: java.lang.String): js.Any = js.native
  def get(name: java.lang.String, defaultValue: js.Any): js.Any = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Gets the currently configured state provider
  		* @returns Ext.state.Provider The state provider
  		*/
  def getProvider(): IProvider = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  /** [Method] Sets the value for a key
  		* @param name String The key name
  		* @param value Object The state data
  		*/
  def set(): Unit = js.native
  def set(name: java.lang.String): Unit = js.native
  def set(name: java.lang.String, value: js.Any): Unit = js.native
  /** [Method] Configures the default state provider for your application
  		* @param stateProvider Ext.state.Provider The state provider to set
  		*/
  def setProvider(): Unit = js.native
  def setProvider(stateProvider: IProvider): Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
}

