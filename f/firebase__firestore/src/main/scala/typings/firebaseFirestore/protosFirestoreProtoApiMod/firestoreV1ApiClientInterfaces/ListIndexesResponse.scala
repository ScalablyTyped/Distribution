package typings.firebaseFirestore.protosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndexesResponse extends StObject {
  
  var indexes: js.UndefOr[js.Array[Index]] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListIndexesResponse {
  
  inline def apply(): ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndexesResponse]
  }
  
  extension [Self <: ListIndexesResponse](x: Self) {
    
    inline def setIndexes(value: js.Array[Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: Index*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
