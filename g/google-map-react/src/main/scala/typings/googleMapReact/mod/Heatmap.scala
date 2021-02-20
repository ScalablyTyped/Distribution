package typings.googleMapReact.mod

import typings.googleMapReact.anon.Opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Heatmap extends StObject {
  
  var options: Opacity = js.native
  
  var positions: js.Array[Position] = js.native
}
object Heatmap {
  
  @scala.inline
  def apply(options: Opacity, positions: js.Array[Position]): Heatmap = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heatmap]
  }
  
  @scala.inline
  implicit class HeatmapMutableBuilder[Self <: Heatmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Opacity): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositions(value: js.Array[Position]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: Position*): Self = StObject.set(x, "positions", js.Array(value :_*))
  }
}
