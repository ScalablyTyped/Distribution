package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListEntityTypesResponse. */
@js.native
trait IListEntityTypesResponse extends StObject {
  
  /** ListEntityTypesResponse entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.native
  
  /** ListEntityTypesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
}
object IListEntityTypesResponse {
  
  @scala.inline
  def apply(): IListEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListEntityTypesResponse]
  }
  
  @scala.inline
  implicit class IListEntityTypesResponseMutableBuilder[Self <: IListEntityTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: js.Array[IEntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesNull: Self = StObject.set(x, "entityTypes", null)
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: IEntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
