package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.PluralRuleSelect
import typings.formatjsEcma402Abstract.typesPluralRulesMod.LDMLPluralRule
import typings.std.Intl.PluralRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluralRulesResolvePluralMod {
  
  @JSImport("@formatjs/ecma402-abstract/PluralRules/ResolvePlural", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResolvePlural(pl: PluralRules, n: Double, hasGetInternalSlotsPluralRuleSelect: PluralRuleSelect): LDMLPluralRule = (^.asInstanceOf[js.Dynamic].applyDynamic("ResolvePlural")(pl.asInstanceOf[js.Any], n.asInstanceOf[js.Any], hasGetInternalSlotsPluralRuleSelect.asInstanceOf[js.Any])).asInstanceOf[LDMLPluralRule]
}
