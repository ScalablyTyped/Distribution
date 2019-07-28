package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("ej.datavisualization.Map.Mode")
@js.native
object Mode extends js.Object {
  //specifies the default mode
  @js.native
  sealed trait Default extends Mode
  
  //specifies the interactive mode
  @js.native
  sealed trait Interactive extends Mode
  
  /* 0 */ val Default: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.Mode.Default with Double = js.native
  /* 1 */ val Interactive: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.Mode.Interactive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Mode with Double] = js.native
}

