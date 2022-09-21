package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FbtTranslations {
  
  @JSImport("fbt", "FbtTranslations")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRegisteredTranslations(): TranslationDict = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredTranslations")().asInstanceOf[TranslationDict]
  
  inline def getTranslatedInput(input: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslatedInput")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def mergeTranslations(newTranslations: TranslationDict): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeTranslations")(newTranslations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerTranslations(translations: TranslationDict): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTranslations")(translations.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
