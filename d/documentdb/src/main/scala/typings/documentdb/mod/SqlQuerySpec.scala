package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlQuerySpec extends StObject {
  
  /** The array of SqlParameters. */
  var parameters: js.Array[SqlParameter] = js.native
  
  /** The body of the query. */
  var query: String = js.native
}
object SqlQuerySpec {
  
  @scala.inline
  def apply(parameters: js.Array[SqlParameter], query: String): SqlQuerySpec = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlQuerySpec]
  }
  
  @scala.inline
  implicit class SqlQuerySpecMutableBuilder[Self <: SqlQuerySpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[SqlParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: SqlParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
