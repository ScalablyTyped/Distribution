package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollSnapContainerHighlightConfig extends StObject {
  
  /**
    * The margin highlight fill color (default: transparent).
    */
  var scrollMarginColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The padding highlight fill color (default: transparent).
    */
  var scrollPaddingColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The style of the snap area border (default: transparent)
    */
  var snapAreaBorder: js.UndefOr[LineStyle] = js.undefined
  
  /**
    * The style of the snapport border (default: transparent)
    */
  var snapportBorder: js.UndefOr[LineStyle] = js.undefined
}
object ScrollSnapContainerHighlightConfig {
  
  inline def apply(): ScrollSnapContainerHighlightConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollSnapContainerHighlightConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollSnapContainerHighlightConfig] (val x: Self) extends AnyVal {
    
    inline def setScrollMarginColor(value: RGBA): Self = StObject.set(x, "scrollMarginColor", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginColorUndefined: Self = StObject.set(x, "scrollMarginColor", js.undefined)
    
    inline def setScrollPaddingColor(value: RGBA): Self = StObject.set(x, "scrollPaddingColor", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingColorUndefined: Self = StObject.set(x, "scrollPaddingColor", js.undefined)
    
    inline def setSnapAreaBorder(value: LineStyle): Self = StObject.set(x, "snapAreaBorder", value.asInstanceOf[js.Any])
    
    inline def setSnapAreaBorderUndefined: Self = StObject.set(x, "snapAreaBorder", js.undefined)
    
    inline def setSnapportBorder(value: LineStyle): Self = StObject.set(x, "snapportBorder", value.asInstanceOf[js.Any])
    
    inline def setSnapportBorderUndefined: Self = StObject.set(x, "snapportBorder", js.undefined)
  }
}
