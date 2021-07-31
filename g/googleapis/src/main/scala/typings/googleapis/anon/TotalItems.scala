package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalItems extends StObject {
  
  var selfLink: js.UndefOr[String] = js.undefined
  
  var totalItems: js.UndefOr[String] = js.undefined
}
object TotalItems {
  
  @scala.inline
  def apply(): TotalItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalItems]
  }
  
  @scala.inline
  implicit class TotalItemsMutableBuilder[Self <: TotalItems] (val x: Self) extends AnyVal {
    
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
