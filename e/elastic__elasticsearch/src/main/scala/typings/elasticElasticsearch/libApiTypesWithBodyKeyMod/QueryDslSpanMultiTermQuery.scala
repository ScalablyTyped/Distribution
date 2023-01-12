package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslSpanMultiTermQuery
  extends StObject
     with QueryDslQueryBase {
  
  var `match`: QueryDslQueryContainer
}
object QueryDslSpanMultiTermQuery {
  
  inline def apply(`match`: QueryDslQueryContainer): QueryDslSpanMultiTermQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslSpanMultiTermQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslSpanMultiTermQuery] (val x: Self) extends AnyVal {
    
    inline def setMatch(value: QueryDslQueryContainer): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
