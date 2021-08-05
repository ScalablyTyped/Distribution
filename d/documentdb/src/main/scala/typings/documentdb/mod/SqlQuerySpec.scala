package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlQuerySpec extends StObject {
  
  /** The array of SqlParameters. */
  var parameters: js.Array[SqlParameter]
  
  /** The body of the query. */
  var query: String
}
object SqlQuerySpec {
  
  inline def apply(parameters: js.Array[SqlParameter], query: String): SqlQuerySpec = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlQuerySpec]
  }
  
  extension [Self <: SqlQuerySpec](x: Self) {
    
    inline def setParameters(value: js.Array[SqlParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: SqlParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
