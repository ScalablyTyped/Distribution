package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowColumnDragging extends StObject {
  
  var allowColumnDragging: js.UndefOr[Boolean] = js.native
  
  var emptyPanelText: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean | auto] = js.native
}
object AllowColumnDragging {
  
  @scala.inline
  def apply(): AllowColumnDragging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowColumnDragging]
  }
  
  @scala.inline
  implicit class AllowColumnDraggingMutableBuilder[Self <: AllowColumnDragging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowColumnDragging(value: Boolean): Self = StObject.set(x, "allowColumnDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowColumnDraggingUndefined: Self = StObject.set(x, "allowColumnDragging", js.undefined)
    
    @scala.inline
    def setEmptyPanelText(value: String): Self = StObject.set(x, "emptyPanelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyPanelTextUndefined: Self = StObject.set(x, "emptyPanelText", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean | auto): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
