package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.app.IController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object app {
  
  @JSGlobal("Ext.app.EventBus")
  @js.native
  open class EventBus ()
    extends StObject
       with typings.extjs.Ext.app.EventBus
  /* static members */
  object EventBus {
    
    @JSGlobal("Ext.app.EventBus")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Adds a set of component event listeners for a controller
      * @param selectors Object Config object containing selectors and listeners.
      * @param controller Ext.app.Controller The listening controller instance.
      */
    inline def control(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("control")().asInstanceOf[Unit]
    inline def control(selectors: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("control")(selectors.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def control(selectors: Any, controller: IController): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("control")(selectors.asInstanceOf[js.Any], controller.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def control(selectors: Unit, controller: IController): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("control")(selectors.asInstanceOf[js.Any], controller.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Adds a set of event domain listeners for a controller
      * @param to Object Config object containing domains, selectors and listeners.
      * @param controller Ext.app.Controller The listening controller instance.
      */
    inline def listen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")().asInstanceOf[Unit]
    inline def listen(to: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(to.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def listen(to: Any, controller: IController): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(to.asInstanceOf[js.Any], controller.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def listen(to: Unit, controller: IController): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(to.asInstanceOf[js.Any], controller.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.app.EventBus.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Removes all of a controller s attached listeners
      * @param controllerId String The id of the controller.
      */
    inline def unlisten(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlisten")().asInstanceOf[Unit]
    inline def unlisten(controllerId: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlisten")(controllerId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object domain {
    
    @JSGlobal("Ext.app.domain.Component")
    @js.native
    open class Component ()
      extends StObject
         with typings.extjs.Ext.app.domain.Component
    /* static members */
    object Component {
      
      @JSGlobal("Ext.app.domain.Component")
      @js.native
      val ^ : js.Any = js.native
      
      /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
        * @returns Object Returns the result of calling the overridden method
        */
      inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
      inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Call the parent method of the current method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
        * @returns Object Returns the result of calling the parent method
        */
      inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
      inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
        * @returns Object Returns the result of calling the superclass method
        */
      inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
      inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
      inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Initialize configuration for this class
        * @param config Object
        * @returns Ext.Base this
        */
      inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
      inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
      
      /** [Method] This method matches the firer of the event the target to the given selector
        * @param target Object
        * @param selector Object
        * @returns Boolean true if the target matches the selector.
        */
      inline def `match`(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("match")().asInstanceOf[Boolean]
      inline def `match`(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def `match`(target: Any, selector: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def `match`(target: Unit, selector: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /** [Method] This method is called by the derived class to monitor fireEvent calls
        * @param observable Ext.Class The Observable to monitor for events.
        */
      inline def monitor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monitor")().asInstanceOf[Unit]
      inline def monitor(observable: IClass): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.app.domain.Component.self")
      @js.native
      def self: IClass = js.native
      inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    }
    
    @JSGlobal("Ext.app.domain.Controller")
    @js.native
    open class Controller ()
      extends StObject
         with typings.extjs.Ext.app.domain.Controller
    /* static members */
    object Controller {
      
      @JSGlobal("Ext.app.domain.Controller")
      @js.native
      val ^ : js.Any = js.native
      
      /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
        * @returns Object Returns the result of calling the overridden method
        */
      inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
      inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Call the parent method of the current method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
        * @returns Object Returns the result of calling the parent method
        */
      inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
      inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
        * @returns Object Returns the result of calling the superclass method
        */
      inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
      inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
      inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Config Option] (String) */
      @JSGlobal("Ext.app.domain.Controller.idProperty")
      @js.native
      def idProperty: java.lang.String = js.native
      inline def idProperty_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(x.asInstanceOf[js.Any])
      
      /** [Method] Initialize configuration for this class
        * @param config Object
        * @returns Ext.Base this
        */
      inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
      inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
      
      /** [Method] This method matches the firer of the event the target to the given selector
        * @param target Object The firer of the event.
        * @param selector String The selector to which to match the target.
        * @returns Boolean true if the target matches the selector.
        */
      inline def `match`(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("match")().asInstanceOf[Boolean]
      inline def `match`(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def `match`(target: Any, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def `match`(target: Unit, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /** [Method] This method is called by the derived class to monitor fireEvent calls
        * @param observable Ext.Class The Observable to monitor for events.
        */
      inline def monitor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monitor")().asInstanceOf[Unit]
      inline def monitor(observable: IClass): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.app.domain.Controller.self")
      @js.native
      def self: IClass = js.native
      inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    }
    
    @JSGlobal("Ext.app.domain.Direct")
    @js.native
    open class Direct ()
      extends StObject
         with typings.extjs.Ext.app.domain.Direct
    /* static members */
    object Direct {
      
      @JSGlobal("Ext.app.domain.Direct")
      @js.native
      val ^ : js.Any = js.native
      
      /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
        * @returns Object Returns the result of calling the overridden method
        */
      inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
      inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Call the parent method of the current method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
        * @returns Object Returns the result of calling the parent method
        */
      inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
      inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
        * @returns Object Returns the result of calling the superclass method
        */
      inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
      inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
      inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Config Option] (String) */
      @JSGlobal("Ext.app.domain.Direct.idProperty")
      @js.native
      def idProperty: java.lang.String = js.native
      inline def idProperty_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(x.asInstanceOf[js.Any])
      
      /** [Method] Initialize configuration for this class
        * @param config Object
        * @returns Ext.Base this
        */
      inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
      inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
      
      /** [Method] This method matches the firer of the event the target to the given selector
        * @param target Object The firer of the event.
        * @param selector String The selector to which to match the target.
        * @returns Boolean true if the target matches the selector.
        */
      inline def `match`(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("match")().asInstanceOf[Boolean]
      inline def `match`(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def `match`(target: Any, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def `match`(target: Unit, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /** [Method] This method is called by the derived class to monitor fireEvent calls
        * @param observable Ext.Class The Observable to monitor for events.
        */
      inline def monitor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monitor")().asInstanceOf[Unit]
      inline def monitor(observable: IClass): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.app.domain.Direct.self")
      @js.native
      def self: IClass = js.native
      inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    }
    
    @JSGlobal("Ext.app.domain.Global")
    @js.native
    open class Global ()
      extends StObject
         with typings.extjs.Ext.app.domain.Global
    /* static members */
    object Global {
      
      @JSGlobal("Ext.app.domain.Global")
      @js.native
      val ^ : js.Any = js.native
      
      /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
        * @returns Object Returns the result of calling the overridden method
        */
      inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
      inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Call the parent method of the current method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
        * @returns Object Returns the result of calling the parent method
        */
      inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
      inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
        * @returns Object Returns the result of calling the superclass method
        */
      inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
      inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
      inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Initialize configuration for this class
        * @param config Object
        * @returns Ext.Base this
        */
      inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
      inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
      
      /** [Method] This method matches the firer of the event the target to the given selector
        * @returns Boolean true if the target matches the selector.
        */
      inline def `match`(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("match")().asInstanceOf[Boolean]
      
      /** [Method] This method is called by the derived class to monitor fireEvent calls
        * @param observable Ext.Class The Observable to monitor for events.
        */
      inline def monitor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monitor")().asInstanceOf[Unit]
      inline def monitor(observable: IClass): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.app.domain.Global.self")
      @js.native
      def self: IClass = js.native
      inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    }
    
    @JSGlobal("Ext.app.domain.Store")
    @js.native
    open class Store ()
      extends StObject
         with typings.extjs.Ext.app.domain.Store
    /* static members */
    object Store {
      
      @JSGlobal("Ext.app.domain.Store")
      @js.native
      val ^ : js.Any = js.native
      
      /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
        * @returns Object Returns the result of calling the overridden method
        */
      inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
      inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Call the parent method of the current method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
        * @returns Object Returns the result of calling the parent method
        */
      inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
      inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
        * @returns Object Returns the result of calling the superclass method
        */
      inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
      inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
      inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /** [Config Option] (String) */
      @JSGlobal("Ext.app.domain.Store.idProperty")
      @js.native
      def idProperty: java.lang.String = js.native
      inline def idProperty_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(x.asInstanceOf[js.Any])
      
      /** [Method] Initialize configuration for this class
        * @param config Object
        * @returns Ext.Base this
        */
      inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
      inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
      
      /** [Method] This method matches the firer of the event the target to the given selector
        * @param target Object The firer of the event.
        * @param selector String The selector to which to match the target.
        * @returns Boolean true if the target matches the selector.
        */
      inline def `match`(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("match")().asInstanceOf[Boolean]
      inline def `match`(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def `match`(target: Any, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def `match`(target: Unit, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /** [Method] This method is called by the derived class to monitor fireEvent calls
        * @param observable Ext.Class The Observable to monitor for events.
        */
      inline def monitor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monitor")().asInstanceOf[Unit]
      inline def monitor(observable: IClass): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monitor")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.app.domain.Store.self")
      @js.native
      def self: IClass = js.native
      inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    }
  }
}
