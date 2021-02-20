package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatLocaleInternalData
import typings.formatjsEcma402Abstract.typesDateTimeMod.IntlDateTimeFormatInternal
import typings.std.Intl.DateTimeFormat
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailableLocales extends StObject {
  
  var availableLocales: Set[String] = js.native
  
  def getDefaultLocale(): String = js.native
  
  def getDefaultTimeZone(): String = js.native
  
  def getInternalSlots(dtf: DateTimeFormat): IntlDateTimeFormatInternal = js.native
  
  var localeData: Record[String, js.UndefOr[DateTimeFormatLocaleInternalData]] = js.native
  
  var relevantExtensionKeys: js.Array[String] = js.native
  
  var tzData: Record[String, _] = js.native
  
  var uppercaseLinks: Record[String, String] = js.native
}
object AvailableLocales {
  
  @scala.inline
  def apply(
    availableLocales: Set[String],
    getDefaultLocale: () => String,
    getDefaultTimeZone: () => String,
    getInternalSlots: DateTimeFormat => IntlDateTimeFormatInternal,
    localeData: Record[String, js.UndefOr[DateTimeFormatLocaleInternalData]],
    relevantExtensionKeys: js.Array[String],
    tzData: Record[String, _],
    uppercaseLinks: Record[String, String]
  ): AvailableLocales = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getDefaultTimeZone = js.Any.fromFunction0(getDefaultTimeZone), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any], relevantExtensionKeys = relevantExtensionKeys.asInstanceOf[js.Any], tzData = tzData.asInstanceOf[js.Any], uppercaseLinks = uppercaseLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableLocales]
  }
  
  @scala.inline
  implicit class AvailableLocalesMutableBuilder[Self <: AvailableLocales] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableLocales(value: Set[String]): Self = StObject.set(x, "availableLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultLocale(value: () => String): Self = StObject.set(x, "getDefaultLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultTimeZone(value: () => String): Self = StObject.set(x, "getDefaultTimeZone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInternalSlots(value: DateTimeFormat => IntlDateTimeFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocaleData(value: Record[String, js.UndefOr[DateTimeFormatLocaleInternalData]]): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantExtensionKeys(value: js.Array[String]): Self = StObject.set(x, "relevantExtensionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantExtensionKeysVarargs(value: String*): Self = StObject.set(x, "relevantExtensionKeys", js.Array(value :_*))
    
    @scala.inline
    def setTzData(value: Record[String, _]): Self = StObject.set(x, "tzData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUppercaseLinks(value: Record[String, String]): Self = StObject.set(x, "uppercaseLinks", value.asInstanceOf[js.Any])
  }
}
