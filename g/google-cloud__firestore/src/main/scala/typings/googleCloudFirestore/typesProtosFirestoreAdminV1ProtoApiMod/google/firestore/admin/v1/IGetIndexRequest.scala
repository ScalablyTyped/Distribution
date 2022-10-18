package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetIndexRequest. */
trait IGetIndexRequest extends StObject {
  
  /** GetIndexRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IGetIndexRequest {
  
  inline def apply(): IGetIndexRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetIndexRequest]
  }
  
  extension [Self <: IGetIndexRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
