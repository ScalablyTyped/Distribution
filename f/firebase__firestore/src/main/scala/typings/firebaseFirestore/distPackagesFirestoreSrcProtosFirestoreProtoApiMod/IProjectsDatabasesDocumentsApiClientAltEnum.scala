package typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProjectsDatabasesDocumentsApiClientAltEnum extends StObject {
  
  var JSON: ProjectsDatabasesDocumentsApiClientAlt
  
  var MEDIA: ProjectsDatabasesDocumentsApiClientAlt
  
  var PROTO: ProjectsDatabasesDocumentsApiClientAlt
  
  def values(): js.Array[ProjectsDatabasesDocumentsApiClientAlt]
}
object IProjectsDatabasesDocumentsApiClientAltEnum {
  
  inline def apply(
    JSON: ProjectsDatabasesDocumentsApiClientAlt,
    MEDIA: ProjectsDatabasesDocumentsApiClientAlt,
    PROTO: ProjectsDatabasesDocumentsApiClientAlt,
    values: () => js.Array[ProjectsDatabasesDocumentsApiClientAlt]
  ): IProjectsDatabasesDocumentsApiClientAltEnum = {
    val __obj = js.Dynamic.literal(JSON = JSON.asInstanceOf[js.Any], MEDIA = MEDIA.asInstanceOf[js.Any], PROTO = PROTO.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IProjectsDatabasesDocumentsApiClientAltEnum]
  }
  
  extension [Self <: IProjectsDatabasesDocumentsApiClientAltEnum](x: Self) {
    
    inline def setJSON(value: ProjectsDatabasesDocumentsApiClientAlt): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
    
    inline def setMEDIA(value: ProjectsDatabasesDocumentsApiClientAlt): Self = StObject.set(x, "MEDIA", value.asInstanceOf[js.Any])
    
    inline def setPROTO(value: ProjectsDatabasesDocumentsApiClientAlt): Self = StObject.set(x, "PROTO", value.asInstanceOf[js.Any])
    
    inline def setValues(value: () => js.Array[ProjectsDatabasesDocumentsApiClientAlt]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
