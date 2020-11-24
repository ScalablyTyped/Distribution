package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.app.IController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.app")
@js.native
object app extends js.Object {
  
  @js.native
  class EventBus ()
    extends typings.extjs.Ext.app.EventBus
  /* static members */
  @js.native
  object EventBus extends js.Object {
    
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
    
    /** [Method] Adds a set of component event listeners for a controller
      * @param selectors Object Config object containing selectors and listeners.
      * @param controller Ext.app.Controller The listening controller instance.
      */
    def control(): Unit = js.native
    def control(selectors: js.UndefOr[scala.Nothing], controller: IController): Unit = js.native
    def control(selectors: js.Any): Unit = js.native
    def control(selectors: js.Any, controller: IController): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    def getInitialConfig(): js.Any = js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    def initConfig(): IBase = js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Adds a set of event domain listeners for a controller
      * @param to Object Config object containing domains, selectors and listeners.
      * @param controller Ext.app.Controller The listening controller instance.
      */
    def listen(): Unit = js.native
    def listen(to: js.UndefOr[scala.Nothing], controller: IController): Unit = js.native
    def listen(to: js.Any): Unit = js.native
    def listen(to: js.Any, controller: IController): Unit = js.native
    
    /** [Property] (Ext.Class) */
    var self: IClass = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
    
    /** [Method] Removes all of a controller s attached listeners
      * @param controllerId String The id of the controller.
      */
    def unlisten(): Unit = js.native
    def unlisten(controllerId: java.lang.String): Unit = js.native
  }
  
  @js.native
  object domain extends js.Object {
    
    @js.native
    class Component ()
      extends typings.extjs.Ext.app.domain.Component
    /* static members */
    @js.native
    object Component extends js.Object {
      
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
      
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      def getInitialConfig(): js.Any = js.native
      def getInitialConfig(name: java.lang.String): js.Any = js.native
      
      /** [Method] Initialize configuration for this class
        * @param config Object
        * @returns Ext.Base this
        */
      def initConfig(): IBase = js.native
      def initConfig(config: js.Any): IBase = js.native
      
      /** [Method] This method matches the firer of the event the target to the given selector
        * @param target Object
        * @param selector Object
        * @returns Boolean true if the target matches the selector.
        */
      def `match`(): Boolean = js.native
      def `match`(target: js.UndefOr[scala.Nothing], selector: js.Any): Boolean = js.native
      def `match`(target: js.Any): Boolean = js.native
      def `match`(target: js.Any, selector: js.Any): Boolean = js.native
      
      /** [Method] This method is called by the derived class to monitor fireEvent calls
        * @param observable Ext.Class The Observable to monitor for events.
        */
      def monitor(): Unit = js.native
      def monitor(observable: IClass): Unit = js.native
      
      /** [Property] (Ext.Class) */
      var self: IClass = js.native
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      def statics(): IClass = js.native
    }
    
    @js.native
    class Controller ()
      extends typings.extjs.Ext.app.domain.Controller
    /* static members */
    @js.native
    object Controller extends js.Object {
      
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
      
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      def getInitialConfig(): js.Any = js.native
      def getInitialConfig(name: java.lang.String): js.Any = js.native
      
      /** [Config Option] (String) */
      var idProperty: java.lang.String = js.native
      
      /** [Method] Initialize configuration for this class
        * @param config Object
        * @returns Ext.Base this
        */
      def initConfig(): IBase = js.native
      def initConfig(config: js.Any): IBase = js.native
      
      /** [Method] This method matches the firer of the event the target to the given selector
        * @param target Object The firer of the event.
        * @param selector String The selector to which to match the target.
        * @returns Boolean true if the target matches the selector.
        */
      def `match`(): Boolean = js.native
      def `match`(target: js.UndefOr[scala.Nothing], selector: java.lang.String): Boolean = js.native
      def `match`(target: js.Any): Boolean = js.native
      def `match`(target: js.Any, selector: java.lang.String): Boolean = js.native
      
      /** [Method] This method is called by the derived class to monitor fireEvent calls
        * @param observable Ext.Class The Observable to monitor for events.
        */
      def monitor(): Unit = js.native
      def monitor(observable: IClass): Unit = js.native
      
