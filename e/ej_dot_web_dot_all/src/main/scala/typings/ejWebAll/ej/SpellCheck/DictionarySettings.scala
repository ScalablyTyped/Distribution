package typings.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictionarySettings extends js.Object {
  /** The customDictionaryUrl option accepts string, which is the method path to add the error word into the custom dictionary.
    */
  var customDictionaryUrl: js.UndefOr[String] = js.native
  /** The dictionaryUrl option accepts string, which is the method path to find the error words and get the suggestions to correct the errors.
    */
  var dictionaryUrl: js.UndefOr[String] = js.native
}

object DictionarySettings {
  @scala.inline
  def apply(): DictionarySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictionarySettings]
  }
  @scala.inline
  implicit class DictionarySettingsOps[Self <: DictionarySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomDictionaryUrl(value: String): Self = this.set("customDictionaryUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDictionaryUrl: Self = this.set("customDictionaryUrl", js.undefined)
    @scala.inline
    def setDictionaryUrl(value: String): Self = this.set("dictionaryUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDictionaryUrl: Self = this.set("dictionaryUrl", js.undefined)
  }
  
}

