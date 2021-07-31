package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsideMenu extends StObject {
  
  var asideMenu: js.UndefOr[Boolean] = js.undefined
  
  var bottomMenu: js.UndefOr[Boolean] = js.undefined
  
  var header: js.UndefOr[Boolean] = js.undefined
  
  var topMenu: js.UndefOr[Boolean] = js.undefined
}
object AsideMenu {
  
  @scala.inline
  def apply(): AsideMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsideMenu]
  }
  
  @scala.inline
  implicit class AsideMenuMutableBuilder[Self <: AsideMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsideMenu(value: Boolean): Self = StObject.set(x, "asideMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsideMenuUndefined: Self = StObject.set(x, "asideMenu", js.undefined)
    
    @scala.inline
    def setBottomMenu(value: Boolean): Self = StObject.set(x, "bottomMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMenuUndefined: Self = StObject.set(x, "bottomMenu", js.undefined)
    
    @scala.inline
    def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setTopMenu(value: Boolean): Self = StObject.set(x, "topMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMenuUndefined: Self = StObject.set(x, "topMenu", js.undefined)
  }
}
