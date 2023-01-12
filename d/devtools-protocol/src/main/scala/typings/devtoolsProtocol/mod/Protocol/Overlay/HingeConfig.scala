package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HingeConfig extends StObject {
  
  /**
    * The content box highlight fill color (default: a dark color).
    */
  var contentColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The content box highlight outline color (default: transparent).
    */
  var outlineColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * A rectangle represent hinge
    */
  var rect: Rect
}
object HingeConfig {
  
  inline def apply(rect: Rect): HingeConfig = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[HingeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HingeConfig] (val x: Self) extends AnyVal {
    
    inline def setContentColor(value: RGBA): Self = StObject.set(x, "contentColor", value.asInstanceOf[js.Any])
    
    inline def setContentColorUndefined: Self = StObject.set(x, "contentColor", js.undefined)
    
    inline def setOutlineColor(value: RGBA): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
