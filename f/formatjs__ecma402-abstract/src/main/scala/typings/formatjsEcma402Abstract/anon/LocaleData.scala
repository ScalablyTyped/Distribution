package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesPluralRulesMod.PluralRulesData
import typings.formatjsEcma402Abstract.typesPluralRulesMod.PluralRulesInternal
import typings.std.Intl.PluralRules
import typings.std.Record
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleData extends js.Object {
  
  var availableLocales: Set[String] = js.native
  
  def getDefaultLocale(): String = js.native
  
  def getInternalSlots(pl: PluralRules): PluralRulesInternal = js.native
  
  var localeData: Record[String, js.UndefOr[PluralRulesData]] = js.native
  
  var relevantExtensionKeys: js.Array[String] = js.native
}
object LocaleData {
  
  @scala.inline
  def apply(
    availableLocales: Set[String],
    getDefaultLocale: () => String,
    getInternalSlots: PluralRules => PluralRulesInternal,
    localeData: Record[String, js.UndefOr[PluralRulesData]],
    relevantExtensionKeys: js.Array[String]
  ): LocaleData = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any], relevantExtensionKeys = relevantExtensionKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleData]
  }
  
  @scala.inline
  implicit class LocaleDataOps[Self <: LocaleData] (val x: Self) extends AnyVal {
    
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
    def setGetInternalSlots(value: PluralRules => PluralRulesInternal): Self = this.set("getInternalSlots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocaleData(value: Record[String, js.UndefOr[PluralRulesData]]): Self = this.set("localeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantExtensionKeysVarargs(value: String*): Self = this.set("relevantExtensionKeys", js.Array(value :_*))
    
    @scala.inline
    def setRelevantExtensionKeys(value: js.Array[String]): Self = this.set("relevantExtensionKeys", value.asInstanceOf[js.Any])
  }
}
