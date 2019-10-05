package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

@JSGlobal("ej.datavisualization.Map.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  //specifies the default position
  @js.native
  sealed trait Default extends SelectionMode
  
  //specifies the multiple position
  @js.native
  sealed trait Multiple extends SelectionMode
  
  /* 0 */ val Default: typings.ejDotWebDotAll.ej.datavisualization.Map.SelectionMode.Default with Double = js.native
  /* 1 */ val Multiple: typings.ejDotWebDotAll.ej.datavisualization.Map.SelectionMode.Multiple with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionMode with Double] = js.native
}

