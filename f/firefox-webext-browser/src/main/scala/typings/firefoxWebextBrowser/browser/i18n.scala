package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.i18n` infrastructure to implement internationalization across your whole app or extension.
  */
object i18n {
  
  /**
    * LanguageDetectionResult object that holds detected langugae reliability and array of DetectedLanguage
    */
  trait DetectLanguageReturnResult extends StObject {
    
    /** CLD detected language reliability */
    var isReliable: Boolean
    
    /** array of detectedLanguage */
    var languages: js.Array[DetectLanguageReturnResultLanguages]
  }
  object DetectLanguageReturnResult {
    
    inline def apply(isReliable: Boolean, languages: js.Array[DetectLanguageReturnResultLanguages]): DetectLanguageReturnResult = {
      val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectLanguageReturnResult]
    }
    
    extension [Self <: DetectLanguageReturnResult](x: Self) {
      
      inline def setIsReliable(value: Boolean): Self = StObject.set(x, "isReliable", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: js.Array[DetectLanguageReturnResultLanguages]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesVarargs(value: DetectLanguageReturnResultLanguages*): Self = StObject.set(x, "languages", js.Array(value*))
    }
  }
  
  /** DetectedLanguage object that holds detected ISO language code and its percentage in the input string */
  trait DetectLanguageReturnResultLanguages extends StObject {
    
    var language: LanguageCode
    
    /** The percentage of the detected language */
    var percentage: Double
  }
  object DetectLanguageReturnResultLanguages {
    
    inline def apply(language: LanguageCode, percentage: Double): DetectLanguageReturnResultLanguages = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectLanguageReturnResultLanguages]
    }
    
    extension [Self <: DetectLanguageReturnResultLanguages](x: Self) {
      
      inline def setLanguage(value: LanguageCode): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    }
  }
  
  /* i18n types */
  /**
    * An ISO language code such as `en` or `fr`. For a complete list of languages supported by this method, see [kLanguageInfoTable](http://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc). For an unknown language, `und` will be returned, which means that [percentage] of the text is unknown to CLD
    */
  type LanguageCode = String
}
