package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateIndexRequest. */
trait ICreateIndexRequest extends StObject {
  
  /** CreateIndexRequest index */
  var index: js.UndefOr[IIndex | Null] = js.undefined
  
  /** CreateIndexRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object ICreateIndexRequest {
  
  inline def apply(): ICreateIndexRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateIndexRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICreateIndexRequest] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: IIndex): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
