package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsAnalyze extends StObject {
  
  var max_token_count: js.UndefOr[integer] = js.undefined
}
object IndicesSettingsAnalyze {
  
  inline def apply(): IndicesSettingsAnalyze = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesSettingsAnalyze]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSettingsAnalyze] (val x: Self) extends AnyVal {
    
    inline def setMax_token_count(value: integer): Self = StObject.set(x, "max_token_count", value.asInstanceOf[js.Any])
    
    inline def setMax_token_countUndefined: Self = StObject.set(x, "max_token_count", js.undefined)
  }
}
