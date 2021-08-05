package typings.egjsAxes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.egjsAxes.axisManagerMod.Axis
import typings.egjsAxes.constMod.DIRECTION
import typings.egjsAxes.panInputMod.PanInput
import typings.egjsAxes.panInputMod.PanInputOption
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DestPos extends StObject {
    
    var destPos: Axis
    
    var duration: Double
  }
  object DestPos {
    
    inline def apply(destPos: Axis, duration: Double): DestPos = {
      val __obj = js.Dynamic.literal(destPos = destPos.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestPos]
    }
    
    extension [Self <: DestPos](x: Self) {
      
      inline def setDestPos(value: Axis): Self = StObject.set(x, "destPos", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofPanInput
    extends StObject
       with Instantiable1[(/* el */ HTMLElement) | (/* el */ String), PanInput]
       with Instantiable2[(/* el */ HTMLElement) | (/* el */ String), /* options */ PanInputOption, PanInput] {
    
    def getDirectionByAngle(angle: Double, thresholdAngle: Double): DIRECTION = js.native
    
    def getNextOffset(speeds: js.Array[Double], deceleration: Double): js.Array[Double] = js.native
    
    def useDirection(checkType: DIRECTION, direction: DIRECTION): Boolean = js.native
    def useDirection(checkType: DIRECTION, direction: DIRECTION, userDirection: DIRECTION): Boolean = js.native
  }
}
