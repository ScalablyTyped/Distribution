package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof framer-motion.framer-motion/dist/dom-entry.SVGPathProperties ]:? framer-motion.framer-motion/dist/dom-entry.ValueKeyframesDefinition} */
trait SVGPathKeyframesDefinition extends StObject {
  
  var pathLength: js.UndefOr[ValueKeyframesDefinition] = js.undefined
  
  var pathOffset: js.UndefOr[ValueKeyframesDefinition] = js.undefined
  
  var pathSpacing: js.UndefOr[ValueKeyframesDefinition] = js.undefined
}
object SVGPathKeyframesDefinition {
  
  inline def apply(): SVGPathKeyframesDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPathKeyframesDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathKeyframesDefinition] (val x: Self) extends AnyVal {
    
    inline def setPathLength(value: ValueKeyframesDefinition): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    inline def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
    
    inline def setPathLengthVarargs(value: (UnresolvedValueKeyframe | ValueKeyframe)*): Self = StObject.set(x, "pathLength", js.Array(value*))
    
    inline def setPathOffset(value: ValueKeyframesDefinition): Self = StObject.set(x, "pathOffset", value.asInstanceOf[js.Any])
    
    inline def setPathOffsetUndefined: Self = StObject.set(x, "pathOffset", js.undefined)
    
    inline def setPathOffsetVarargs(value: (UnresolvedValueKeyframe | ValueKeyframe)*): Self = StObject.set(x, "pathOffset", js.Array(value*))
    
    inline def setPathSpacing(value: ValueKeyframesDefinition): Self = StObject.set(x, "pathSpacing", value.asInstanceOf[js.Any])
    
    inline def setPathSpacingUndefined: Self = StObject.set(x, "pathSpacing", js.undefined)
    
    inline def setPathSpacingVarargs(value: (UnresolvedValueKeyframe | ValueKeyframe)*): Self = StObject.set(x, "pathSpacing", js.Array(value*))
  }
}
