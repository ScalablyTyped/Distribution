package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectedLanguage extends js.Object {
  /** Confidence of detected language. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
    * information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object DetectedLanguage {
  @scala.inline
  def apply(): DetectedLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedLanguage]
  }
  @scala.inline
  implicit class DetectedLanguageOps[Self <: DetectedLanguage] (val x: Self) extends AnyVal {
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
  }
  
}

