package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.phonetic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisPhoneticTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var encoder: AnalysisPhoneticEncoder
  
  var languageset: js.Array[AnalysisPhoneticLanguage]
  
  var max_code_len: js.UndefOr[integer] = js.undefined
  
  var name_type: AnalysisPhoneticNameType
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var rule_type: AnalysisPhoneticRuleType
  
  var `type`: phonetic
}
object AnalysisPhoneticTokenFilter {
  
  inline def apply(
    encoder: AnalysisPhoneticEncoder,
    languageset: js.Array[AnalysisPhoneticLanguage],
    name_type: AnalysisPhoneticNameType,
    rule_type: AnalysisPhoneticRuleType
  ): AnalysisPhoneticTokenFilter = {
    val __obj = js.Dynamic.literal(encoder = encoder.asInstanceOf[js.Any], languageset = languageset.asInstanceOf[js.Any], name_type = name_type.asInstanceOf[js.Any], rule_type = rule_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("phonetic")
    __obj.asInstanceOf[AnalysisPhoneticTokenFilter]
  }
  
  extension [Self <: AnalysisPhoneticTokenFilter](x: Self) {
    
    inline def setEncoder(value: AnalysisPhoneticEncoder): Self = StObject.set(x, "encoder", value.asInstanceOf[js.Any])
    
    inline def setLanguageset(value: js.Array[AnalysisPhoneticLanguage]): Self = StObject.set(x, "languageset", value.asInstanceOf[js.Any])
    
    inline def setLanguagesetVarargs(value: AnalysisPhoneticLanguage*): Self = StObject.set(x, "languageset", js.Array(value*))
    
    inline def setMax_code_len(value: integer): Self = StObject.set(x, "max_code_len", value.asInstanceOf[js.Any])
    
    inline def setMax_code_lenUndefined: Self = StObject.set(x, "max_code_len", js.undefined)
    
    inline def setName_type(value: AnalysisPhoneticNameType): Self = StObject.set(x, "name_type", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setRule_type(value: AnalysisPhoneticRuleType): Self = StObject.set(x, "rule_type", value.asInstanceOf[js.Any])
    
    inline def setType(value: phonetic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
