package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Global extends StObject {
  
  var global: js.UndefOr[Location] = js.undefined
  
  var pager: js.UndefOr[Location] = js.undefined
  
  var tabName: js.UndefOr[Location] = js.undefined
  
  var topMenuRight: js.UndefOr[Location] = js.undefined
  
  var viewChange: js.UndefOr[Location] = js.undefined
  
  var viewMenu: js.UndefOr[Location] = js.undefined
  
  var viewMenuBlock: js.UndefOr[Location] = js.undefined
  
  var viewerCorner: js.UndefOr[Location] = js.undefined
}
object Global {
  
  @scala.inline
  def apply(): Global = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Global]
  }
  
  @scala.inline
  implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobal(value: Location): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    @scala.inline
    def setPager(value: Location): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    @scala.inline
    def setTabName(value: Location): Self = StObject.set(x, "tabName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabNameUndefined: Self = StObject.set(x, "tabName", js.undefined)
    
    @scala.inline
    def setTopMenuRight(value: Location): Self = StObject.set(x, "topMenuRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMenuRightUndefined: Self = StObject.set(x, "topMenuRight", js.undefined)
    
    @scala.inline
    def setViewChange(value: Location): Self = StObject.set(x, "viewChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewChangeUndefined: Self = StObject.set(x, "viewChange", js.undefined)
    
    @scala.inline
    def setViewMenu(value: Location): Self = StObject.set(x, "viewMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMenuBlock(value: Location): Self = StObject.set(x, "viewMenuBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMenuBlockUndefined: Self = StObject.set(x, "viewMenuBlock", js.undefined)
    
    @scala.inline
    def setViewMenuUndefined: Self = StObject.set(x, "viewMenu", js.undefined)
    
    @scala.inline
    def setViewerCorner(value: Location): Self = StObject.set(x, "viewerCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerCornerUndefined: Self = StObject.set(x, "viewerCorner", js.undefined)
  }
}
