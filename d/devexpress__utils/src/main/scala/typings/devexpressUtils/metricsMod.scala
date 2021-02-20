package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricsMod {
  
  @JSImport("@devexpress/utils/lib/geometry/metrics", "Metrics")
  @js.native
  class Metrics () extends StObject
  /* static members */
  object Metrics {
    
    @JSImport("@devexpress/utils/lib/geometry/metrics", "Metrics.euclideanDistance")
    @js.native
    def euclideanDistance(a: IPoint, b: IPoint): Double = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/metrics", "Metrics.manhattanDistance")
    @js.native
    def manhattanDistance(a: IPoint, b: IPoint): Double = js.native
  }
}
