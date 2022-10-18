package typings.devexpressUtils

import typings.devexpressUtils.libGeometryInterfacesMod.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryMetricsMod {
  
  @JSImport("@devexpress/utils/lib/geometry/metrics", "Metrics")
  @js.native
  open class Metrics () extends StObject
  /* static members */
  object Metrics {
    
    @JSImport("@devexpress/utils/lib/geometry/metrics", "Metrics")
    @js.native
    val ^ : js.Any = js.native
    
    inline def euclideanDistance(a: IPoint, b: IPoint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("euclideanDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def manhattanDistance(a: IPoint, b: IPoint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("manhattanDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
