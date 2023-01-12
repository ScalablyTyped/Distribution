package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetFieldRequest. */
trait IGetFieldRequest extends StObject {
  
  /** GetFieldRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IGetFieldRequest {
  
  inline def apply(): IGetFieldRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetFieldRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGetFieldRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
