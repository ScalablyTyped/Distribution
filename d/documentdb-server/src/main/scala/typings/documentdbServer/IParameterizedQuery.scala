package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Can be used as the query parameter in queryAttachments and queryDocuments. */
@js.native
trait IParameterizedQuery extends StObject {
  
  /** Parameters */
  var parameters: js.Array[IQueryParam] = js.native
  
  /** SQL query string. */
  var query: String = js.native
}
object IParameterizedQuery {
  
  @scala.inline
  def apply(parameters: js.Array[IQueryParam], query: String): IParameterizedQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParameterizedQuery]
  }
  
  @scala.inline
  implicit class IParameterizedQueryMutableBuilder[Self <: IParameterizedQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[IQueryParam]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: IQueryParam*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
