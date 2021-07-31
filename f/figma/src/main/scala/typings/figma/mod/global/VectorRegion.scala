package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorRegion extends StObject {
  
  val loops: js.Array[js.Array[Double]]
  
  val windingRule: WindingRule
}
object VectorRegion {
  
  @scala.inline
  def apply(loops: js.Array[js.Array[Double]], windingRule: WindingRule): VectorRegion = {
    val __obj = js.Dynamic.literal(loops = loops.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorRegion]
  }
  
  @scala.inline
  implicit class VectorRegionMutableBuilder[Self <: VectorRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoops(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "loops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "loops", js.Array(value :_*))
    
    @scala.inline
    def setWindingRule(value: WindingRule): Self = StObject.set(x, "windingRule", value.asInstanceOf[js.Any])
  }
}
