package typings.forceDashGraph.forceDashGraphMod.ForceGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkCurvatureType extends js.Object

/**
  * Enums
  */
@JSImport("force-graph", "ForceGraph.LinkCurvatureType")
@js.native
object LinkCurvatureType extends js.Object {
  @js.native
  sealed trait HalfLineLength extends LinkCurvatureType
  
  @js.native
  sealed trait Straight extends LinkCurvatureType
  
}

