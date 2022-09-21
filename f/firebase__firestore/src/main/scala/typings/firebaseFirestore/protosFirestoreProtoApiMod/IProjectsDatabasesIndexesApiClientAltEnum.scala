package typings.firebaseFirestore.protosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProjectsDatabasesIndexesApiClientAltEnum extends StObject {
  
  var JSON: ProjectsDatabasesIndexesApiClientAlt
  
  var MEDIA: ProjectsDatabasesIndexesApiClientAlt
  
  var PROTO: ProjectsDatabasesIndexesApiClientAlt
  
  def values(): js.Array[ProjectsDatabasesIndexesApiClientAlt]
}
object IProjectsDatabasesIndexesApiClientAltEnum {
  
  inline def apply(
    JSON: ProjectsDatabasesIndexesApiClientAlt,
    MEDIA: ProjectsDatabasesIndexesApiClientAlt,
    PROTO: ProjectsDatabasesIndexesApiClientAlt,
    values: () => js.Array[ProjectsDatabasesIndexesApiClientAlt]
  ): IProjectsDatabasesIndexesApiClientAltEnum = {
    val __obj = js.Dynamic.literal(JSON = JSON.asInstanceOf[js.Any], MEDIA = MEDIA.asInstanceOf[js.Any], PROTO = PROTO.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IProjectsDatabasesIndexesApiClientAltEnum]
  }
  
  extension [Self <: IProjectsDatabasesIndexesApiClientAltEnum](x: Self) {
    
    inline def setJSON(value: ProjectsDatabasesIndexesApiClientAlt): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
    
    inline def setMEDIA(value: ProjectsDatabasesIndexesApiClientAlt): Self = StObject.set(x, "MEDIA", value.asInstanceOf[js.Any])
    
    inline def setPROTO(value: ProjectsDatabasesIndexesApiClientAlt): Self = StObject.set(x, "PROTO", value.asInstanceOf[js.Any])
    
    inline def setValues(value: () => js.Array[ProjectsDatabasesIndexesApiClientAlt]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
