package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcData extends StObject {
  
  val endingAngle: Double
  
  val innerRadius: Double
  
  val startingAngle: Double
}
object ArcData {
  
  inline def apply(endingAngle: Double, innerRadius: Double, startingAngle: Double): ArcData = {
    val __obj = js.Dynamic.literal(endingAngle = endingAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], startingAngle = startingAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcData] (val x: Self) extends AnyVal {
    
    inline def setEndingAngle(value: Double): Self = StObject.set(x, "endingAngle", value.asInstanceOf[js.Any])
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setStartingAngle(value: Double): Self = StObject.set(x, "startingAngle", value.asInstanceOf[js.Any])
  }
}
