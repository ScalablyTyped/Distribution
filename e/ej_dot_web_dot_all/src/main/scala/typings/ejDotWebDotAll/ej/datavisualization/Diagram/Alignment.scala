package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.Alignment")
@js.native
object Alignment extends js.Object {
  //Used to align the label either bottom or right(after) of the connector segment
  @js.native
  sealed trait After extends Alignment
  
  //Used to align the label either top or left(before) of the connector segment
  @js.native
  sealed trait Before extends Alignment
  
  //Used to align the label at center of the connector segment
  @js.native
  sealed trait Center extends Alignment
  
  /* 2 */ val After: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Alignment.After with Double = js.native
  /* 0 */ val Before: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Alignment.Before with Double = js.native
  /* 1 */ val Center: typings.ejDotWebDotAll.ej.datavisualization.Diagram.Alignment.Center with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Alignment with Double] = js.native
}

