package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DPlayerContextMenuItem extends StObject {
  
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var link: js.UndefOr[String] = js.undefined
  
  var text: String
}
object DPlayerContextMenuItem {
  
  @scala.inline
  def apply(text: String): DPlayerContextMenuItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerContextMenuItem]
  }
  
  @scala.inline
  implicit class DPlayerContextMenuItemMutableBuilder[Self <: DPlayerContextMenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
