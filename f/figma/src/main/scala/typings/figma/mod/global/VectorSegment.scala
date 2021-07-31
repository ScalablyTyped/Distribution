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
  
  @scala.inline
  def apply(end: Double, start: Double): VectorSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorSegment]
  }
  
  @scala.inline
  implicit class VectorSegmentMutableBuilder[Self <: VectorSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentEnd(value: Vector): Self = StObject.set(x, "tangentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentEndUndefined: Self = StObject.set(x, "tangentEnd", js.undefined)
    
    @scala.inline
    def setTangentStart(value: Vector): Self = StObject.set(x, "tangentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentStartUndefined: Self = StObject.set(x, "tangentStart", js.undefined)
  }
}
