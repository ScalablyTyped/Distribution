package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVersionDataRelationshipsItem extends StObject {
  
  var data: js.UndefOr[CreateVersionDataRelationshipsItemData] = js.native
}
object CreateVersionDataRelationshipsItem {
  
  @scala.inline
  def apply(): CreateVersionDataRelationshipsItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVersionDataRelationshipsItem]
  }
  
  @scala.inline
  implicit class CreateVersionDataRelationshipsItemMutableBuilder[Self <: CreateVersionDataRelationshipsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CreateVersionDataRelationshipsItemData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
