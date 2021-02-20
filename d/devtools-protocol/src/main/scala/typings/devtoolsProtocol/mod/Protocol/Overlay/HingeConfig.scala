package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HingeConfig extends StObject {
  
  /**
    * The content box highlight fill color (default: a dark color).
    */
  var contentColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The content box highlight outline color (default: transparent).
    */
  var outlineColor: js.UndefOr[RGBA] = js.native
  
  /**
    * A rectangle represent hinge
    */
  var rect: Rect = js.native
}
object HingeConfig {
  
  @scala.inline
  def apply(rect: Rect): HingeConfig = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[HingeConfig]
  }
  
  @scala.inline
  implicit class HingeConfigMutableBuilder[Self <: HingeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentColor(value: RGBA): Self = StObject.set(x, "contentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentColorUndefined: Self = StObject.set(x, "contentColor", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: RGBA): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
