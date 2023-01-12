package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVersionData extends StObject {
  
  var attributes: js.UndefOr[CreateStorageDataAttributes] = js.undefined
  
  var relationships: js.UndefOr[CreateVersionDataRelationships] = js.undefined
  
  var `type`: String
}
object CreateVersionData {
  
  inline def apply(`type`: String): CreateVersionData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVersionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVersionData] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: CreateStorageDataAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: CreateVersionDataRelationships): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
