package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResponse extends StObject {
  
  def getDataTable(): DataTable
  
  def getDetailedMessage(): String
  
  def getMessage(): String
  
  def getReasons(): js.Array[String]
  
  def hasWarning(): Boolean
  
  def isError(): Boolean
}
object QueryResponse {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: QueryResponse] (val x: Self) extends AnyVal {
    
    inline def setGetDataTable(value: () => DataTable): Self = StObject.set(x, "getDataTable", js.Any.fromFunction0(value))
    
    inline def setGetDetailedMessage(value: () => String): Self = StObject.set(x, "getDetailedMessage", js.Any.fromFunction0(value))
    
    inline def setGetMessage(value: () => String): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
    
    inline def setGetReasons(value: () => js.Array[String]): Self = StObject.set(x, "getReasons", js.Any.fromFunction0(value))
    
    inline def setHasWarning(value: () => Boolean): Self = StObject.set(x, "hasWarning", js.Any.fromFunction0(value))
    
    inline def setIsError(value: () => Boolean): Self = StObject.set(x, "isError", js.Any.fromFunction0(value))
  }
}
