package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/geometry/metrics", JSImport.Namespace)
@js.native
object metricsMod extends js.Object {
  
  @js.native
  class Metrics () extends js.Object
  /* static members */
  @js.native
  object Metrics extends js.Object {
    
    def euclideanDistance(a: IPoint, b: IPoint): Double = js.native
    
    def manhattanDistance(a: IPoint, b: IPoint): Double = js.native
  }
}
