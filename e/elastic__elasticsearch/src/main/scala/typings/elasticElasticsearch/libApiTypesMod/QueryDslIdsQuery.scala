package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslIdsQuery
  extends StObject
     with QueryDslQueryBase {
  
  var values: js.UndefOr[Ids] = js.undefined
}
object QueryDslIdsQuery {
  
  inline def apply(): QueryDslIdsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslIdsQuery]
  }
  
  extension [Self <: QueryDslIdsQuery](x: Self) {
    
    inline def setValues(value: Ids): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Id*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
