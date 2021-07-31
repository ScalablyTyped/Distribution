package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateItemDataRelationshipsTipData extends StObject {
  
  var id: String
  
  var `type`: String
}
object CreateItemDataRelationshipsTipData {
  
  @scala.inline
  def apply(id: String, `type`: String): CreateItemDataRelationshipsTipData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemDataRelationshipsTipData]
  }
  
  @scala.inline
  implicit class CreateItemDataRelationshipsTipDataMutableBuilder[Self <: CreateItemDataRelationshipsTipData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
