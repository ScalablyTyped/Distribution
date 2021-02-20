package typings.googleapis.anon

import typings.googleapis.bloggerV3Mod.bloggerV3.SchemaComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsSelfLink extends StObject {
  
  var items: js.UndefOr[js.Array[SchemaComment]] = js.native
  
  var selfLink: js.UndefOr[String] = js.native
  
  var totalItems: js.UndefOr[String] = js.native
}
object ItemsSelfLink {
  
  @scala.inline
  def apply(): ItemsSelfLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsSelfLink]
  }
  
  @scala.inline
  implicit class ItemsSelfLinkMutableBuilder[Self <: ItemsSelfLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaComment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaComment*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setTotalItems(value: String): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
