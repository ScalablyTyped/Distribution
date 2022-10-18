package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteIndexRequest. */
trait IDeleteIndexRequest extends StObject {
  
  /** DeleteIndexRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IDeleteIndexRequest {
  
  inline def apply(): IDeleteIndexRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteIndexRequest]
  }
  
  extension [Self <: IDeleteIndexRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
