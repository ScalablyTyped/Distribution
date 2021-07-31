package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateItemRelationshipsStorageData extends StObject {
  
  var id: String
  
  var `type`: String
}
object CreateItemRelationshipsStorageData {
  
  @scala.inline
  def apply(id: String, `type`: String): CreateItemRelationshipsStorageData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemRelationshipsStorageData]
  }
  
  @scala.inline
  implicit class CreateItemRelationshipsStorageDataMutableBuilder[Self <: CreateItemRelationshipsStorageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