      /** [Property] (Ext.Class) */
      var self: IClass = js.native
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      def statics(): IClass = js.native
    }
    
    @js.native
    class Direct ()
      extends typings.extjs.Ext.app.domain.Direct
    /* static members */
    @js.native
    object Direct extends js.Object {
      
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
      
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      def getInitialConfig(): js.Any = js.native
      def getInitialConfig(name: java.lang.String): js.Any = js.native
      
      /** [Config Option] (String) */
      var idProperty: java.lang.String = js.native
      
      /** [Method] Initialize configuration for this class
        * @param config Object
        * @returns Ext.Base this
        */
      def initConfig(): IBase = js.native
      def initConfig(config: js.Any): IBase = js.native
      
      /** [Method] This method matches the firer of the event the target to the given selector
        * @param target Object The firer of the event.
        * @param selector String The selector to which to match the target.
        * @returns Boolean true if the target matches the selector.
        */
      def `match`(): Boolean = js.native
      def `match`(target: js.UndefOr[scala.Nothing], selector: java.lang.String): Boolean = js.native
      def `match`(target: js.Any): Boolean = js.native
      def `match`(target: js.Any, selector: java.lang.String): Boolean = js.native
      
      /** [Method] This method is called by the derived class to monitor fireEvent calls
        * @param observable Ext.Class The Observable to monitor for events.
        */
      def monitor(): Unit = js.native
      def monitor(observable: IClass): Unit = js.native
      
      /** [Property] (Ext.Class) */
      var self: IClass = js.native
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      def statics(): IClass = js.native
    }
    
    @js.native
    class Global ()
      extends typings.extjs.Ext.app.domain.Global
    /* static members */
    @js.native
    object Global extends js.Object {
      
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
      
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      def getInitialConfig(): js.Any = js.native
      def getInitialConfig(name: java.lang.String): js.Any = js.native
      
      /** [Method] Initialize configuration for this class
        * @param config Object
        * @returns Ext.Base this
        */
      def initConfig(): IBase = js.native
      def initConfig(config: js.Any): IBase = js.native
      
      /** [Method] This method matches the firer of the event the target to the given selector
        * @returns Boolean true if the target matches the selector.
        */
      def `match`(): Boolean = js.native
      
      /** [Method] This method is called by the derived class to monitor fireEvent calls
        * @param observable Ext.Class The Observable to monitor for events.
        */
      def monitor(): Unit = js.native
      def monitor(observable: IClass): Unit = js.native
      
      /** [Property] (Ext.Class) */
      var self: IClass = js.native
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      def statics(): IClass = js.native
    }
    
    @js.native
    class Store ()
      extends typings.extjs.Ext.app.domain.Store
    /* static members */
    @js.native
    object Store extends js.Object {
      
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
      
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      def getInitialConfig(): js.Any = js.native
      def getInitialConfig(name: java.lang.String): js.Any = js.native
      
      /** [Config Option] (String) */
      var idProperty: java.lang.String = js.native
      
      /** [Method] Initialize configuration for this class
        * @param config Object
        * @returns Ext.Base this
        */
      def initConfig(): IBase = js.native
      def initConfig(config: js.Any): IBase = js.native
      
      /** [Method] This method matches the firer of the event the target to the given selector
        * @param target Object The firer of the event.
        * @param selector String The selector to which to match the target.
        * @returns Boolean true if the target matches the selector.
        */
      def `match`(): Boolean = js.native
      def `match`(target: js.UndefOr[scala.Nothing], selector: java.lang.String): Boolean = js.native
      def `match`(target: js.Any): Boolean = js.native
      def `match`(target: js.Any, selector: java.lang.String): Boolean = js.native
      
      /** [Method] This method is called by the derived class to monitor fireEvent calls
        * @param observable Ext.Class The Observable to monitor for events.
        */
      def monitor(): Unit = js.native
      def monitor(observable: IClass): Unit = js.native
      
      /** [Property] (Ext.Class) */
      var self: IClass = js.native
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      def statics(): IClass = js.native
    }
  }
}
