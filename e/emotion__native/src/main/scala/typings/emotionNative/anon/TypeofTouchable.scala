package typings.emotionNative.anon

import typings.react.mod.ReactElement
import typings.reactNative.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTouchable extends StObject {
  
  var TOUCH_TARGET_DEBUG: Boolean
  
  def renderDebugView(config: Color): ReactElement | Null
}
object TypeofTouchable {
  
  inline def apply(TOUCH_TARGET_DEBUG: Boolean, renderDebugView: Color => ReactElement | Null): TypeofTouchable = {
    val __obj = js.Dynamic.literal(TOUCH_TARGET_DEBUG = TOUCH_TARGET_DEBUG.asInstanceOf[js.Any], renderDebugView = js.Any.fromFunction1(renderDebugView))
    __obj.asInstanceOf[TypeofTouchable]
  }
  
  extension [Self <: TypeofTouchable](x: Self) {
    
    inline def setRenderDebugView(value: Color => ReactElement | Null): Self = StObject.set(x, "renderDebugView", js.Any.fromFunction1(value))
    
    inline def setTOUCH_TARGET_DEBUG(value: Boolean): Self = StObject.set(x, "TOUCH_TARGET_DEBUG", value.asInstanceOf[js.Any])
  }
}
