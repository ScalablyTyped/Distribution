package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.container.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ComponentQuery")
@js.native
class ComponentQuery ()
  extends StObject
     with typings.extjs.Ext.ComponentQuery
/* static members */
object ComponentQuery {
  
  @JSGlobal("Ext.ComponentQuery")
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
  
  /** [Method] Tests whether the passed Component matches the selector string
    * @param component Ext.Component The Component to test
    * @param selector String The selector string to test against.
    * @returns Boolean True if the Component matches the selector.
    */
  @scala.inline
  def is(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[Boolean]
  @scala.inline
  def is(component: Unit, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(component.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def is(component: IComponent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def is(component: IComponent, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(component.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Returns an array of matched Components from within the passed root object
    * @param selector String The selector string to filter returned Components
    * @param root Ext.container.Container The Container within which to perform the query. If omitted, all Components within the document are included in the search. This parameter may also be an array of Components to filter according to the selector.
    * @returns Ext.Component[] The matched Components.
    */
  @scala.inline
  def query(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("query")().asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def query(selector: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def query(selector: java.lang.String, root: IContainer): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def query(selector: Unit, root: IContainer): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.ComponentQuery.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @scala.inline
  def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
}
