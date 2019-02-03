package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.ComponentQuery")
@js.native
class ComponentQuery () extends js.Object

/* static members */
@JSGlobal("Ext.ComponentQuery")
@js.native
object ComponentQuery extends js.Object {
  /** [Property] (Ext.Class) */
  var self: extjsLib.ExtNs.IClass = js.native
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
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): extjsLib.ExtNs.IBase = js.native
  def initConfig(config: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Tests whether the passed Component matches the selector string
  		* @param component Ext.Component The Component to test
  		* @param selector String The selector string to test against.
  		* @returns Boolean True if the Component matches the selector.
  		*/
  def is(): scala.Boolean = js.native
  def is(component: extjsLib.ExtNs.IComponent): scala.Boolean = js.native
  def is(component: extjsLib.ExtNs.IComponent, selector: java.lang.String): scala.Boolean = js.native
  /** [Method] Returns an array of matched Components from within the passed root object
  		* @param selector String The selector string to filter returned Components
  		* @param root Ext.container.Container The Container within which to perform the query. If omitted, all Components within the document are included in the search. This parameter may also be an array of Components to filter according to the selector.
  		* @returns Ext.Component[] The matched Components.
  		*/
  def query(): extjsLib.ExtNs.Array = js.native
  def query(selector: java.lang.String): extjsLib.ExtNs.Array = js.native
  def query(selector: java.lang.String, root: extjsLib.ExtNs.containerNs.IContainer): extjsLib.ExtNs.Array = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): extjsLib.ExtNs.IClass = js.native
}

