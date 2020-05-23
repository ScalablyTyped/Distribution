package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

