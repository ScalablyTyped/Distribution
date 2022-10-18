package typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollectionIdsResponse extends StObject {
  
  var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCollectionIdsResponse {
  
  inline def apply(): ListCollectionIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionIdsResponse]
  }
  
  extension [Self <: ListCollectionIdsResponse](x: Self) {
    
    inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
