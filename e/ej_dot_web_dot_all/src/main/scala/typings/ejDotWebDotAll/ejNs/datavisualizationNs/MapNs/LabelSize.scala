package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelSize extends js.Object

@JSGlobal("ej.datavisualization.Map.LabelSize")
@js.native
object LabelSize extends js.Object {
  //specifies the default size
  @js.native
  sealed trait Default extends LabelSize
  
  //specifies the fixed size
  @js.native
  sealed trait Fixed extends LabelSize
  
  /* 1 */ val Default: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.LabelSize.Default with Double = js.native
  /* 0 */ val Fixed: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.LabelSize.Fixed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelSize with Double] = js.native
}

