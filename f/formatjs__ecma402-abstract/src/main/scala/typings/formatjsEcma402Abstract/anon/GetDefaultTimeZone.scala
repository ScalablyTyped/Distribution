package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.dateTimeMod.DateTimeFormatLocaleInternalData
import typings.formatjsEcma402Abstract.dateTimeMod.IntlDateTimeFormatInternal
import typings.std.Intl.DateTimeFormat
import typings.std.Record
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDefaultTimeZone extends js.Object {
  
  var availableLocales: Set[String] = js.native
  
  def getDefaultLocale(): String = js.native
  
  def getDefaultTimeZone(): String = js.native
  
  def getInternalSlots(dtf: DateTimeFormat): IntlDateTimeFormatInternal = js.native
  
  var localeData: Record[String, js.UndefOr[DateTimeFormatLocaleInternalData]] = js.native
  
  var relevantExtensionKeys: js.Array[String] = js.native
  
  var tzData: Record[String, _] = js.native
  
  var uppercaseLinks: Record[String, String] = js.native
}
object GetDefaultTimeZone {
  
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
  ): GetDefaultTimeZone = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getDefaultTimeZone = js.Any.fromFunction0(getDefaultTimeZone), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any], relevantExtensionKeys = relevantExtensionKeys.asInstanceOf[js.Any], tzData = tzData.asInstanceOf[js.Any], uppercaseLinks = uppercaseLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultTimeZone]
  }
  
  @scala.inline
  implicit class GetDefaultTimeZoneOps[Self <: GetDefaultTimeZone] (val x: Self) extends AnyVal {
    
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
    def setAvailableLocales(value: Set[String]): Self = this.set("availableLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultLocale(value: () => String): Self = this.set("getDefaultLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultTimeZone(value: () => String): Self = this.set("getDefaultTimeZone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInternalSlots(value: DateTimeFormat => IntlDateTimeFormatInternal): Self = this.set("getInternalSlots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocaleData(value: Record[String, js.UndefOr[DateTimeFormatLocaleInternalData]]): Self = this.set("localeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantExtensionKeysVarargs(value: String*): Self = this.set("relevantExtensionKeys", js.Array(value :_*))
    
    @scala.inline
    def setRelevantExtensionKeys(value: js.Array[String]): Self = this.set("relevantExtensionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTzData(value: Record[String, _]): Self = this.set("tzData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUppercaseLinks(value: Record[String, String]): Self = this.set("uppercaseLinks", value.asInstanceOf[js.Any])
  }
}
