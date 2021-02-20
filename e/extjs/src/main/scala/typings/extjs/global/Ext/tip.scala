package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.tip.IQuickTip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tip {
  
  @JSGlobal("Ext.tip.QuickTipManager")
  @js.native
  class QuickTipManager ()
    extends typings.extjs.Ext.tip.QuickTipManager
  /* static members */
  object QuickTipManager {
    
    @JSGlobal("Ext.tip.QuickTipManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.tip.QuickTipManager.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.tip.QuickTipManager.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.tip.QuickTipManager.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.tip.QuickTipManager.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.tip.QuickTipManager.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.tip.QuickTipManager.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Destroys the QuickTips instance  */
    @JSGlobal("Ext.tip.QuickTipManager.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Disables quick tips globally  */
    @JSGlobal("Ext.tip.QuickTipManager.disable")
    @js.native
    def disable(): Unit = js.native
    
    /** [Method] Enables quick tips globally  */
    @JSGlobal("Ext.tip.QuickTipManager.enable")
    @js.native
    def enable(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.tip.QuickTipManager.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.tip.QuickTipManager.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Gets the single QuickTip instance used to show tips from all registered elements
      * @returns Ext.tip.QuickTip
      */
    @JSGlobal("Ext.tip.QuickTipManager.getQuickTip")
    @js.native
    def getQuickTip(): IQuickTip = js.native
    
    /** [Method] Initializes the global QuickTips instance and prepare any quick tips
      * @param autoRender Boolean True to render the QuickTips container immediately to preload images.
      * @param config Object config object for the created QuickTip. By default, the QuickTip class is instantiated, but this can be changed by supplying an xtype property or a className property in this object. All other properties on this object are configuration for the created component.
      */
    @JSGlobal("Ext.tip.QuickTipManager.init")
    @js.native
    def init(): Unit = js.native
    @JSGlobal("Ext.tip.QuickTipManager.init")
    @js.native
    def init(autoRender: js.UndefOr[scala.Nothing], config: js.Any): Unit = js.native
    @JSGlobal("Ext.tip.QuickTipManager.init")
    @js.native
    def init(autoRender: Boolean): Unit = js.native
    @JSGlobal("Ext.tip.QuickTipManager.init")
    @js.native
    def init(autoRender: Boolean, config: js.Any): Unit = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.tip.QuickTipManager.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.tip.QuickTipManager.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Returns true if quick tips are enabled else false
      * @returns Boolean
      */
    @JSGlobal("Ext.tip.QuickTipManager.isEnabled")
    @js.native
    def isEnabled(): Boolean = js.native
    
    /** [Method] Configures a new quick tip instance and assigns it to a target element
      * @param config Object The config object
      */
    @JSGlobal("Ext.tip.QuickTipManager.register")
    @js.native
    def register(): Unit = js.native
    @JSGlobal("Ext.tip.QuickTipManager.register")
    @js.native
    def register(config: js.Any): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.tip.QuickTipManager.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.tip.QuickTipManager.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Alias of register
      * @param config Object The config object
      */
    @JSGlobal("Ext.tip.QuickTipManager.tips")
    @js.native
    def tips(): Unit = js.native
    @JSGlobal("Ext.tip.QuickTipManager.tips")
    @js.native
    def tips(config: js.Any): Unit = js.native
    
    /** [Method] Removes any registered quick tip from the target element and destroys it
      * @param el String/HTMLElement/Ext.Element The element from which the quick tip is to be removed or ID of the element.
      */
    @JSGlobal("Ext.tip.QuickTipManager.unregister")
    @js.native
    def unregister(): Unit = js.native
    @JSGlobal("Ext.tip.QuickTipManager.unregister")
    @js.native
    def unregister(el: js.Any): Unit = js.native
  }
}
