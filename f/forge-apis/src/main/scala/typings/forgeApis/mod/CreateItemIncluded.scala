package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateItemIncluded extends StObject {
  
  var attributes: js.UndefOr[CreateStorageDataAttributes] = js.native
  
  var id: String = js.native
  
  var relationships: js.UndefOr[CreateItemRelationships] = js.native
  
  var `type`: String = js.native
}
object CreateItemIncluded {
  
  @scala.inline
  def apply(id: String, `type`: String): CreateItemIncluded = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemIncluded]
  }
  
  @scala.inline
  implicit class CreateItemIncludedMutableBuilder[Self <: CreateItemIncluded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: CreateStorageDataAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationships(value: CreateItemRelationships): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
