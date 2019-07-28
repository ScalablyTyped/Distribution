package typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait groupSelectionMode extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.groupSelectionMode")
@js.native
object groupSelectionMode extends js.Object {
  //specifies the default mode
  @js.native
  sealed trait Default extends groupSelectionMode
  
  //specifies the multiple mode
  @js.native
  sealed trait Multiple extends groupSelectionMode
  
  /* 0 */ val Default: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.groupSelectionMode.Default with Double = js.native
  /* 1 */ val Multiple: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.groupSelectionMode.Multiple with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[groupSelectionMode with Double] = js.native
}

