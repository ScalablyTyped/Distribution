package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcData extends StObject {
  
  val endingAngle: Double = js.native
  
  val innerRadius: Double = js.native
  
  val startingAngle: Double = js.native
}
object ArcData {
  
  @scala.inline
  def apply(endingAngle: Double, innerRadius: Double, startingAngle: Double): ArcData = {
    val __obj = js.Dynamic.literal(endingAngle = endingAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], startingAngle = startingAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcData]
  }
  
  @scala.inline
  implicit class ArcDataMutableBuilder[Self <: ArcData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndingAngle(value: Double): Self = StObject.set(x, "endingAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingAngle(value: Double): Self = StObject.set(x, "startingAngle", value.asInstanceOf[js.Any])
  }
}
