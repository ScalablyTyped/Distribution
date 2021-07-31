package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateItemData extends StObject {
  
  var attributes: js.UndefOr[CreateStorageDataAttributes] = js.undefined
  
  var relationships: js.UndefOr[CreateItemDataRelationships] = js.undefined
  
  var `type`: String
}
object CreateItemData {
  
  @scala.inline
  def apply(`type`: String): CreateItemData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemData]
  }
  
  @scala.inline
  implicit class CreateItemDataMutableBuilder[Self <: CreateItemData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: CreateStorageDataAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setRelationships(value: CreateItemDataRelationships): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
