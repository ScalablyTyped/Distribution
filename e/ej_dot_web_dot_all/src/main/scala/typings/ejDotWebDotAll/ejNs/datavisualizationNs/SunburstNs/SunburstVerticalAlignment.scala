package typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstVerticalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstVerticalAlignment")
@js.native
object SunburstVerticalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends SunburstVerticalAlignment
  
  //string
  @js.native
  sealed trait Middle extends SunburstVerticalAlignment
  
  //string
  @js.native
  sealed trait Top extends SunburstVerticalAlignment
  
  /* 1 */ val Bottom: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstVerticalAlignment.Bottom with Double = js.native
  /* 2 */ val Middle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstVerticalAlignment.Middle with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstVerticalAlignment.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstVerticalAlignment with Double] = js.native
}

