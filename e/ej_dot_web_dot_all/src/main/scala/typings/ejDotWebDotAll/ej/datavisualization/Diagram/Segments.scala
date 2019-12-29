package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Segments with Double] = js.native
  /* 2 */ @js.native
  object Bezier extends TopLevel[Bezier with Double]
  
  /* 1 */ @js.native
  object Orthogonal extends TopLevel[Orthogonal with Double]
  
  /* 0 */ @js.native
  object Straight extends TopLevel[Straight with Double]
  
}

