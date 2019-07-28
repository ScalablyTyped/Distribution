package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.Alignment")
@js.native
object Alignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends Alignment
  
  //string
  @js.native
  sealed trait Far extends Alignment
  
  //string
  @js.native
  sealed trait Near extends Alignment
  
  /* 0 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.Alignment.Center with Double = js.native
  /* 2 */ val Far: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.Alignment.Far with Double = js.native
  /* 1 */ val Near: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.Alignment.Near with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Alignment with Double] = js.native
}

