package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.Cardinal
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.cardinal
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ordinal
import typings.formatjsEcma402Abstract.typesCoreMod.LocaleData
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatDigitInternalSlots
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatRoundingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluralRulesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.zero
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.one
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.two
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.few
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.many
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.other
  */
  trait LDMLPluralRule extends StObject
  object LDMLPluralRule {
    
    @scala.inline
    def few: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.few = "few".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.few]
    
    @scala.inline
    def many: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.many = "many".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.many]
    
    @scala.inline
    def one: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.one = "one".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.one]
    
    @scala.inline
    def other: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.other = "other".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.other]
    
    @scala.inline
    def two: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.two = "two".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.two]
    
    @scala.inline
    def zero: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.zero = "zero".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.zero]
  }
  
  @js.native
  trait PluralRulesData extends StObject {
    
    var categories: Cardinal = js.native
    
    def fn(`val`: String): LDMLPluralRule = js.native
    def fn(`val`: String, ord: Boolean): LDMLPluralRule = js.native
    def fn(`val`: Double): LDMLPluralRule = js.native
    def fn(`val`: Double, ord: Boolean): LDMLPluralRule = js.native
  }
  
  trait PluralRulesInternal
    extends StObject
       with NumberFormatDigitInternalSlots {
    
    var initializedPluralRules: Boolean
    
    var locale: String
    
    var `type`: cardinal | ordinal
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
    implicit class PluralRulesInternalMutableBuilder[Self <: PluralRulesInternal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitializedPluralRules(value: Boolean): Self = StObject.set(x, "initializedPluralRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: cardinal | ordinal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type PluralRulesLocaleData = LocaleData[PluralRulesData]
}
