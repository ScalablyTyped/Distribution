package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslSpanContainingQuery
  extends StObject
     with QueryDslQueryBase {
  
  var big: QueryDslSpanQuery
  
  var little: QueryDslSpanQuery
}
object QueryDslSpanContainingQuery {
  
  inline def apply(big: QueryDslSpanQuery, little: QueryDslSpanQuery): QueryDslSpanContainingQuery = {
    val __obj = js.Dynamic.literal(big = big.asInstanceOf[js.Any], little = little.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslSpanContainingQuery]
  }
  
  extension [Self <: QueryDslSpanContainingQuery](x: Self) {
    
    inline def setBig(value: QueryDslSpanQuery): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
    
    inline def setLittle(value: QueryDslSpanQuery): Self = StObject.set(x, "little", value.asInstanceOf[js.Any])
  }
}
