package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListSessionEntityTypesRequest. */
trait IListSessionEntityTypesRequest extends StObject {
  
  /** ListSessionEntityTypesRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** ListSessionEntityTypesRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListSessionEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IListSessionEntityTypesRequest {
  
  @scala.inline
  def apply(): IListSessionEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSessionEntityTypesRequest]
  }
  
  @scala.inline
  implicit class IListSessionEntityTypesRequestMutableBuilder[Self <: IListSessionEntityTypesRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
