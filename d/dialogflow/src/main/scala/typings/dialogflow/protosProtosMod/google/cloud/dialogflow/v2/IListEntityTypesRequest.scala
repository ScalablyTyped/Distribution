package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListEntityTypesRequest. */
trait IListEntityTypesRequest extends StObject {
  
  /** ListEntityTypesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** ListEntityTypesRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** ListEntityTypesRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IListEntityTypesRequest {
  
  inline def apply(): IListEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListEntityTypesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IListEntityTypesRequest] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
