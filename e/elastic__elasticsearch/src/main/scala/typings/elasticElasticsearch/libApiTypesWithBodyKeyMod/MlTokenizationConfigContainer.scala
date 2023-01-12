package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTokenizationConfigContainer extends StObject {
  
  var bert: js.UndefOr[MlNlpBertTokenizationConfig] = js.undefined
  
  var mpnet: js.UndefOr[MlNlpBertTokenizationConfig] = js.undefined
  
  var roberta: js.UndefOr[MlNlpRobertaTokenizationConfig] = js.undefined
}
object MlTokenizationConfigContainer {
  
  inline def apply(): MlTokenizationConfigContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlTokenizationConfigContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlTokenizationConfigContainer] (val x: Self) extends AnyVal {
    
    inline def setBert(value: MlNlpBertTokenizationConfig): Self = StObject.set(x, "bert", value.asInstanceOf[js.Any])
    
    inline def setBertUndefined: Self = StObject.set(x, "bert", js.undefined)
    
    inline def setMpnet(value: MlNlpBertTokenizationConfig): Self = StObject.set(x, "mpnet", value.asInstanceOf[js.Any])
    
    inline def setMpnetUndefined: Self = StObject.set(x, "mpnet", js.undefined)
    
    inline def setRoberta(value: MlNlpRobertaTokenizationConfig): Self = StObject.set(x, "roberta", value.asInstanceOf[js.Any])
    
    inline def setRobertaUndefined: Self = StObject.set(x, "roberta", js.undefined)
  }
}
