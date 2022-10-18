package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.icu_collation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisIcuCollationTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var alternate: js.UndefOr[AnalysisIcuCollationAlternate] = js.undefined
  
  var caseFirst: js.UndefOr[AnalysisIcuCollationCaseFirst] = js.undefined
  
  var caseLevel: js.UndefOr[Boolean] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  var decomposition: js.UndefOr[AnalysisIcuCollationDecomposition] = js.undefined
  
  var hiraganaQuaternaryMode: js.UndefOr[Boolean] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var numeric: js.UndefOr[Boolean] = js.undefined
  
  var rules: js.UndefOr[String] = js.undefined
  
  var strength: js.UndefOr[AnalysisIcuCollationStrength] = js.undefined
  
  var `type`: icu_collation
  
  var variableTop: js.UndefOr[String] = js.undefined
  
  var variant: js.UndefOr[String] = js.undefined
}
object AnalysisIcuCollationTokenFilter {
  
  inline def apply(): AnalysisIcuCollationTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("icu_collation")
    __obj.asInstanceOf[AnalysisIcuCollationTokenFilter]
  }
  
  extension [Self <: AnalysisIcuCollationTokenFilter](x: Self) {
    
    inline def setAlternate(value: AnalysisIcuCollationAlternate): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
    
    inline def setCaseFirst(value: AnalysisIcuCollationCaseFirst): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
    
    inline def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
    
    inline def setCaseLevel(value: Boolean): Self = StObject.set(x, "caseLevel", value.asInstanceOf[js.Any])
    
    inline def setCaseLevelUndefined: Self = StObject.set(x, "caseLevel", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDecomposition(value: AnalysisIcuCollationDecomposition): Self = StObject.set(x, "decomposition", value.asInstanceOf[js.Any])
    
    inline def setDecompositionUndefined: Self = StObject.set(x, "decomposition", js.undefined)
    
    inline def setHiraganaQuaternaryMode(value: Boolean): Self = StObject.set(x, "hiraganaQuaternaryMode", value.asInstanceOf[js.Any])
    
    inline def setHiraganaQuaternaryModeUndefined: Self = StObject.set(x, "hiraganaQuaternaryMode", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setRules(value: String): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setStrength(value: AnalysisIcuCollationStrength): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setType(value: icu_collation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVariableTop(value: String): Self = StObject.set(x, "variableTop", value.asInstanceOf[js.Any])
    
    inline def setVariableTopUndefined: Self = StObject.set(x, "variableTop", js.undefined)
    
    inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
