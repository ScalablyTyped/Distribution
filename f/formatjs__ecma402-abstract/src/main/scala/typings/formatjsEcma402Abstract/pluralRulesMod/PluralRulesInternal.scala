package typings.formatjsEcma402Abstract.pluralRulesMod

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.cardinal
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ordinal
import typings.formatjsEcma402Abstract.numberMod.NumberFormatDigitInternalSlots
import typings.formatjsEcma402Abstract.numberMod.NumberFormatRoundingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluralRulesInternal extends NumberFormatDigitInternalSlots {
  
  var initializedPluralRules: Boolean = js.native
  
  var locale: String = js.native
  
  var `type`: cardinal | ordinal = js.native
}
object PluralRulesInternal {
  
  @scala.inline
  def apply(
    initializedPluralRules: Boolean,
    locale: String,
    minimumIntegerDigits: Double,
    roundingType: NumberFormatRoundingType,
    `type`: cardinal | ordinal
  ): PluralRulesInternal = {
    val __obj = js.Dynamic.literal(initializedPluralRules = initializedPluralRules.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralRulesInternal]
  }
  
  @scala.inline
  implicit class PluralRulesInternalOps[Self <: PluralRulesInternal] (val x: Self) extends AnyVal {
    
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
    def setInitializedPluralRules(value: Boolean): Self = this.set("initializedPluralRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: cardinal | ordinal): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
