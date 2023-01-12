package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslRankFeatureFunctionSaturation extends StObject {
  
  var pivot: js.UndefOr[float] = js.undefined
}
object QueryDslRankFeatureFunctionSaturation {
  
  inline def apply(): QueryDslRankFeatureFunctionSaturation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslRankFeatureFunctionSaturation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslRankFeatureFunctionSaturation] (val x: Self) extends AnyVal {
    
    inline def setPivot(value: float): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
    
    inline def setPivotUndefined: Self = StObject.set(x, "pivot", js.undefined)
  }
}
