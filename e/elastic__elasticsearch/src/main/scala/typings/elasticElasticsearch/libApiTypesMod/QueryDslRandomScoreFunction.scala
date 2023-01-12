package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslRandomScoreFunction extends StObject {
  
  var field: js.UndefOr[Field] = js.undefined
  
  var seed: js.UndefOr[long | String] = js.undefined
}
object QueryDslRandomScoreFunction {
  
  inline def apply(): QueryDslRandomScoreFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslRandomScoreFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslRandomScoreFunction] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setSeed(value: long | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
