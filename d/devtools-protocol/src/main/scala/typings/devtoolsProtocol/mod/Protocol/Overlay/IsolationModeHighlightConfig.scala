package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsolationModeHighlightConfig extends StObject {
  
  /**
    * The fill color for the mask covering non-isolated elements (default: transparent).
    */
  var maskColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The fill color of the resizers (default: transparent).
    */
  var resizerColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The fill color for resizer handles (default: transparent).
    */
  var resizerHandleColor: js.UndefOr[RGBA] = js.undefined
}
object IsolationModeHighlightConfig {
  
  inline def apply(): IsolationModeHighlightConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsolationModeHighlightConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsolationModeHighlightConfig] (val x: Self) extends AnyVal {
    
    inline def setMaskColor(value: RGBA): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
    
    inline def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
    
    inline def setResizerColor(value: RGBA): Self = StObject.set(x, "resizerColor", value.asInstanceOf[js.Any])
    
    inline def setResizerColorUndefined: Self = StObject.set(x, "resizerColor", js.undefined)
    
    inline def setResizerHandleColor(value: RGBA): Self = StObject.set(x, "resizerHandleColor", value.asInstanceOf[js.Any])
    
    inline def setResizerHandleColorUndefined: Self = StObject.set(x, "resizerHandleColor", js.undefined)
  }
}
