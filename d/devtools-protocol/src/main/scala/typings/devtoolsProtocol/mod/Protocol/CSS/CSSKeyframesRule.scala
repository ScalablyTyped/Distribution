package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSKeyframesRule extends StObject {
  
  /**
    * Animation name.
    */
  var animationName: Value
  
  /**
    * List of keyframes.
    */
  var keyframes: js.Array[CSSKeyframeRule]
}
object CSSKeyframesRule {
  
  inline def apply(animationName: Value, keyframes: js.Array[CSSKeyframeRule]): CSSKeyframesRule = {
    val __obj = js.Dynamic.literal(animationName = animationName.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSKeyframesRule]
  }
  
  extension [Self <: CSSKeyframesRule](x: Self) {
    
    inline def setAnimationName(value: Value): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
    
    inline def setKeyframes(value: js.Array[CSSKeyframeRule]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
    
    inline def setKeyframesVarargs(value: CSSKeyframeRule*): Self = StObject.set(x, "keyframes", js.Array(value :_*))
  }
}
