package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlNlpRobertaTokenizationConfig extends StObject {
  
  var add_prefix_space: js.UndefOr[Boolean] = js.undefined
  
  var max_sequence_length: js.UndefOr[integer] = js.undefined
  
  var span: js.UndefOr[integer] = js.undefined
  
  var truncate: js.UndefOr[MlTokenizationTruncate] = js.undefined
  
  var with_special_tokens: js.UndefOr[Boolean] = js.undefined
}
object MlNlpRobertaTokenizationConfig {
  
  inline def apply(): MlNlpRobertaTokenizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlNlpRobertaTokenizationConfig]
  }
  
  extension [Self <: MlNlpRobertaTokenizationConfig](x: Self) {
    
    inline def setAdd_prefix_space(value: Boolean): Self = StObject.set(x, "add_prefix_space", value.asInstanceOf[js.Any])
    
    inline def setAdd_prefix_spaceUndefined: Self = StObject.set(x, "add_prefix_space", js.undefined)
    
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
