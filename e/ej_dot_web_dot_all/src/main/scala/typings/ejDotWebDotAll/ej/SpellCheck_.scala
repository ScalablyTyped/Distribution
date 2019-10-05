package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.SpellCheck")
@js.native
class SpellCheck_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.SpellCheck.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.SpellCheck.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.SpellCheck.Model = js.native
  @JSName("model")
  var model_SpellCheck_ : typings.ejDotWebDotAll.ej.SpellCheck.Model = js.native
  /** To add the words into the custom dictionary.
    * @param {string} Word to add into the dictionary file
    * @returns {any}
    */
  def addToDictionary(customWord: String): js.Any = js.native
  /** To change the error word once from the given input sentence.
    * @param {string} Error word to change from the target content
    * @param {string} Content to perform the change operation
    * @param {string} Word to replace with the error word
    * @param {number} Index of the error word present in the target content
    * @returns {any}
    */
  def change(word: String, targetSentence: String, changeWord: String, index: Double): js.Any = js.native
  /** To change all the error word occurrences from the given input sentence.
    * @param {string} Error word to change from the target content
    * @param {string} Content to perform the change all operation
    * @param {string} Word to replace with the error word
    * @returns {any}
    */
  def changeAll(word: String, targetSentence: String, changeWord: String): js.Any = js.native
  /** Retrieves the possible suggestion words for the error word passed as an argument.
    * @param {string} Error word to get the suggestions
    * @returns {any}
    */
  def getSuggestionWords(errorWord: String): js.Any = js.native
  /** To ignore the error word once from the given input sentence.
    * @param {string} Error word to ignore from the target content
    * @param {string} Content to perform the ignore operation
    * @param {number} Index of the error word present in the target content
    * @returns {any}
    */
  def ignore(word: String, targetSentence: String, index: Double): js.Any = js.native
  /** To ignore all the error word occurrences from the given input sentence.
    * @param {string} Error word to ignore from the target content
    * @param {string} Content to perform the ignore all operation
    * @returns {any}
    */
  def ignoreAll(word: String, targetSentence: String): js.Any = js.native
  /** Open the dialog to correct the spelling of the target content.
    * @returns {void}
    */
  def showInDialog(): Unit = js.native
  /** To get the error word highlighted string by passing the given input sentence.
    * @param {string} Content to be spell check
    * @param {string} Class name that contains style value to highlight the error word
    * @returns {any}
    */
  def spellCheck(targetSentence: String, misspellWordCss: String): js.Any = js.native
  /** Highlighting the error word in the target area itself and correct the spelling using the context menu.
    * @returns {void}
    */
  def validate(): Unit = js.native
}

