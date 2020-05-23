package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

