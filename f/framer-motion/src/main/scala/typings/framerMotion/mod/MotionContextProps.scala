package typings.framerMotion.mod

import typings.framerMotion.framerMotionBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionContextProps[Instance] extends StObject {
  
  var animate: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var initial: js.UndefOr[`false` | String | js.Array[String]] = js.undefined
  
  var visualElement: js.UndefOr[VisualElement[Instance, Any, js.Object]] = js.undefined
}
object MotionContextProps {
  
  inline def apply[Instance](): MotionContextProps[Instance] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionContextProps[Instance]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionContextProps[?], Instance] (val x: Self & MotionContextProps[Instance]) extends AnyVal {
    
    inline def setAnimate(value: String | js.Array[String]): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnimateVarargs(value: String*): Self = StObject.set(x, "animate", js.Array(value*))
    
    inline def setInitial(value: `false` | String | js.Array[String]): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setInitialVarargs(value: String*): Self = StObject.set(x, "initial", js.Array(value*))
    
    inline def setVisualElement(value: VisualElement[Instance, Any, js.Object]): Self = StObject.set(x, "visualElement", value.asInstanceOf[js.Any])
    
    inline def setVisualElementUndefined: Self = StObject.set(x, "visualElement", js.undefined)
  }
}
