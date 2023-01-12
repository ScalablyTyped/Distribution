package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyframesRule extends StObject {
  
  /**
    * List of animation keyframes.
    */
  var keyframes: js.Array[KeyframeStyle]
  
  /**
    * CSS keyframed animation's name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object KeyframesRule {
  
  inline def apply(keyframes: js.Array[KeyframeStyle]): KeyframesRule = {
    val __obj = js.Dynamic.literal(keyframes = keyframes.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyframesRule] (val x: Self) extends AnyVal {
    
    inline def setKeyframes(value: js.Array[KeyframeStyle]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
    
    inline def setKeyframesVarargs(value: KeyframeStyle*): Self = StObject.set(x, "keyframes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
