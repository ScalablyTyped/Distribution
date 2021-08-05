package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.tip.IQuickTip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tip {
  
  @JSGlobal("Ext.tip.QuickTipManager")
  @js.native
  class QuickTipManager ()
    extends StObject
       with typings.extjs.Ext.tip.QuickTipManager
  /* static members */
  object QuickTipManager {
    
    @JSGlobal("Ext.tip.QuickTipManager")
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
    
    /** [Method] Destroys the QuickTips instance  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Disables quick tips globally  */
    inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
    
    /** [Method] Enables quick tips globally  */
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Gets the single QuickTip instance used to show tips from all registered elements
      * @returns Ext.tip.QuickTip
      */
    inline def getQuickTip(): IQuickTip = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuickTip")().asInstanceOf[IQuickTip]
    
    /** [Method] Initializes the global QuickTips instance and prepare any quick tips
      * @param autoRender Boolean True to render the QuickTips container immediately to preload images.
      * @param config Object config object for the created QuickTip. By default, the QuickTip class is instantiated, but this can be changed by supplying an xtype property or a className property in this object. All other properties on this object are configuration for the created component.
      */
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(autoRender: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(autoRender.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def init(autoRender: Boolean, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(autoRender.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(autoRender: Unit, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(autoRender.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Returns true if quick tips are enabled else false
      * @returns Boolean
      */
    inline def isEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")().asInstanceOf[Boolean]
    
    /** [Method] Configures a new quick tip instance and assigns it to a target element
      * @param config Object The config object
      */
    inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
    inline def register(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.tip.QuickTipManager.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Alias of register
      * @param config Object The config object
      */
    inline def tips(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tips")().asInstanceOf[Unit]
    inline def tips(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tips")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Removes any registered quick tip from the target element and destroys it
      * @param el String/HTMLElement/Ext.Element The element from which the quick tip is to be removed or ID of the element.
      */
    inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
    inline def unregister(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
