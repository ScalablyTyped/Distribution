package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslRangeQueryBase
  extends StObject
     with QueryDslQueryBase {
  
  var relation: js.UndefOr[QueryDslRangeRelation] = js.undefined
}
object QueryDslRangeQueryBase {
  
  inline def apply(): QueryDslRangeQueryBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslRangeQueryBase]
  }
  
  extension [Self <: QueryDslRangeQueryBase](x: Self) {
    
    inline def setRelation(value: QueryDslRangeRelation): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
  }
}
