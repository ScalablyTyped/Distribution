package typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLabelRotationMode extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstLabelRotationMode")
@js.native
object SunburstLabelRotationMode extends js.Object {
  //string
  @js.native
  sealed trait Angle extends SunburstLabelRotationMode
  
  //string
  @js.native
  sealed trait Normal extends SunburstLabelRotationMode
  
  /* 0 */ val Angle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLabelRotationMode.Angle with Double = js.native
  /* 1 */ val Normal: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLabelRotationMode.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstLabelRotationMode with Double] = js.native
}

