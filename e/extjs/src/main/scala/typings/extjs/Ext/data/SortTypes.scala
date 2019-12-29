package typings.extjs.Ext.data

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.data.SortTypes")
@js.native
class SortTypes () extends js.Object

/* static members */
@JSGlobal("Ext.data.SortTypes")
@js.native
object SortTypes extends js.Object {
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Property] (RegExp) */
  var stripTagsRE: RegExp = js.native
  /** [Method] Date sorting
  		* @param s Object The value being converted
  		* @returns Number The comparison value
  		*/
  def asDate(): Double = js.native
  def asDate(s: js.Any): Double = js.native
  /** [Method] Float sorting
  		* @param s Object The value being converted
  		* @returns Number The comparison value
  		*/
  def asFloat(): Double = js.native
  def asFloat(s: js.Any): Double = js.native
  /** [Method] Integer sorting
  		* @param s Object The value being converted
  		* @returns Number The comparison value
  		*/
  def asInt(): Double = js.native
  def asInt(s: js.Any): Double = js.native
  /** [Method] Strips all HTML tags to sort on text only
  		* @param s Object The value being converted
  		* @returns String The comparison value
  		*/
  def asText(): String = js.native
  def asText(s: js.Any): String = js.native
  /** [Method] Case insensitive string
  		* @param s Object The value being converted
  		* @returns String The comparison value
  		*/
  def asUCString(): String = js.native
  def asUCString(s: js.Any): String = js.native
  /** [Method] Strips all HTML tags to sort on text only  Case insensitive
  		* @param s Object The value being converted
  		* @returns String The comparison value
  		*/
  def asUCText(): String = js.native
  def asUCText(s: js.Any): String = js.native
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
  def getInitialConfig(name: String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  /** [Method] Default sort that does nothing
  		* @param s Object The value being converted
  		* @returns Object The comparison value
  		*/
  def none(): js.Any = js.native
  def none(s: js.Any): js.Any = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
}

