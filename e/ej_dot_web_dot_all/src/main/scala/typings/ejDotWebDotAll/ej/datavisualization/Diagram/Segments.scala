package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Segments extends js.Object

@JSGlobal("ej.datavisualization.Diagram.Segments")
@js.native
object Segments extends js.Object {
  //Used to specify the lines as Bezier
  @js.native
  sealed trait Bezier extends Segments
  
  //Used to specify the lines as Orthogonal
  @js.native
  sealed trait Orthogonal extends Segments
  
  //Used to specify the lines as Straight
  @js.native
  sealed trait Straight extends Segments
  
  /* 2 */ val Bezier: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Segments.Bezier with Double = js.native
  /* 1 */ val Orthogonal: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Segments.Orthogonal with Double = js.native
  /* 0 */ val Straight: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Segments.Straight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Segments with Double] = js.native
}

