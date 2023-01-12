package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.googleAppsScriptStrings.html
import typings.googleAppsScript.googleAppsScriptStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Language {
  
  trait LanguageAdvancedParameters extends StObject {
    
    /** the content type of the text; supported values are 'text' (default) and 'html' */
    var contentType: js.UndefOr[html | text] = js.undefined
  }
  object LanguageAdvancedParameters {
    
    inline def apply(): LanguageAdvancedParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LanguageAdvancedParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LanguageAdvancedParameters] (val x: Self) extends AnyVal {
      
      inline def setContentType(value: html | text): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    }
  }
  
  /**
    * The Language service provides scripts a way to compute automatic translations of text.
    *
    *     // The code below will write "Esta es una prueba" to the log.
    *     var spanish = LanguageApp.translate('This is a test', 'en', 'es');
    *     Logger.log(spanish);
    */
  @js.native
  trait LanguageApp extends StObject {
    
    def translate(text: String, sourceLanguage: String, targetLanguage: String): String = js.native
    def translate(
      text: String,
      sourceLanguage: String,
      targetLanguage: String,
      advancedArgs: LanguageAdvancedParameters
    ): String = js.native
  }
}
