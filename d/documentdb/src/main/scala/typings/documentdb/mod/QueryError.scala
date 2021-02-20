package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryError extends StObject {
  
  /** A string representing the error information. */
  var body: String = js.native
  
  /** The response code corresponding to the error. */
  var code: Double = js.native
}
object QueryError {
  
  @scala.inline
  def apply(body: String, code: Double): QueryError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryError]
  }
  
  @scala.inline
  implicit class QueryErrorMutableBuilder[Self <: QueryError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
