package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListCollectionIdsResponse. */
trait IListCollectionIdsResponse extends StObject {
  
  /** ListCollectionIdsResponse collectionIds */
  var collectionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ListCollectionIdsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListCollectionIdsResponse {
  
  inline def apply(): IListCollectionIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListCollectionIdsResponse]
  }
  
  extension [Self <: IListCollectionIdsResponse](x: Self) {
    
    inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdsNull: Self = StObject.set(x, "collectionIds", null)
    
    inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
