package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.TaskManager")
@js.native
class TaskManager ()
  extends typings.extjs.Ext.TaskManager
/* static members */
object TaskManager {
  
  @JSGlobal("Ext.TaskManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.TaskManager.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.TaskManager.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.TaskManager.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.TaskManager.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.TaskManager.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.TaskManager.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Destroys this instance stopping all tasks that are currently running  */
  @JSGlobal("Ext.TaskManager.destroy")
  @js.native
  def destroy(): Unit = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  @JSGlobal("Ext.TaskManager.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.TaskManager.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  @JSGlobal("Ext.TaskManager.initConfig")
  @js.native
  def initConfig(): IBase = js.native
  @JSGlobal("Ext.TaskManager.initConfig")
  @js.native
  def initConfig(config: js.Any): IBase = js.native
  
  /** [Method] Creates a new Task instance
    * @param config Object The config object. For details on the supported properties, see start.
    */
  @JSGlobal("Ext.TaskManager.newTask")
  @js.native
  def newTask(): Unit = js.native
  @JSGlobal("Ext.TaskManager.newTask")
  @js.native
  def newTask(config: js.Any): Unit = js.native
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.TaskManager.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Starts a new task
    * @param task Object A config object that supports the following properties:
    * @returns Object The task
    */
  @JSGlobal("Ext.TaskManager.start")
  @js.native
  def start(): js.Any = js.native
  @JSGlobal("Ext.TaskManager.start")
  @js.native
  def start(task: js.Any): js.Any = js.native
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.TaskManager.statics")
  @js.native
  def statics(): IClass = js.native
  
  /** [Method] Stops an existing running task
    * @param task Object The task to stop
    * @returns Object The task
    */
  @JSGlobal("Ext.TaskManager.stop")
  @js.native
  def stop(): js.Any = js.native
  @JSGlobal("Ext.TaskManager.stop")
  @js.native
  def stop(task: js.Any): js.Any = js.native
  
  /** [Method] Stops all tasks that are currently running  */
  @JSGlobal("Ext.TaskManager.stopAll")
  @js.native
  def stopAll(): Unit = js.native
}
