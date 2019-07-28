package typings.electronDashSpellchecker.electronDashSpellcheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-spellchecker", "SpellCheckHandler")
@js.native
class SpellCheckHandler () extends js.Object {
  var currentSpellchecker: this.type = js.native
  def addToDictionary(text: String): Unit = js.native
  def attachToInput(): Unit = js.native
  def autoUnloadDictionariesOnBlur(): Unit = js.native
  def getCorrectionsForMisspelling(misspelledWord: String): js.Promise[js.Array[String]] = js.native
  def provideHintText(inputText: String): Unit = js.native
  def switchLanguage(language: String): Unit = js.native
  def unsubscribe(): Unit = js.native
}

