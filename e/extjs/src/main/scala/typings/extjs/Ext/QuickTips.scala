package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.QuickTips")
@js.native
class QuickTips () extends js.Object

/* static members */
@JSGlobal("Ext.QuickTips")
@js.native
object QuickTips extends js.Object {
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
  /** [Method] Destroys the QuickTips instance  */
  def destroy(): Unit = js.native
  /** [Method] Disables quick tips globally  */
  def disable(): Unit = js.native
  /** [Method] Enables quick tips globally  */
  def enable(): Unit = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Gets the single QuickTip instance used to show tips from all registered elements
  		* @returns Ext.tip.QuickTip
  		*/
  def getQuickTip(): typings.extjs.Ext.tip.IQuickTip = js.native
  /** [Method] Initializes the global QuickTips instance and prepare any quick tips
  		* @param autoRender Boolean True to render the QuickTips container immediately to preload images.
  		* @param config Object config object for the created QuickTip. By default, the QuickTip class is instantiated, but this can be changed by supplying an xtype property or a className property in this object. All other properties on this object are configuration for the created component.
  		*/
  def init(): Unit = js.native
  def init(autoRender: Boolean): Unit = js.native
  def init(autoRender: Boolean, config: js.Any): Unit = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  /** [Method] Returns true if quick tips are enabled else false
  		* @returns Boolean
  		*/
  def isEnabled(): Boolean = js.native
  /** [Method] Configures a new quick tip instance and assigns it to a target element
  		* @param config Object The config object
  		*/
  def register(): Unit = js.native
  def register(config: js.Any): Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
  /** [Method] Alias of register
  		* @param config Object The config object
  		*/
  def tips(): Unit = js.native
  def tips(config: js.Any): Unit = js.native
  /** [Method] Removes any registered quick tip from the target element and destroys it
  		* @param el String/HTMLElement/Ext.Element The element from which the quick tip is to be removed or ID of the element.
  		*/
  def unregister(): Unit = js.native
  def unregister(el: js.Any): Unit = js.native
}

