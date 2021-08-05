package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorSegment extends StObject {
  
  val end: Double
  
  val start: Double
  
  // Defaults to { x: 0, y: 0 }
  val tangentEnd: js.UndefOr[Vector] = js.undefined
  
  val tangentStart: js.UndefOr[Vector] = js.undefined
}
object VectorSegment {
  
  inline def apply(end: Double, start: Double): VectorSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorSegment]
  }
  
  extension [Self <: VectorSegment](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTangentEnd(value: Vector): Self = StObject.set(x, "tangentEnd", value.asInstanceOf[js.Any])
    
    inline def setTangentEndUndefined: Self = StObject.set(x, "tangentEnd", js.undefined)
    
    inline def setTangentStart(value: Vector): Self = StObject.set(x, "tangentStart", value.asInstanceOf[js.Any])
    
    inline def setTangentStartUndefined: Self = StObject.set(x, "tangentStart", js.undefined)
  }
}
