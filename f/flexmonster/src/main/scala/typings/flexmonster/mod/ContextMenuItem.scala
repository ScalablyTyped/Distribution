package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuItem extends StObject {
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var handler: js.UndefOr[js.Function0[Unit] | String] = js.undefined
  
  var isSelected: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var submenu: js.UndefOr[js.Array[ContextMenuItem]] = js.undefined
}
object ContextMenuItem {
  
  @scala.inline
  def apply(): ContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuItem]
  }
  
  @scala.inline
  implicit class ContextMenuItemMutableBuilder[Self <: ContextMenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setHandler(value: js.Function0[Unit] | String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerFunction0(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSubmenu(value: js.Array[ContextMenuItem]): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    
    @scala.inline
    def setSubmenuVarargs(value: ContextMenuItem*): Self = StObject.set(x, "submenu", js.Array(value :_*))
  }
}
