package typings.ejDotWebDotAll.ej.datavisualization.Sunburst

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstLegendShape.Circle
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstLegendShape.Cross
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstLegendShape.Diamond
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstLegendShape.Pentagon
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstLegendShape.Rectangle
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstLegendShape.Triangle
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstLegendShape with Double] = js.native
  /* 3 */ @js.native
  object Circle extends TopLevel[Circle with Double]
  
  /* 4 */ @js.native
  object Cross extends TopLevel[Cross with Double]
  
  /* 0 */ @js.native
  object Diamond extends TopLevel[Diamond with Double]
  
  /* 1 */ @js.native
  object Pentagon extends TopLevel[Pentagon with Double]
  
  /* 2 */ @js.native
  object Rectangle extends TopLevel[Rectangle with Double]
  
  /* 5 */ @js.native
  object Triangle extends TopLevel[Triangle with Double]
  
}

