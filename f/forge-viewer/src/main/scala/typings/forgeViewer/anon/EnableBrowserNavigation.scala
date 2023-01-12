package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableBrowserNavigation extends StObject {
  
  var enableBrowserNavigation: js.UndefOr[Boolean] = js.undefined
  
  var enableHyperlinks: js.UndefOr[Boolean] = js.undefined
  
  var enableMSDFText: js.UndefOr[Boolean] = js.undefined
  
  var enableTextSearch: js.UndefOr[Boolean] = js.undefined
  
  var useTextLayer: js.UndefOr[Boolean] = js.undefined
}
object EnableBrowserNavigation {
  
  inline def apply(): EnableBrowserNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableBrowserNavigation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableBrowserNavigation] (val x: Self) extends AnyVal {
    
    inline def setEnableBrowserNavigation(value: Boolean): Self = StObject.set(x, "enableBrowserNavigation", value.asInstanceOf[js.Any])
    
    inline def setEnableBrowserNavigationUndefined: Self = StObject.set(x, "enableBrowserNavigation", js.undefined)
    
    inline def setEnableHyperlinks(value: Boolean): Self = StObject.set(x, "enableHyperlinks", value.asInstanceOf[js.Any])
    
    inline def setEnableHyperlinksUndefined: Self = StObject.set(x, "enableHyperlinks", js.undefined)
    
    inline def setEnableMSDFText(value: Boolean): Self = StObject.set(x, "enableMSDFText", value.asInstanceOf[js.Any])
    
    inline def setEnableMSDFTextUndefined: Self = StObject.set(x, "enableMSDFText", js.undefined)
    
    inline def setEnableTextSearch(value: Boolean): Self = StObject.set(x, "enableTextSearch", value.asInstanceOf[js.Any])
    
    inline def setEnableTextSearchUndefined: Self = StObject.set(x, "enableTextSearch", js.undefined)
    
    inline def setUseTextLayer(value: Boolean): Self = StObject.set(x, "useTextLayer", value.asInstanceOf[js.Any])
    
    inline def setUseTextLayerUndefined: Self = StObject.set(x, "useTextLayer", js.undefined)
  }
}
