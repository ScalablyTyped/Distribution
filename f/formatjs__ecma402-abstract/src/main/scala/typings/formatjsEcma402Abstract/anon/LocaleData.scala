package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesPluralRulesMod.PluralRulesData
import typings.formatjsEcma402Abstract.typesPluralRulesMod.PluralRulesInternal
import typings.std.Intl.PluralRules
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleData extends StObject {
  
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
  implicit class LocaleDataMutableBuilder[Self <: LocaleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableLocales(value: Set[String]): Self = StObject.set(x, "availableLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultLocale(value: () => String): Self = StObject.set(x, "getDefaultLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInternalSlots(value: PluralRules => PluralRulesInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocaleData(value: Record[String, js.UndefOr[PluralRulesData]]): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantExtensionKeys(value: js.Array[String]): Self = StObject.set(x, "relevantExtensionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantExtensionKeysVarargs(value: String*): Self = StObject.set(x, "relevantExtensionKeys", js.Array(value :_*))
  }
}
