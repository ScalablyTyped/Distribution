package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderData extends StObject {
  
  var attributes: js.UndefOr[CreateFolderDataAttributes] = js.undefined
  
  var relationships: js.UndefOr[CreateFolderDataRelationships] = js.undefined
  
  var `type`: String
}
object CreateFolderData {
  
  @scala.inline
  def apply(`type`: String): CreateFolderData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderData]
  }
  
  @scala.inline
  implicit class CreateFolderDataMutableBuilder[Self <: CreateFolderData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: CreateFolderDataAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setRelationships(value: CreateFolderDataRelationships): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
