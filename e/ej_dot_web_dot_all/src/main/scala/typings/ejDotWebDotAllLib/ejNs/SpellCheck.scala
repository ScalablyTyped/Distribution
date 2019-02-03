package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.SpellCheck")
@js.native
class SpellCheck protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.SpellCheckNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.SpellCheckNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.SpellCheckNs.Model = js.native
  @JSName("model")
  var model_SpellCheck: ejDotWebDotAllLib.ejNs.SpellCheckNs.Model = js.native
  /** To add the words into the custom dictionary.
    * @param {string} Word to add into the dictionary file
    * @returns {any}
    */
  def addToDictionary(customWord: java.lang.String): js.Any = js.native
  /** To change the error word once from the given input sentence.
    * @param {string} Error word to change from the target content
    * @param {string} Content to perform the change operation
    * @param {string} Word to replace with the error word
    * @param {number} Index of the error word present in the target content
    * @returns {any}
    */
  def change(
    word: java.lang.String,
    targetSentence: java.lang.String,
    changeWord: java.lang.String,
    index: scala.Double
  ): js.Any = js.native
  /** To change all the error word occurrences from the given input sentence.
    * @param {string} Error word to change from the target content
    * @param {string} Content to perform the change all operation
    * @param {string} Word to replace with the error word
    * @returns {any}
    */
  def changeAll(word: java.lang.String, targetSentence: java.lang.String, changeWord: java.lang.String): js.Any = js.native
  /** Retrieves the possible suggestion words for the error word passed as an argument.
    * @param {string} Error word to get the suggestions
    * @returns {any}
    */
  def getSuggestionWords(errorWord: java.lang.String): js.Any = js.native
  /** To ignore the error word once from the given input sentence.
    * @param {string} Error word to ignore from the target content
    * @param {string} Content to perform the ignore operation
    * @param {number} Index of the error word present in the target content
    * @returns {any}
    */
  def ignore(word: java.lang.String, targetSentence: java.lang.String, index: scala.Double): js.Any = js.native
  /** To ignore all the error word occurrences from the given input sentence.
    * @param {string} Error word to ignore from the target content
    * @param {string} Content to perform the ignore all operation
    * @returns {any}
    */
  def ignoreAll(word: java.lang.String, targetSentence: java.lang.String): js.Any = js.native
  /** Open the dialog to correct the spelling of the target content.
    * @returns {void}
    */
  def showInDialog(): scala.Unit = js.native
  /** To get the error word highlighted string by passing the given input sentence.
    * @param {string} Content to be spell check
    * @param {string} Class name that contains style value to highlight the error word
    * @returns {any}
    */
  def spellCheck(targetSentence: java.lang.String, misspellWordCss: java.lang.String): js.Any = js.native
  /** Highlighting the error word in the target area itself and correct the spelling using the context menu.
    * @returns {void}
    */
  def validate(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.SpellCheck")
@js.native
object SpellCheck extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.SpellCheck = js.native
}

