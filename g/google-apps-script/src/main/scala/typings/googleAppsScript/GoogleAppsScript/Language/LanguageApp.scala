package typings.googleAppsScript.GoogleAppsScript.Language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Language service provides scripts a way to compute automatic translations of text.
  *
  *     // The code below will write "Esta es una prueba" to the log.
  *     var spanish = LanguageApp.translate('This is a test', 'en', 'es');
  *     Logger.log(spanish);
  */
@js.native
trait LanguageApp extends js.Object {
  
  def translate(text: String, sourceLanguage: String, targetLanguage: String): String = js.native
  def translate(
    text: String,
    sourceLanguage: String,
    targetLanguage: String,
    advancedArgs: LanguageAdvancedParameters
  ): String = js.native
}
