package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.WindowManager")
@js.native
class WindowManager () extends js.Object

/* static members */
@JSGlobal("Ext.WindowManager")
@js.native
object WindowManager extends js.Object {
  /** [Property] (Ext.Class) */
  var self: extjsLib.ExtNs.IClass = js.native
  /** [Method] Brings the specified Component to the front of any other active Components in this ZIndexManager
  		* @param comp String/Object The id of the Component or a Ext.Component instance
  		* @returns Boolean True if the dialog was brought to the front, else false if it was already in front
  		*/
  def bringToFront(): scala.Boolean = js.native
  def bringToFront(comp: js.Any): scala.Boolean = js.native
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
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  def each(): scala.Unit = js.native
  def each(fn: js.Any): scala.Unit = js.native
  def each(fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  def eachBottomUp(): scala.Unit = js.native
  def eachBottomUp(fn: js.Any): scala.Unit = js.native
  def eachBottomUp(fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  def eachTopDown(): scala.Unit = js.native
  def eachTopDown(fn: js.Any): scala.Unit = js.native
  def eachTopDown(fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Gets a registered Component by id
  		* @param id String/Object The id of the Component or a Ext.Component instance
  		* @returns Ext.Component
  		*/
  def get(): extjsLib.ExtNs.IComponent = js.native
  def get(id: js.Any): extjsLib.ExtNs.IComponent = js.native
  /** [Method] Gets the currently active Component in this ZIndexManager
  		* @returns Ext.Component The active Component
  		*/
  def getActive(): extjsLib.ExtNs.IComponent = js.native
  /** [Method] Returns zero or more Components in this ZIndexManager using the custom search function passed to this method
  		* @param fn Function The search function
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component being tested. That gets passed to the function if not specified.
  		* @returns Array An array of zero or more matching windows
  		*/
  def getBy(): extjsLib.ExtNs.Array = js.native
  def getBy(fn: js.Any): extjsLib.ExtNs.Array = js.native
  def getBy(fn: js.Any, scope: js.Any): extjsLib.ExtNs.Array = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Hides all Components managed by this ZIndexManager  */
  def hideAll(): scala.Unit = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): extjsLib.ExtNs.IBase = js.native
  def initConfig(config: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Registers a floating Ext Component with this ZIndexManager
  		* @param comp Ext.Component The Component to register.
  		*/
  def register(): scala.Unit = js.native
  def register(comp: extjsLib.ExtNs.IComponent): scala.Unit = js.native
  /** [Method] Sends the specified Component to the back of other active Components in this ZIndexManager
  		* @param comp String/Object The id of the Component or a Ext.Component instance
  		* @returns Ext.Component The Component
  		*/
  def sendToBack(): extjsLib.ExtNs.IComponent = js.native
  def sendToBack(comp: js.Any): extjsLib.ExtNs.IComponent = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): extjsLib.ExtNs.IClass = js.native
  /** [Method] Unregisters a Ext Component from this ZIndexManager
  		* @param comp Ext.Component The Component to unregister.
  		*/
  def unregister(): scala.Unit = js.native
  def unregister(comp: extjsLib.ExtNs.IComponent): scala.Unit = js.native
}

