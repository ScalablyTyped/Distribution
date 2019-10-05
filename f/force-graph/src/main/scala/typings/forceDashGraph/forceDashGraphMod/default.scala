package typings.forceDashGraph.forceDashGraphMod

import typings.forceDashGraph.forceDashGraphMod.ForceGraph.ForceGraphInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("force-graph", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(): ForceGraphInstance = js.native
  /**
    * Enums
    */
  @js.native
  object LinkCurvatureType extends js.Object {
    /* 1 */ val HalfLineLength: typings.forceDashGraph.forceDashGraphMod.ForceGraph.LinkCurvatureType.HalfLineLength with Double = js.native
    /* 0 */ val Straight: typings.forceDashGraph.forceDashGraphMod.ForceGraph.LinkCurvatureType.Straight with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.forceDashGraph.forceDashGraphMod.ForceGraph.LinkCurvatureType with Double
      ] = js.native
  }
  
}

