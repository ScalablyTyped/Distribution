package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExportDocumentsResponse. */
trait IExportDocumentsResponse extends StObject {
  
  /** ExportDocumentsResponse outputUriPrefix */
  var outputUriPrefix: js.UndefOr[String | Null] = js.undefined
}
object IExportDocumentsResponse {
  
  inline def apply(): IExportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExportDocumentsResponse]
  }
  
  extension [Self <: IExportDocumentsResponse](x: Self) {
    
    inline def setOutputUriPrefix(value: String): Self = StObject.set(x, "outputUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setOutputUriPrefixNull: Self = StObject.set(x, "outputUriPrefix", null)
    
    inline def setOutputUriPrefixUndefined: Self = StObject.set(x, "outputUriPrefix", js.undefined)
  }
}
