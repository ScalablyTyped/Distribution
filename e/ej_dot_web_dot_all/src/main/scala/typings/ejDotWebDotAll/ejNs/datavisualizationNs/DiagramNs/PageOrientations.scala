package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Landscape extends PageOrientations
  
  //Used to set orientation as portrait
  @js.native
  sealed trait Portrait extends PageOrientations
  
  /* 0 */ val Landscape: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.PageOrientations.Landscape with Double = js.native
  /* 1 */ val Portrait: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.PageOrientations.Portrait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageOrientations with Double] = js.native
}

