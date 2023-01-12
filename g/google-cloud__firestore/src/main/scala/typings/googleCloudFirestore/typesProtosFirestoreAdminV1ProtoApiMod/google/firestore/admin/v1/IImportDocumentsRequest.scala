package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ImportDocumentsRequest. */
trait IImportDocumentsRequest extends StObject {
  
  /** ImportDocumentsRequest collectionIds */
  var collectionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ImportDocumentsRequest inputUriPrefix */
  var inputUriPrefix: js.UndefOr[String | Null] = js.undefined
  
  /** ImportDocumentsRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IImportDocumentsRequest {
  
  inline def apply(): IImportDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImportDocumentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IImportDocumentsRequest] (val x: Self) extends AnyVal {
    
    inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdsNull: Self = StObject.set(x, "collectionIds", null)
    
    inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value*))
    
    inline def setInputUriPrefix(value: String): Self = StObject.set(x, "inputUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setInputUriPrefixNull: Self = StObject.set(x, "inputUriPrefix", null)
    
    inline def setInputUriPrefixUndefined: Self = StObject.set(x, "inputUriPrefix", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
