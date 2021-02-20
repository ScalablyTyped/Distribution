package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListDocumentsRequest. */
@js.native
trait IListDocumentsRequest extends StObject {
  
  /** ListDocumentsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.native
  
  /** ListDocumentsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.native
  
  /** ListDocumentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}
object IListDocumentsRequest {
  
  @scala.inline
  def apply(): IListDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListDocumentsRequest]
  }
  
  @scala.inline
  implicit class IListDocumentsRequestMutableBuilder[Self <: IListDocumentsRequest] (val x: Self) extends AnyVal {
    
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
