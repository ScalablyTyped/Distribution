package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Field.IIndexConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Field. */
trait IField extends StObject {
  
  /** Field indexConfig */
  var indexConfig: js.UndefOr[IIndexConfig | Null] = js.undefined
  
  /** Field name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IField {
  
  inline def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IField] (val x: Self) extends AnyVal {
    
    inline def setIndexConfig(value: IIndexConfig): Self = StObject.set(x, "indexConfig", value.asInstanceOf[js.Any])
    
    inline def setIndexConfigNull: Self = StObject.set(x, "indexConfig", null)
    
    inline def setIndexConfigUndefined: Self = StObject.set(x, "indexConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
