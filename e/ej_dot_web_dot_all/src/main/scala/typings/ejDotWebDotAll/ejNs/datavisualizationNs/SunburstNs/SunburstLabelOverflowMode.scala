package typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLabelOverflowMode extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstLabelOverflowMode")
@js.native
object SunburstLabelOverflowMode extends js.Object {
  //string
  @js.native
  sealed trait Hide extends SunburstLabelOverflowMode
  
  //string
  @js.native
  sealed trait None extends SunburstLabelOverflowMode
  
  //string
  @js.native
  sealed trait Trim extends SunburstLabelOverflowMode
  
  /* 1 */ val Hide: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLabelOverflowMode.Hide with Double = js.native
  /* 2 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLabelOverflowMode.None with Double = js.native
  /* 0 */ val Trim: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLabelOverflowMode.Trim with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstLabelOverflowMode with Double] = js.native
}

