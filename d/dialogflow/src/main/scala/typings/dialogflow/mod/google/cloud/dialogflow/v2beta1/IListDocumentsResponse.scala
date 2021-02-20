package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListDocumentsResponse. */
@js.native
trait IListDocumentsResponse extends StObject {
  
  /** ListDocumentsResponse documents */
  var documents: js.UndefOr[js.Array[IDocument] | Null] = js.native
  
  /** ListDocumentsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
}
object IListDocumentsResponse {
  
  @scala.inline
  def apply(): IListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListDocumentsResponse]
  }
  
  @scala.inline
  implicit class IListDocumentsResponseMutableBuilder[Self <: IListDocumentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocuments(value: js.Array[IDocument]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsNull: Self = StObject.set(x, "documents", null)
    
    @scala.inline
    def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    @scala.inline
    def setDocumentsVarargs(value: IDocument*): Self = StObject.set(x, "documents", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
