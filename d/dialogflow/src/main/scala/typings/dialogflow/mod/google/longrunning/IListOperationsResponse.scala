package typings.dialogflow.mod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListOperationsResponse. */
trait IListOperationsResponse extends StObject {
  
  /** ListOperationsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListOperationsResponse operations */
  var operations: js.UndefOr[js.Array[IOperation] | Null] = js.undefined
}
object IListOperationsResponse {
  
  @scala.inline
  def apply(): IListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListOperationsResponse]
  }
  
  @scala.inline
  implicit class IListOperationsResponseMutableBuilder[Self <: IListOperationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setOperations(value: js.Array[IOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: IOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
