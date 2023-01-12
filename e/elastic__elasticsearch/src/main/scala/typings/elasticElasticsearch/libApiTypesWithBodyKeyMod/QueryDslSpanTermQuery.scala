package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslSpanTermQuery
  extends StObject
     with QueryDslQueryBase {
  
  var value: String
}
object QueryDslSpanTermQuery {
  
  inline def apply(value: String): QueryDslSpanTermQuery = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslSpanTermQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslSpanTermQuery] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
