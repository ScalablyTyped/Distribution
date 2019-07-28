package typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLegendShape extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstLegendShape")
@js.native
object SunburstLegendShape extends js.Object {
  //string
  @js.native
  sealed trait Circle extends SunburstLegendShape
  
  //string
  @js.native
  sealed trait Cross extends SunburstLegendShape
  
  //string
  @js.native
  sealed trait Diamond extends SunburstLegendShape
  
  //string
  @js.native
  sealed trait Pentagon extends SunburstLegendShape
  
  //string
  @js.native
  sealed trait Rectangle extends SunburstLegendShape
  
  //string
  @js.native
  sealed trait Triangle extends SunburstLegendShape
  
  /* 3 */ val Circle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLegendShape.Circle with Double = js.native
  /* 4 */ val Cross: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLegendShape.Cross with Double = js.native
  /* 0 */ val Diamond: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLegendShape.Diamond with Double = js.native
  /* 1 */ val Pentagon: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLegendShape.Pentagon with Double = js.native
  /* 2 */ val Rectangle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLegendShape.Rectangle with Double = js.native
  /* 5 */ val Triangle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLegendShape.Triangle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstLegendShape with Double] = js.native
}

