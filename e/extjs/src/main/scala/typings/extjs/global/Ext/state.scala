package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.state.IProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object state {
  
  @JSGlobal("Ext.state.Manager")
  @js.native
  class Manager ()
    extends typings.extjs.Ext.state.Manager
  /* static members */
  object Manager {
    
    @JSGlobal("Ext.state.Manager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.state.Manager.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.state.Manager.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.state.Manager.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.state.Manager.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.state.Manager.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.state.Manager.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Clears a value from the state
      * @param name String The key name
      */
    @JSGlobal("Ext.state.Manager.clear")
    @js.native
    def clear(): Unit = js.native
    @JSGlobal("Ext.state.Manager.clear")
    @js.native
    def clear(name: java.lang.String): Unit = js.native
    
    /** [Method] Returns the current value for a key
      * @param name String The key name
      * @param defaultValue Object The default value to return if the key lookup does not match
      * @returns Object The state data
      */
    @JSGlobal("Ext.state.Manager.get")
    @js.native
    def get(): js.Any = js.native
    @JSGlobal("Ext.state.Manager.get")
    @js.native
    def get(name: js.UndefOr[scala.Nothing], defaultValue: js.Any): js.Any = js.native
    @JSGlobal("Ext.state.Manager.get")
    @js.native
    def get(name: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.state.Manager.get")
    @js.native
    def get(name: java.lang.String, defaultValue: js.Any): js.Any = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.state.Manager.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.state.Manager.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Gets the currently configured state provider
      * @returns Ext.state.Provider The state provider
      */
    @JSGlobal("Ext.state.Manager.getProvider")
    @js.native
    def getProvider(): IProvider = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.state.Manager.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.state.Manager.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.state.Manager.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value for a key
      * @param name String The key name
      * @param value Object The state data
      */
    @JSGlobal("Ext.state.Manager.set")
    @js.native
    def set(): Unit = js.native
    @JSGlobal("Ext.state.Manager.set")
    @js.native
    def set(name: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
    @JSGlobal("Ext.state.Manager.set")
    @js.native
    def set(name: java.lang.String): Unit = js.native
    @JSGlobal("Ext.state.Manager.set")
    @js.native
    def set(name: java.lang.String, value: js.Any): Unit = js.native
    
    /** [Method] Configures the default state provider for your application
      * @param stateProvider Ext.state.Provider The state provider to set
      */
    @JSGlobal("Ext.state.Manager.setProvider")
    @js.native
    def setProvider(): Unit = js.native
    @JSGlobal("Ext.state.Manager.setProvider")
    @js.native
    def setProvider(stateProvider: IProvider): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.state.Manager.statics")
    @js.native
    def statics(): IClass = js.native
  }
}
