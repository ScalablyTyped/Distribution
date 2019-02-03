package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.data.Validations")
@js.native
class Validations () extends js.Object

/* static members */
@JSGlobal("Ext.data.Validations")
@js.native
object Validations extends js.Object {
  /** [Property] (String) */
  var emailMessage: java.lang.String = js.native
  /** [Property] (RegExp) */
  var emailRe: stdLib.RegExp = js.native
  /** [Property] (String) */
  var exclusionMessage: java.lang.String = js.native
  /** [Property] (String) */
  var formatMessage: java.lang.String = js.native
  /** [Property] (String) */
  var inclusionMessage: java.lang.String = js.native
  /** [Property] (String) */
  var lengthMessage: java.lang.String = js.native
  /** [Property] (String) */
  var presenceMessage: java.lang.String = js.native
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
  /** [Method] Validates that an email string is in the correct format
  		* @param config Object Config object
  		* @param email String The email address
  		* @returns Boolean True if the value passes validation
  		*/
  def email(): scala.Boolean = js.native
  def email(config: js.Any): scala.Boolean = js.native
  def email(config: js.Any, email: java.lang.String): scala.Boolean = js.native
  /** [Method] Validates that the given value is not present in the configured list
  		* @param config Object Config object
  		* @param value String The value to validate
  		* @returns Boolean True if the value is not present in the list
  		*/
  def exclusion(): scala.Boolean = js.native
  def exclusion(config: js.Any): scala.Boolean = js.native
  def exclusion(config: js.Any, value: java.lang.String): scala.Boolean = js.native
  /** [Method] Returns true if the given value passes validation against the configured matcher regex
  		* @param config Object Config object
  		* @param value String The value to validate
  		* @returns Boolean True if the value passes the format validation
  		*/
  def format(): scala.Boolean = js.native
  def format(config: js.Any): scala.Boolean = js.native
  def format(config: js.Any, value: java.lang.String): scala.Boolean = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Validates that the given value is present in the configured list
  		* @param config Object Config object
  		* @param value String The value to validate
  		* @returns Boolean True if the value is present in the list
  		*/
  def inclusion(): scala.Boolean = js.native
  def inclusion(config: js.Any): scala.Boolean = js.native
  def inclusion(config: js.Any, value: java.lang.String): scala.Boolean = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): extjsLib.ExtNs.IBase = js.native
  def initConfig(config: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Returns true if the given value is between the configured min and max values
  		* @param config Object Config object
  		* @param value String The value to validate
  		* @returns Boolean True if the value passes validation
  		*/
  def length(): scala.Boolean = js.native
  def length(config: js.Any): scala.Boolean = js.native
  def length(config: js.Any, value: java.lang.String): scala.Boolean = js.native
  /** [Method] Validates that the given value is present
  		* @param config Object Config object
  		* @param value Object The value to validate
  		* @returns Boolean True if validation passed
  		*/
  def presence(): scala.Boolean = js.native
  def presence(config: js.Any): scala.Boolean = js.native
  def presence(config: js.Any, value: js.Any): scala.Boolean = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): extjsLib.ExtNs.IClass = js.native
}

