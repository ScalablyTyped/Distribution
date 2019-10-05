package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.datavisualization.Chart.SelectionType")
@js.native
object SelectionType extends js.Object {
  //string
  @js.native
  sealed trait Multiple extends SelectionType
  
  //string
  @js.native
  sealed trait Single extends SelectionType
  
  /* 1 */ val Multiple: typings.ejDotWebDotAll.ej.datavisualization.Chart.SelectionType.Multiple with Double = js.native
  /* 0 */ val Single: typings.ejDotWebDotAll.ej.datavisualization.Chart.SelectionType.Single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
}

