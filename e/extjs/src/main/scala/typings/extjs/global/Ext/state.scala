package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.state.IProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object state {
  
  @JSGlobal("Ext.state.Manager")
  @js.native
  class Manager ()
    extends StObject
       with typings.extjs.Ext.state.Manager
  /* static members */
  object Manager {
    
    @JSGlobal("Ext.state.Manager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Clears a value from the state
      * @param name String The key name
      */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    inline def clear(name: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Returns the current value for a key
      * @param name String The key name
      * @param defaultValue Object The default value to return if the key lookup does not match
      * @returns Object The state data
      */
    inline def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
    inline def get(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def get(name: java.lang.String, defaultValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def get(name: Unit, defaultValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Gets the currently configured state provider
      * @returns Ext.state.Provider The state provider
      */
    inline def getProvider(): IProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getProvider")().asInstanceOf[IProvider]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.state.Manager.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value for a key
      * @param name String The key name
      * @param value Object The state data
      */
    inline def set(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")().asInstanceOf[Unit]
    inline def set(name: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def set(name: java.lang.String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def set(name: Unit, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Configures the default state provider for your application
      * @param stateProvider Ext.state.Provider The state provider to set
      */
    inline def setProvider(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProvider")().asInstanceOf[Unit]
    inline def setProvider(stateProvider: IProvider): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProvider")(stateProvider.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
}
