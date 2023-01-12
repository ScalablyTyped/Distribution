package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlNlpBertTokenizationConfig extends StObject {
  
  var do_lower_case: js.UndefOr[Boolean] = js.undefined
  
  var max_sequence_length: js.UndefOr[integer] = js.undefined
  
  var span: js.UndefOr[integer] = js.undefined
  
  var truncate: js.UndefOr[MlTokenizationTruncate] = js.undefined
  
  var with_special_tokens: js.UndefOr[Boolean] = js.undefined
}
object MlNlpBertTokenizationConfig {
  
  inline def apply(): MlNlpBertTokenizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlNlpBertTokenizationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlNlpBertTokenizationConfig] (val x: Self) extends AnyVal {
    
    inline def setDo_lower_case(value: Boolean): Self = StObject.set(x, "do_lower_case", value.asInstanceOf[js.Any])
    
    inline def setDo_lower_caseUndefined: Self = StObject.set(x, "do_lower_case", js.undefined)
    
    inline def setMax_sequence_length(value: integer): Self = StObject.set(x, "max_sequence_length", value.asInstanceOf[js.Any])
    
    inline def setMax_sequence_lengthUndefined: Self = StObject.set(x, "max_sequence_length", js.undefined)
    
    inline def setSpan(value: integer): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setTruncate(value: MlTokenizationTruncate): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
    
    inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    
    inline def setWith_special_tokens(value: Boolean): Self = StObject.set(x, "with_special_tokens", value.asInstanceOf[js.Any])
    
    inline def setWith_special_tokensUndefined: Self = StObject.set(x, "with_special_tokens", js.undefined)
  }
}
