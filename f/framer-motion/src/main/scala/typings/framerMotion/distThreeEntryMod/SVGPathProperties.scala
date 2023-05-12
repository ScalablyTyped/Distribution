package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait SVGPathProperties extends StObject {
  
  var pathLength: js.UndefOr[Double] = js.undefined
  
  var pathOffset: js.UndefOr[Double] = js.undefined
  
  var pathSpacing: js.UndefOr[Double] = js.undefined
}
object SVGPathProperties {
  
  inline def apply(): SVGPathProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPathProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathProperties] (val x: Self) extends AnyVal {
    
    inline def setPathLength(value: Double): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    inline def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
    
    inline def setPathOffset(value: Double): Self = StObject.set(x, "pathOffset", value.asInstanceOf[js.Any])
    
    inline def setPathOffsetUndefined: Self = StObject.set(x, "pathOffset", js.undefined)
    
    inline def setPathSpacing(value: Double): Self = StObject.set(x, "pathSpacing", value.asInstanceOf[js.Any])
    
    inline def setPathSpacingUndefined: Self = StObject.set(x, "pathSpacing", js.undefined)
  }
}
