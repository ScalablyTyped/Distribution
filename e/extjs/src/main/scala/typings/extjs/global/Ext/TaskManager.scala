package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.TaskManager")
@js.native
class TaskManager ()
  extends StObject
     with typings.extjs.Ext.TaskManager
/* static members */
object TaskManager {
  
  @JSGlobal("Ext.TaskManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @scala.inline
  def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
  @scala.inline
  def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @scala.inline
  def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
  @scala.inline
  def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @scala.inline
  def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
  @scala.inline
  def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Destroys this instance stopping all tasks that are currently running  */
  @scala.inline
  def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  @scala.inline
  def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
  @scala.inline
  def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  @scala.inline
  def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
  @scala.inline
  def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
  
  /** [Method] Creates a new Task instance
    * @param config Object The config object. For details on the supported properties, see start.
    */
  @scala.inline
  def newTask(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("newTask")().asInstanceOf[Unit]
  @scala.inline
  def newTask(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("newTask")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  @scala.inline
  def start(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Any]
  @scala.inline
  def start(task: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(task.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @scala.inline
  def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Stops an existing running task
    * @param task Object The task to stop
    * @returns Object The task
    */
  @scala.inline
  def stop(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[js.Any]
  @scala.inline
  def stop(task: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(task.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Stops all tasks that are currently running  */
  @scala.inline
  def stopAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAll")().asInstanceOf[Unit]
}
