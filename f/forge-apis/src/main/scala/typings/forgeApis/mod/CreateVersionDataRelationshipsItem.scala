package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVersionDataRelationshipsItem extends StObject {
  
  var data: js.UndefOr[CreateVersionDataRelationshipsItemData] = js.undefined
}
object CreateVersionDataRelationshipsItem {
  
  inline def apply(): CreateVersionDataRelationshipsItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVersionDataRelationshipsItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVersionDataRelationshipsItem] (val x: Self) extends AnyVal {
    
    inline def setData(value: CreateVersionDataRelationshipsItemData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
