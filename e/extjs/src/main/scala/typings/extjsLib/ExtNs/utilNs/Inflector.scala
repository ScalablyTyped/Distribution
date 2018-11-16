package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.Inflector")
@js.native
class Inflector () extends js.Object

@JSGlobal("Ext.util.Inflector")
@js.native
object Inflector extends js.Object {
  /** [Property] (Ext.Class) */
  var self: extjsLib.ExtNs.IClass = js.native
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] Returns the correct Model name for a given string
  		* @param word String The word to classify
  		* @returns String The classified version of the word
  		*/
  def classify(): java.lang.String = js.native
  /** [Method] Returns the correct Model name for a given string
  		* @param word String The word to classify
  		* @returns String The classified version of the word
  		*/
  def classify(word: java.lang.String): java.lang.String = js.native
  /** [Method] Removes all registered pluralization rules */
  def clearPlurals(): scala.Unit = js.native
  /** [Method] Removes all registered singularization rules */
  def clearSingulars(): scala.Unit = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): extjsLib.ExtNs.IBase = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(config: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Returns true if the given word is transnumeral the word is its own singular and plural form  e g
  		* @param word String The word to test
  		* @returns Boolean True if the word is transnumeral
  		*/
  def isTransnumeral(): scala.Boolean = js.native
  /** [Method] Returns true if the given word is transnumeral the word is its own singular and plural form  e g
  		* @param word String The word to test
  		* @returns Boolean True if the word is transnumeral
  		*/
  def isTransnumeral(word: java.lang.String): scala.Boolean = js.native
  /** [Method] Ordinalizes a given number by adding a prefix such as st nd rd or th based on the last digit of the number
  		* @param number Number The number to ordinalize
  		* @returns String The ordinalized number
  		*/
  def ordinalize(): java.lang.String = js.native
  /** [Method] Ordinalizes a given number by adding a prefix such as st nd rd or th based on the last digit of the number
  		* @param number Number The number to ordinalize
  		* @returns String The ordinalized number
  		*/
  def ordinalize(number: scala.Double): java.lang.String = js.native
  /** [Method] Adds a new pluralization rule to the Inflector
  		* @param matcher RegExp The matcher regex
  		* @param replacer String The replacement string, which can reference matches from the matcher argument
  		*/
  def plural(): scala.Unit = js.native
  /** [Method] Adds a new pluralization rule to the Inflector
  		* @param matcher RegExp The matcher regex
  		* @param replacer String The replacement string, which can reference matches from the matcher argument
  		*/
  def plural(matcher: stdLib.RegExp): scala.Unit = js.native
  /** [Method] Adds a new pluralization rule to the Inflector
  		* @param matcher RegExp The matcher regex
  		* @param replacer String The replacement string, which can reference matches from the matcher argument
  		*/
  def plural(matcher: stdLib.RegExp, replacer: java.lang.String): scala.Unit = js.native
  /** [Method] Returns the pluralized form of a word e g
  		* @param word String The word to pluralize
  		* @returns String The pluralized form of the word
  		*/
  def pluralize(): java.lang.String = js.native
  /** [Method] Returns the pluralized form of a word e g
  		* @param word String The word to pluralize
  		* @returns String The pluralized form of the word
  		*/
  def pluralize(word: java.lang.String): java.lang.String = js.native
  /** [Method] Adds a new singularization rule to the Inflector
  		* @param matcher RegExp The matcher regex
  		* @param replacer String The replacement string, which can reference matches from the matcher argument
  		*/
  def singular(): scala.Unit = js.native
  /** [Method] Adds a new singularization rule to the Inflector
  		* @param matcher RegExp The matcher regex
  		* @param replacer String The replacement string, which can reference matches from the matcher argument
  		*/
  def singular(matcher: stdLib.RegExp): scala.Unit = js.native
  /** [Method] Adds a new singularization rule to the Inflector
  		* @param matcher RegExp The matcher regex
  		* @param replacer String The replacement string, which can reference matches from the matcher argument
  		*/
  def singular(matcher: stdLib.RegExp, replacer: java.lang.String): scala.Unit = js.native
  /** [Method] Returns the singularized form of a word e g
  		* @param word String The word to singularize
  		* @returns String The singularized form of the word
  		*/
  def singularize(): java.lang.String = js.native
  /** [Method] Returns the singularized form of a word e g
  		* @param word String The word to singularize
  		* @returns String The singularized form of the word
  		*/
  def singularize(word: java.lang.String): java.lang.String = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): extjsLib.ExtNs.IClass = js.native
}

