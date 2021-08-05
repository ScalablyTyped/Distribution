package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.WindowManager")
@js.native
class WindowManager ()
  extends StObject
     with typings.extjs.Ext.WindowManager
/* static members */
object WindowManager {
  
  @JSGlobal("Ext.WindowManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Brings the specified Component to the front of any other active Components in this ZIndexManager
    * @param comp String/Object The id of the Component or a Ext.Component instance
    * @returns Boolean True if the dialog was brought to the front, else false if it was already in front
    */
  inline def bringToFront(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("bringToFront")().asInstanceOf[Boolean]
  inline def bringToFront(comp: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("bringToFront")(comp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  inline def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
  inline def each(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def each(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  inline def eachBottomUp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachBottomUp")().asInstanceOf[Unit]
  inline def eachBottomUp(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachBottomUp")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def eachBottomUp(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachBottomUp")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachBottomUp(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachBottomUp")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  inline def eachTopDown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachTopDown")().asInstanceOf[Unit]
  inline def eachTopDown(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachTopDown")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def eachTopDown(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachTopDown")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachTopDown(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachTopDown")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Gets a registered Component by id
    * @param id String/Object The id of the Component or a Ext.Component instance
    * @returns Ext.Component
    */
  inline def get(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[IComponent]
  inline def get(id: js.Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Gets the currently active Component in this ZIndexManager
    * @returns Ext.Component The active Component
    */
  inline def getActive(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getActive")().asInstanceOf[IComponent]
  
  /** [Method] Returns zero or more Components in this ZIndexManager using the custom search function passed to this method
    * @param fn Function The search function
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component being tested. That gets passed to the function if not specified.
    * @returns Array An array of zero or more matching windows
    */
  inline def getBy(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getBy")().asInstanceOf[typings.extjs.Ext.Array]
  inline def getBy(fn: js.Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getBy")(fn.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def getBy(fn: js.Any, scope: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def getBy(fn: Unit, scope: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
  inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Hides all Components managed by this ZIndexManager  */
  inline def hideAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAll")().asInstanceOf[Unit]
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
  inline def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
  
  /** [Method] Registers a floating Ext Component with this ZIndexManager
    * @param comp Ext.Component The Component to register.
    */
  inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  inline def register(comp: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(comp.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.WindowManager.self")
  @js.native
  def self: IClass = js.native
  inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Sends the specified Component to the back of other active Components in this ZIndexManager
    * @param comp String/Object The id of the Component or a Ext.Component instance
    * @returns Ext.Component The Component
    */
  inline def sendToBack(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("sendToBack")().asInstanceOf[IComponent]
  inline def sendToBack(comp: js.Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("sendToBack")(comp.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Unregisters a Ext Component from this ZIndexManager
    * @param comp Ext.Component The Component to unregister.
    */
  inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
  inline def unregister(comp: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(comp.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
