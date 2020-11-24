package typings.firefoxWebextBrowser.browser.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LanguageDetectionResult object that holds detected langugae reliability and array of DetectedLanguage
  */
@js.native
trait DetectLanguageReturnResult extends js.Object {
  
  /** CLD detected language reliability */
  var isReliable: Boolean = js.native
  
  /** array of detectedLanguage */
  var languages: js.Array[DetectLanguageReturnResultLanguages] = js.native
}
object DetectLanguageReturnResult {
  
  @scala.inline
  def apply(isReliable: Boolean, languages: js.Array[DetectLanguageReturnResultLanguages]): DetectLanguageReturnResult = {
    val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectLanguageReturnResult]
  }
  
  @scala.inline
  implicit class DetectLanguageReturnResultOps[Self <: DetectLanguageReturnResult] (val x: Self) extends AnyVal {
    
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
    def setIsReliable(value: Boolean): Self = this.set("isReliable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesVarargs(value: DetectLanguageReturnResultLanguages*): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[DetectLanguageReturnResultLanguages]): Self = this.set("languages", value.asInstanceOf[js.Any])
  }
}
