package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverflowType extends js.Object

@JSGlobal("ej.datavisualization.Diagram.OverflowType")
@js.native
object OverflowType extends js.Object {
  //Set overflow Type  as Clip
  @js.native
  sealed trait Clip extends OverflowType
  
  //Set overflow Type as ellipsis
  @js.native
  sealed trait Ellipsis extends OverflowType
  
  /* 1 */ val Clip: typings.ejDotWebDotAll.ej.datavisualization.Diagram.OverflowType.Clip with Double = js.native
  /* 0 */ val Ellipsis: typings.ejDotWebDotAll.ej.datavisualization.Diagram.OverflowType.Ellipsis with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverflowType with Double] = js.native
}

