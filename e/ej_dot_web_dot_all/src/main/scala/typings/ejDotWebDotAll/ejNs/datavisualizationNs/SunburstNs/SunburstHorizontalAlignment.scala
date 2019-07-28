package typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHorizontalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstHorizontalAlignment")
@js.native
object SunburstHorizontalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends SunburstHorizontalAlignment
  
  //string
  @js.native
  sealed trait Left extends SunburstHorizontalAlignment
  
  //string
  @js.native
  sealed trait Right extends SunburstHorizontalAlignment
  
  /* 0 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstHorizontalAlignment.Center with Double = js.native
  /* 1 */ val Left: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstHorizontalAlignment.Left with Double = js.native
  /* 2 */ val Right: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstHorizontalAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstHorizontalAlignment with Double] = js.native
}

