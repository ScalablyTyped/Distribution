package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResponse extends StObject {
  
  def getDataTable(): DataTable = js.native
  
  def getDetailedMessage(): String = js.native
  
  def getMessage(): String = js.native
  
  def getReasons(): js.Array[String] = js.native
  
  def hasWarning(): Boolean = js.native
  
  def isError(): Boolean = js.native
}
object QueryResponse {
  
  @scala.inline
  def apply(
    getDataTable: () => DataTable,
    getDetailedMessage: () => String,
    getMessage: () => String,
    getReasons: () => js.Array[String],
    hasWarning: () => Boolean,
    isError: () => Boolean
  ): QueryResponse = {
    val __obj = js.Dynamic.literal(getDataTable = js.Any.fromFunction0(getDataTable), getDetailedMessage = js.Any.fromFunction0(getDetailedMessage), getMessage = js.Any.fromFunction0(getMessage), getReasons = js.Any.fromFunction0(getReasons), hasWarning = js.Any.fromFunction0(hasWarning), isError = js.Any.fromFunction0(isError))
    __obj.asInstanceOf[QueryResponse]
  }
  
  @scala.inline
  implicit class QueryResponseMutableBuilder[Self <: QueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDataTable(value: () => DataTable): Self = StObject.set(x, "getDataTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDetailedMessage(value: () => String): Self = StObject.set(x, "getDetailedMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMessage(value: () => String): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReasons(value: () => js.Array[String]): Self = StObject.set(x, "getReasons", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasWarning(value: () => Boolean): Self = StObject.set(x, "hasWarning", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsError(value: () => Boolean): Self = StObject.set(x, "isError", js.Any.fromFunction0(value))
  }
}
