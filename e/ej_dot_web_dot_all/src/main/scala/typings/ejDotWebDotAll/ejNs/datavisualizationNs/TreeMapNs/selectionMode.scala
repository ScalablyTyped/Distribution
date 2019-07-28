package typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait selectionMode extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.selectionMode")
@js.native
object selectionMode extends js.Object {
  //specifies the default mode
  @js.native
  sealed trait Default extends selectionMode
  
  //specifies the multiple mode
  @js.native
  sealed trait Multiple extends selectionMode
  
  /* 0 */ val Default: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.selectionMode.Default with Double = js.native
  /* 1 */ val Multiple: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.selectionMode.Multiple with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[selectionMode with Double] = js.native
}

