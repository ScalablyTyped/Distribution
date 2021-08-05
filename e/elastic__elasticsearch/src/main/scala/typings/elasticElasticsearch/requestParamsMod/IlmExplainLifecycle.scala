package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmExplainLifecycle
  extends StObject
     with Generic {
  
  var index: String
  
  var only_errors: js.UndefOr[Boolean] = js.undefined
  
  var only_managed: js.UndefOr[Boolean] = js.undefined
}
object IlmExplainLifecycle {
  
  inline def apply(index: String): IlmExplainLifecycle = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmExplainLifecycle]
  }
  
  extension [Self <: IlmExplainLifecycle](x: Self) {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOnly_errors(value: Boolean): Self = StObject.set(x, "only_errors", value.asInstanceOf[js.Any])
    
    inline def setOnly_errorsUndefined: Self = StObject.set(x, "only_errors", js.undefined)
    
    inline def setOnly_managed(value: Boolean): Self = StObject.set(x, "only_managed", value.asInstanceOf[js.Any])
    
    inline def setOnly_managedUndefined: Self = StObject.set(x, "only_managed", js.undefined)
  }
}
