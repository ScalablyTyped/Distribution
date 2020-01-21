package typings.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionarySettings extends js.Object {
  /** The customDictionaryUrl option accepts string, which is the method path to add the error word into the custom dictionary.
    */
  var customDictionaryUrl: js.UndefOr[String] = js.undefined
  /** The dictionaryUrl option accepts string, which is the method path to find the error words and get the suggestions to correct the errors.
    */
  var dictionaryUrl: js.UndefOr[String] = js.undefined
}

object DictionarySettings {
  @scala.inline
  def apply(customDictionaryUrl: String = null, dictionaryUrl: String = null): DictionarySettings = {
    val __obj = js.Dynamic.literal()
    if (customDictionaryUrl != null) __obj.updateDynamic("customDictionaryUrl")(customDictionaryUrl.asInstanceOf[js.Any])
    if (dictionaryUrl != null) __obj.updateDynamic("dictionaryUrl")(dictionaryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionarySettings]
  }
}

