package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateItemRelationshipsStorageData extends StObject {
  
  var id: String
  
  var `type`: String
}
object CreateItemRelationshipsStorageData {
  
  inline def apply(id: String, `type`: String): CreateItemRelationshipsStorageData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemRelationshipsStorageData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateItemRelationshipsStorageData] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
