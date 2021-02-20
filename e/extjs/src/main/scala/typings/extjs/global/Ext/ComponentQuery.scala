package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.container.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ComponentQuery")
@js.native
class ComponentQuery ()
  extends typings.extjs.Ext.ComponentQuery
/* static members */
object ComponentQuery {
  
  @JSGlobal("Ext.ComponentQuery")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.ComponentQuery.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.ComponentQuery.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.ComponentQuery.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.ComponentQuery.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.ComponentQuery.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.ComponentQuery.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  @JSGlobal("Ext.ComponentQuery.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.ComponentQuery.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  @JSGlobal("Ext.ComponentQuery.initConfig")
  @js.native
  def initConfig(): IBase = js.native
  @JSGlobal("Ext.ComponentQuery.initConfig")
  @js.native
  def initConfig(config: js.Any): IBase = js.native
  
  /** [Method] Tests whether the passed Component matches the selector string
    * @param component Ext.Component The Component to test
    * @param selector String The selector string to test against.
    * @returns Boolean True if the Component matches the selector.
    */
  @JSGlobal("Ext.ComponentQuery.is")
  @js.native
  def is(): Boolean = js.native
  @JSGlobal("Ext.ComponentQuery.is")
  @js.native
  def is(component: js.UndefOr[scala.Nothing], selector: java.lang.String): Boolean = js.native
  @JSGlobal("Ext.ComponentQuery.is")
  @js.native
  def is(component: IComponent): Boolean = js.native
  @JSGlobal("Ext.ComponentQuery.is")
  @js.native
  def is(component: IComponent, selector: java.lang.String): Boolean = js.native
  
  /** [Method] Returns an array of matched Components from within the passed root object
    * @param selector String The selector string to filter returned Components
    * @param root Ext.container.Container The Container within which to perform the query. If omitted, all Components within the document are included in the search. This parameter may also be an array of Components to filter according to the selector.
    * @returns Ext.Component[] The matched Components.
    */
  @JSGlobal("Ext.ComponentQuery.query")
  @js.native
  def query(): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.ComponentQuery.query")
  @js.native
  def query(selector: js.UndefOr[scala.Nothing], root: IContainer): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.ComponentQuery.query")
  @js.native
  def query(selector: java.lang.String): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.ComponentQuery.query")
  @js.native
  def query(selector: java.lang.String, root: IContainer): typings.extjs.Ext.Array = js.native
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.ComponentQuery.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.ComponentQuery.statics")
  @js.native
  def statics(): IClass = js.native
}
