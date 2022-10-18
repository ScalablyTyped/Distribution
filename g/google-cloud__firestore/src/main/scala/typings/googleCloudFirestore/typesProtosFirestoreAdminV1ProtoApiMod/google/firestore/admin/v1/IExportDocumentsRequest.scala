package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExportDocumentsRequest. */
trait IExportDocumentsRequest extends StObject {
  
  /** ExportDocumentsRequest collectionIds */
  var collectionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ExportDocumentsRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** ExportDocumentsRequest outputUriPrefix */
  var outputUriPrefix: js.UndefOr[String | Null] = js.undefined
}
object IExportDocumentsRequest {
  
  inline def apply(): IExportDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExportDocumentsRequest]
  }
  
  extension [Self <: IExportDocumentsRequest](x: Self) {
    
    inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdsNull: Self = StObject.set(x, "collectionIds", null)
    
    inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputUriPrefix(value: String): Self = StObject.set(x, "outputUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setOutputUriPrefixNull: Self = StObject.set(x, "outputUriPrefix", null)
    
    inline def setOutputUriPrefixUndefined: Self = StObject.set(x, "outputUriPrefix", js.undefined)
  }
}
