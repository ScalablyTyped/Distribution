package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlNlpTokenizationUpdateOptions extends StObject {
  
  var span: js.UndefOr[integer] = js.undefined
  
  var truncate: js.UndefOr[MlTokenizationTruncate] = js.undefined
}
object MlNlpTokenizationUpdateOptions {
  
  inline def apply(): MlNlpTokenizationUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlNlpTokenizationUpdateOptions]
  }
  
  extension [Self <: MlNlpTokenizationUpdateOptions](x: Self) {
    
    inline def setSpan(value: integer): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setTruncate(value: MlTokenizationTruncate): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
    
    inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
  }
}
