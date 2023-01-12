package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.devtoolsProtocolStrings.RepaintsOnScroll
import typings.devtoolsProtocol.devtoolsProtocolStrings.TouchEventHandler
import typings.devtoolsProtocol.devtoolsProtocolStrings.WheelEventHandler
import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollRect extends StObject {
  
  /**
    * Rectangle itself.
    */
  var rect: Rect
  
  /**
    * Reason for rectangle to force scrolling on the main thread (ScrollRectType enum)
    */
  var `type`: RepaintsOnScroll | TouchEventHandler | WheelEventHandler
}
object ScrollRect {
  
  inline def apply(rect: Rect, `type`: RepaintsOnScroll | TouchEventHandler | WheelEventHandler): ScrollRect = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollRect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollRect] (val x: Self) extends AnyVal {
    
    inline def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setType(value: RepaintsOnScroll | TouchEventHandler | WheelEventHandler): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
