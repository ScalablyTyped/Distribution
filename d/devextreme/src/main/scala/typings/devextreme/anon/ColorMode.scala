package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.dxSankey.SankeyColorMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMode extends StObject {
  
  /**
    * Configures the links&apos; borders.
    */
  var border: js.UndefOr[ColorVisible] = js.undefined
  
  /**
    * Colors the sankey links. Applies only if colorMode is &apos;none&apos;.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how to color links.
    */
  var colorMode: js.UndefOr[SankeyColorMode] = js.undefined
  
  /**
    * Configures the appearance a link changes to when it is hovered over or pressed.
    */
  var hoverStyle: js.UndefOr[ColorHatching] = js.undefined
  
  /**
    * Specifies the links&apos; transparency.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}
object ColorMode {
  
  inline def apply(): ColorMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorMode] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorMode(value: SankeyColorMode): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    inline def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHoverStyle(value: ColorHatching): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
