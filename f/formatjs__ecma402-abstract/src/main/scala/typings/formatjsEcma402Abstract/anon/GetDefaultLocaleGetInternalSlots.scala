package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.relativeTimeMod.LocaleFieldsData
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormat
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormatInternal
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDefaultLocaleGetInternalSlots extends StObject {
  
  var availableLocales: Set[String]
  
  def getDefaultLocale(): String
  
  def getInternalSlots(rtf: RelativeTimeFormat): RelativeTimeFormatInternal
  
  var localeData: Record[String, js.UndefOr[LocaleFieldsData]]
  
  var relevantExtensionKeys: js.Array[String]
}
object GetDefaultLocaleGetInternalSlots {
  
  inline def apply(
    availableLocales: Set[String],
    getDefaultLocale: () => String,
    getInternalSlots: RelativeTimeFormat => RelativeTimeFormatInternal,
    localeData: Record[String, js.UndefOr[LocaleFieldsData]],
    relevantExtensionKeys: js.Array[String]
  ): GetDefaultLocaleGetInternalSlots = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any], relevantExtensionKeys = relevantExtensionKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultLocaleGetInternalSlots]
  }
  
  extension [Self <: GetDefaultLocaleGetInternalSlots](x: Self) {
    
    inline def setAvailableLocales(value: Set[String]): Self = StObject.set(x, "availableLocales", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultLocale(value: () => String): Self = StObject.set(x, "getDefaultLocale", js.Any.fromFunction0(value))
    
    inline def setGetInternalSlots(value: RelativeTimeFormat => RelativeTimeFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
    
    inline def setLocaleData(value: Record[String, js.UndefOr[LocaleFieldsData]]): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
    
    inline def setRelevantExtensionKeys(value: js.Array[String]): Self = StObject.set(x, "relevantExtensionKeys", value.asInstanceOf[js.Any])
    
    inline def setRelevantExtensionKeysVarargs(value: String*): Self = StObject.set(x, "relevantExtensionKeys", js.Array(value :_*))
  }
}
