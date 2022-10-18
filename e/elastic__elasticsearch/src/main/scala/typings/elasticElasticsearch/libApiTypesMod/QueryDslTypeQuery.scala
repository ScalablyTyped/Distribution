package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslTypeQuery
  extends StObject
     with QueryDslQueryBase {
  
  var value: String
}
object QueryDslTypeQuery {
  
  inline def apply(value: String): QueryDslTypeQuery = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslTypeQuery]
  }
  
  extension [Self <: QueryDslTypeQuery](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
