package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStickyOptions extends StObject {
  
  var anchor: js.UndefOr[String] = js.undefined
  
  var btmAnchor: js.UndefOr[String] = js.undefined
  
  var checkEvery: js.UndefOr[Double] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var containerClass: js.UndefOr[String] = js.undefined
  
  var marginBottom: js.UndefOr[Double] = js.undefined
  
  var marginTop: js.UndefOr[Double] = js.undefined
  
  var stickTo: js.UndefOr[String] = js.undefined
  
  var stickyClass: js.UndefOr[String] = js.undefined
  
  var stickyOn: js.UndefOr[String] = js.undefined
  
  var topAnchor: js.UndefOr[String] = js.undefined
}
object IStickyOptions {
  
  inline def apply(): IStickyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStickyOptions]
  }
  
  extension [Self <: IStickyOptions](x: Self) {
    
    inline def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setBtmAnchor(value: String): Self = StObject.set(x, "btmAnchor", value.asInstanceOf[js.Any])
    
    inline def setBtmAnchorUndefined: Self = StObject.set(x, "btmAnchor", js.undefined)
    
    inline def setCheckEvery(value: Double): Self = StObject.set(x, "checkEvery", value.asInstanceOf[js.Any])
    
    inline def setCheckEveryUndefined: Self = StObject.set(x, "checkEvery", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
    
    inline def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setStickTo(value: String): Self = StObject.set(x, "stickTo", value.asInstanceOf[js.Any])
    
    inline def setStickToUndefined: Self = StObject.set(x, "stickTo", js.undefined)
    
    inline def setStickyClass(value: String): Self = StObject.set(x, "stickyClass", value.asInstanceOf[js.Any])
    
    inline def setStickyClassUndefined: Self = StObject.set(x, "stickyClass", js.undefined)
    
    inline def setStickyOn(value: String): Self = StObject.set(x, "stickyOn", value.asInstanceOf[js.Any])
    
    inline def setStickyOnUndefined: Self = StObject.set(x, "stickyOn", js.undefined)
    
    inline def setTopAnchor(value: String): Self = StObject.set(x, "topAnchor", value.asInstanceOf[js.Any])
    
    inline def setTopAnchorUndefined: Self = StObject.set(x, "topAnchor", js.undefined)
  }
}
