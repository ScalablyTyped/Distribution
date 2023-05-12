package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisScrollInfo extends StObject {
  
  var containerLength: Double
  
  var current: Double
  
  var interpolate: js.UndefOr[EasingFunction] = js.undefined
  
  var interpolatorOffsets: js.UndefOr[js.Array[Double]] = js.undefined
  
  var offset: js.Array[Double]
  
  var progress: Double
  
  var scrollLength: Double
  
  var targetLength: Double
  
  var targetOffset: Double
  
  var velocity: Double
}
object AxisScrollInfo {
  
  inline def apply(
    containerLength: Double,
    current: Double,
    offset: js.Array[Double],
    progress: Double,
    scrollLength: Double,
    targetLength: Double,
    targetOffset: Double,
    velocity: Double
  ): AxisScrollInfo = {
    val __obj = js.Dynamic.literal(containerLength = containerLength.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], scrollLength = scrollLength.asInstanceOf[js.Any], targetLength = targetLength.asInstanceOf[js.Any], targetOffset = targetOffset.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisScrollInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisScrollInfo] (val x: Self) extends AnyVal {
    
    inline def setContainerLength(value: Double): Self = StObject.set(x, "containerLength", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: /* v */ Double => Double): Self = StObject.set(x, "interpolate", js.Any.fromFunction1(value))
    
    inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    inline def setInterpolatorOffsets(value: js.Array[Double]): Self = StObject.set(x, "interpolatorOffsets", value.asInstanceOf[js.Any])
    
    inline def setInterpolatorOffsetsUndefined: Self = StObject.set(x, "interpolatorOffsets", js.undefined)
    
    inline def setInterpolatorOffsetsVarargs(value: Double*): Self = StObject.set(x, "interpolatorOffsets", js.Array(value*))
    
    inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setScrollLength(value: Double): Self = StObject.set(x, "scrollLength", value.asInstanceOf[js.Any])
    
    inline def setTargetLength(value: Double): Self = StObject.set(x, "targetLength", value.asInstanceOf[js.Any])
    
    inline def setTargetOffset(value: Double): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
