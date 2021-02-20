package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.WindowManager")
@js.native
class WindowManager ()
  extends typings.extjs.Ext.WindowManager
/* static members */
object WindowManager {
  
  @JSGlobal("Ext.WindowManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Brings the specified Component to the front of any other active Components in this ZIndexManager
    * @param comp String/Object The id of the Component or a Ext.Component instance
    * @returns Boolean True if the dialog was brought to the front, else false if it was already in front
    */
  @JSGlobal("Ext.WindowManager.bringToFront")
  @js.native
  def bringToFront(): Boolean = js.native
  @JSGlobal("Ext.WindowManager.bringToFront")
  @js.native
  def bringToFront(comp: js.Any): Boolean = js.native
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.WindowManager.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.WindowManager.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.WindowManager.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.WindowManager.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.WindowManager.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.WindowManager.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  @JSGlobal("Ext.WindowManager.each")
  @js.native
  def each(): Unit = js.native
  @JSGlobal("Ext.WindowManager.each")
  @js.native
  def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.WindowManager.each")
  @js.native
  def each(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.WindowManager.each")
  @js.native
  def each(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  @JSGlobal("Ext.WindowManager.eachBottomUp")
  @js.native
  def eachBottomUp(): Unit = js.native
  @JSGlobal("Ext.WindowManager.eachBottomUp")
  @js.native
  def eachBottomUp(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.WindowManager.eachBottomUp")
  @js.native
  def eachBottomUp(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.WindowManager.eachBottomUp")
  @js.native
  def eachBottomUp(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  @JSGlobal("Ext.WindowManager.eachTopDown")
  @js.native
  def eachTopDown(): Unit = js.native
  @JSGlobal("Ext.WindowManager.eachTopDown")
  @js.native
  def eachTopDown(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.WindowManager.eachTopDown")
  @js.native
  def eachTopDown(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.WindowManager.eachTopDown")
  @js.native
  def eachTopDown(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Gets a registered Component by id
    * @param id String/Object The id of the Component or a Ext.Component instance
    * @returns Ext.Component
    */
  @JSGlobal("Ext.WindowManager.get")
  @js.native
  def get(): IComponent = js.native
  @JSGlobal("Ext.WindowManager.get")
  @js.native
  def get(id: js.Any): IComponent = js.native
  
  /** [Method] Gets the currently active Component in this ZIndexManager
    * @returns Ext.Component The active Component
    */
  @JSGlobal("Ext.WindowManager.getActive")
  @js.native
  def getActive(): IComponent = js.native
  
  /** [Method] Returns zero or more Components in this ZIndexManager using the custom search function passed to this method
    * @param fn Function The search function
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component being tested. That gets passed to the function if not specified.
    * @returns Array An array of zero or more matching windows
    */
  @JSGlobal("Ext.WindowManager.getBy")
  @js.native
  def getBy(): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.WindowManager.getBy")
  @js.native
  def getBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.WindowManager.getBy")
  @js.native
  def getBy(fn: js.Any): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.WindowManager.getBy")
  @js.native
  def getBy(fn: js.Any, scope: js.Any): typings.extjs.Ext.Array = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  @JSGlobal("Ext.WindowManager.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.WindowManager.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Hides all Components managed by this ZIndexManager  */
  @JSGlobal("Ext.WindowManager.hideAll")
  @js.native
  def hideAll(): Unit = js.native
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  @JSGlobal("Ext.WindowManager.initConfig")
  @js.native
  def initConfig(): IBase = js.native
  @JSGlobal("Ext.WindowManager.initConfig")
  @js.native
  def initConfig(config: js.Any): IBase = js.native
  
  /** [Method] Registers a floating Ext Component with this ZIndexManager
    * @param comp Ext.Component The Component to register.
    */
  @JSGlobal("Ext.WindowManager.register")
  @js.native
  def register(): Unit = js.native
  @JSGlobal("Ext.WindowManager.register")
  @js.native
  def register(comp: IComponent): Unit = js.native
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.WindowManager.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Sends the specified Component to the back of other active Components in this ZIndexManager
    * @param comp String/Object The id of the Component or a Ext.Component instance
    * @returns Ext.Component The Component
    */
  @JSGlobal("Ext.WindowManager.sendToBack")
  @js.native
  def sendToBack(): IComponent = js.native
  @JSGlobal("Ext.WindowManager.sendToBack")
  @js.native
  def sendToBack(comp: js.Any): IComponent = js.native
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.WindowManager.statics")
  @js.native
  def statics(): IClass = js.native
  
  /** [Method] Unregisters a Ext Component from this ZIndexManager
    * @param comp Ext.Component The Component to unregister.
    */
  @JSGlobal("Ext.WindowManager.unregister")
  @js.native
  def unregister(): Unit = js.native
  @JSGlobal("Ext.WindowManager.unregister")
  @js.native
  def unregister(comp: IComponent): Unit = js.native
}
