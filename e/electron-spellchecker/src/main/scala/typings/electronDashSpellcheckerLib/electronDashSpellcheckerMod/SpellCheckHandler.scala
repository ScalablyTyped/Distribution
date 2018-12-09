package typings
package electronDashSpellcheckerLib.electronDashSpellcheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-spellchecker", "SpellCheckHandler")
@js.native
class SpellCheckHandler () extends js.Object {
  var currentSpellchecker: this.type = js.native
  def addToDictionary(text: java.lang.String): scala.Unit = js.native
  def attachToInput(): scala.Unit = js.native
  def autoUnloadDictionariesOnBlur(): scala.Unit = js.native
  def getCorrectionsForMisspelling(misspelledWord: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def provideHintText(inputText: java.lang.String): scala.Unit = js.native
  def switchLanguage(language: java.lang.String): scala.Unit = js.native
  def unsubscribe(): scala.Unit = js.native
}

