package typings.dialogflow.mod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListOperationsRequest. */
@js.native
trait IListOperationsRequest extends StObject {
  
  /** ListOperationsRequest filter */
  var filter: js.UndefOr[String | Null] = js.native
  
  /** ListOperationsRequest name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** ListOperationsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.native
  
  /** ListOperationsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.native
}
object IListOperationsRequest {
  
  @scala.inline
  def apply(): IListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListOperationsRequest]
  }
  
  @scala.inline
  implicit class IListOperationsRequestMutableBuilder[Self <: IListOperationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNull: Self = StObject.set(x, "filter", null)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
