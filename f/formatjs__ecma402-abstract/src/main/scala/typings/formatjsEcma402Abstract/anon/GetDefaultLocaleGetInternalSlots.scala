package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.relativeTimeMod.LocaleFieldsData
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormat
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormatInternal
import typings.std.Record
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDefaultLocaleGetInternalSlots extends js.Object {
  
  var availableLocales: Set[String] = js.native
  
  def getDefaultLocale(): String = js.native
  
  def getInternalSlots(rtf: RelativeTimeFormat): RelativeTimeFormatInternal = js.native
  
  var localeData: Record[String, js.UndefOr[LocaleFieldsData]] = js.native
  
  var relevantExtensionKeys: js.Array[String] = js.native
}
object GetDefaultLocaleGetInternalSlots {
  
  @scala.inline
  def apply(
    availableLocales: Set[String],
    getDefaultLocale: () => String,
    getInternalSlots: RelativeTimeFormat => RelativeTimeFormatInternal,
    localeData: Record[String, js.UndefOr[LocaleFieldsData]],
    relevantExtensionKeys: js.Array[String]
  ): GetDefaultLocaleGetInternalSlots = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any], relevantExtensionKeys = relevantExtensionKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultLocaleGetInternalSlots]
  }
  
  @scala.inline
  implicit class GetDefaultLocaleGetInternalSlotsOps[Self <: GetDefaultLocaleGetInternalSlots] (val x: Self) extends AnyVal {
    
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
    def setGetInternalSlots(value: RelativeTimeFormat => RelativeTimeFormatInternal): Self = this.set("getInternalSlots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocaleData(value: Record[String, js.UndefOr[LocaleFieldsData]]): Self = this.set("localeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantExtensionKeysVarargs(value: String*): Self = this.set("relevantExtensionKeys", js.Array(value :_*))
    
    @scala.inline
    def setRelevantExtensionKeys(value: js.Array[String]): Self = this.set("relevantExtensionKeys", value.asInstanceOf[js.Any])
  }
}
