package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListFieldsResponse. */
trait IListFieldsResponse extends StObject {
  
  /** ListFieldsResponse fields */
  var fields: js.UndefOr[js.Array[IField] | Null] = js.undefined
  
  /** ListFieldsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListFieldsResponse {
  
  inline def apply(): IListFieldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListFieldsResponse]
  }
  
  extension [Self <: IListFieldsResponse](x: Self) {
    
    inline def setFields(value: js.Array[IField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: IField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
