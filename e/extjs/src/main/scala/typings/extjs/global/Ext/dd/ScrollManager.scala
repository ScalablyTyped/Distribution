package typings.extjs.global.Ext.dd

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.dd.ScrollManager")
@js.native
class ScrollManager ()
  extends typings.extjs.Ext.dd.ScrollManager
/* static members */
@JSGlobal("Ext.dd.ScrollManager")
@js.native
object ScrollManager extends js.Object {
  
  /** [Property] (Number) */
  var animDuration: Double = js.native
  
  /** [Property] (Boolean) */
  var animate: Boolean = js.native
  
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
  
  /** [Property] (String) */
  var ddGroup: String = js.native
  
  /** [Property] (Number) */
  var frequency: Double = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  
  /** [Property] (Number) */
  var hthresh: Double = js.native
  
  /** [Property] (Number) */
  var increment: Double = js.native
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  
  /** [Method] Manually trigger a cache refresh  */
  def refreshCache(): Unit = js.native
  
  /** [Method] Registers new overflow element s to auto scroll
    * @param el String/HTMLElement/Ext.Element/String[]/HTMLElement[]/Ext.Element[] The id of or the element to be scrolled or an array of either
    */
  def register(): Unit = js.native
  def register(el: js.Any): Unit = js.native
  
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  def statics(): IClass = js.native
  
  /** [Method] Unregisters overflow element s so they are no longer scrolled
    * @param el String/HTMLElement/Ext.Element/String[]/HTMLElement[]/Ext.Element[] The id of or the element to be removed or an array of either
    */
  def unregister(): Unit = js.native
  def unregister(el: js.Any): Unit = js.native
  
  /** [Property] (Number) */
  var vthresh: Double = js.native
}
