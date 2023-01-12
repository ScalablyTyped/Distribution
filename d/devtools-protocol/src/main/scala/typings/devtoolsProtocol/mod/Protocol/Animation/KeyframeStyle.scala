package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyframeStyle extends StObject {
  
  /**
    * `AnimationEffect`'s timing function.
    */
  var easing: String
  
  /**
    * Keyframe's time offset.
    */
  var offset: String
}
object KeyframeStyle {
  
  inline def apply(easing: String, offset: String): KeyframeStyle = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframeStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyframeStyle] (val x: Self) extends AnyVal {
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
