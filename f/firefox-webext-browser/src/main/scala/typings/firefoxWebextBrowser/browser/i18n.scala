package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.i18n` infrastructure to implement internationalization across your whole app or extension.
  */
object i18n {
  
  /**
    * LanguageDetectionResult object that holds detected langugae reliability and array of DetectedLanguage
    */
  @js.native
  trait DetectLanguageReturnResult extends StObject {
    
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
    implicit class DetectLanguageReturnResultMutableBuilder[Self <: DetectLanguageReturnResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsReliable(value: Boolean): Self = StObject.set(x, "isReliable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguages(value: js.Array[DetectLanguageReturnResultLanguages]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguagesVarargs(value: DetectLanguageReturnResultLanguages*): Self = StObject.set(x, "languages", js.Array(value :_*))
    }
  }
  
  /** DetectedLanguage object that holds detected ISO language code and its percentage in the input string */
  @js.native
  trait DetectLanguageReturnResultLanguages extends StObject {
    
    var language: LanguageCode = js.native
    
    /** The percentage of the detected language */
    var percentage: Double = js.native
  }
  object DetectLanguageReturnResultLanguages {
    
    @scala.inline
    def apply(language: LanguageCode, percentage: Double): DetectLanguageReturnResultLanguages = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectLanguageReturnResultLanguages]
    }
    
    @scala.inline
    implicit class DetectLanguageReturnResultLanguagesMutableBuilder[Self <: DetectLanguageReturnResultLanguages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: LanguageCode): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    }
  }
  
  /* i18n types */
  /**
    * An ISO language code such as `en` or `fr`. For a complete list of languages supported by this method, see [kLanguageInfoTable](http://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc). For an unknown language, `und` will be returned, which means that [percentage] of the text is unknown to CLD
    */
  type LanguageCode = String
}
