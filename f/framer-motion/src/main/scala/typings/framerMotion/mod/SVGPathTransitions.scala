package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof framer-motion.framer-motion.SVGPathProperties ]: framer-motion.framer-motion.Transition} */
trait SVGPathTransitions extends StObject {
  
  var pathLength: js.UndefOr[Transition1] = js.undefined
  
  var pathOffset: js.UndefOr[Transition1] = js.undefined
  
  var pathSpacing: js.UndefOr[Transition1] = js.undefined
}
object SVGPathTransitions {
  
  inline def apply(): SVGPathTransitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPathTransitions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathTransitions] (val x: Self) extends AnyVal {
    
    inline def setPathLength(value: Transition1): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    inline def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
    
    inline def setPathOffset(value: Transition1): Self = StObject.set(x, "pathOffset", value.asInstanceOf[js.Any])
    
    inline def setPathOffsetUndefined: Self = StObject.set(x, "pathOffset", js.undefined)
    
    inline def setPathSpacing(value: Transition1): Self = StObject.set(x, "pathSpacing", value.asInstanceOf[js.Any])
    
    inline def setPathSpacingUndefined: Self = StObject.set(x, "pathSpacing", js.undefined)
  }
}
