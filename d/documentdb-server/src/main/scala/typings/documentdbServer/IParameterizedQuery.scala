package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Can be used as the query parameter in queryAttachments and queryDocuments. */
trait IParameterizedQuery extends StObject {
  
  /** Parameters */
  var parameters: js.Array[IQueryParam]
  
  /** SQL query string. */
  var query: String
}
object IParameterizedQuery {
  
  inline def apply(parameters: js.Array[IQueryParam], query: String): IParameterizedQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParameterizedQuery]
  }
  
  extension [Self <: IParameterizedQuery](x: Self) {
    
    inline def setParameters(value: js.Array[IQueryParam]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: IQueryParam*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
