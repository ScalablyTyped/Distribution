package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemCount extends StObject {
  
  var itemCount: js.UndefOr[String] = js.native
  
  var itemType: js.UndefOr[String] = js.native
}
object ItemCount {
  
  @scala.inline
  def apply(): ItemCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemCount]
  }
  
  @scala.inline
  implicit class ItemCountMutableBuilder[Self <: ItemCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    @scala.inline
    def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
  }
}
