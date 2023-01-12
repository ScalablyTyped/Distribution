package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.IIndexField
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.QueryScope
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Index. */
trait IIndex extends StObject {
  
  /** Index fields */
  var fields: js.UndefOr[js.Array[IIndexField] | Null] = js.undefined
  
  /** Index name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Index queryScope */
  var queryScope: js.UndefOr[QueryScope | Null] = js.undefined
  
  /** Index state */
  var state: js.UndefOr[State | Null] = js.undefined
}
object IIndex {
  
  inline def apply(): IIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IIndex] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[IIndexField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: IIndexField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQueryScope(value: QueryScope): Self = StObject.set(x, "queryScope", value.asInstanceOf[js.Any])
    
    inline def setQueryScopeNull: Self = StObject.set(x, "queryScope", null)
    
    inline def setQueryScopeUndefined: Self = StObject.set(x, "queryScope", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
