package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageOrientations extends js.Object

@JSGlobal("ej.datavisualization.Diagram.PageOrientations")
@js.native
object PageOrientations extends js.Object {
  //Used to set orientation as Landscape
  @js.native
  sealed trait Landscape
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PageOrientations
  
  //Used to set orientation as portrait
  @js.native
  sealed trait Portrait
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PageOrientations
  
  /* 0 */ val Landscape: Landscape with scala.Double = js.native
  /* 1 */ val Portrait: Portrait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PageOrientations with scala.Double
  ] = js.native
}

