package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListDatabasesRequest. */
trait IListDatabasesRequest extends StObject {
  
  /** ListDatabasesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IListDatabasesRequest {
  
  inline def apply(): IListDatabasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListDatabasesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IListDatabasesRequest] (val x: Self) extends AnyVal {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
