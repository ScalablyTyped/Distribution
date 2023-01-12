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
  
  inline def apply(): Global = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Global]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
    
    inline def setGlobal(value: Location): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setPager(value: Location): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    inline def setTabName(value: Location): Self = StObject.set(x, "tabName", value.asInstanceOf[js.Any])
    
    inline def setTabNameUndefined: Self = StObject.set(x, "tabName", js.undefined)
    
    inline def setTopMenuRight(value: Location): Self = StObject.set(x, "topMenuRight", value.asInstanceOf[js.Any])
    
    inline def setTopMenuRightUndefined: Self = StObject.set(x, "topMenuRight", js.undefined)
    
    inline def setViewChange(value: Location): Self = StObject.set(x, "viewChange", value.asInstanceOf[js.Any])
    
    inline def setViewChangeUndefined: Self = StObject.set(x, "viewChange", js.undefined)
    
    inline def setViewMenu(value: Location): Self = StObject.set(x, "viewMenu", value.asInstanceOf[js.Any])
    
    inline def setViewMenuBlock(value: Location): Self = StObject.set(x, "viewMenuBlock", value.asInstanceOf[js.Any])
    
    inline def setViewMenuBlockUndefined: Self = StObject.set(x, "viewMenuBlock", js.undefined)
    
    inline def setViewMenuUndefined: Self = StObject.set(x, "viewMenu", js.undefined)
    
    inline def setViewerCorner(value: Location): Self = StObject.set(x, "viewerCorner", value.asInstanceOf[js.Any])
    
    inline def setViewerCornerUndefined: Self = StObject.set(x, "viewerCorner", js.undefined)
  }
}
