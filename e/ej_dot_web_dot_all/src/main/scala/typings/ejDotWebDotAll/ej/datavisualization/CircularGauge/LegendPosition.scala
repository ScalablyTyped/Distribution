package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendPosition.Bottom
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendPosition.Left
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendPosition.Right
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendPosition.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendPosition extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LegendPosition")
@js.native
object LegendPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends LegendPosition
  
  //string
  @js.native
  sealed trait Left extends LegendPosition
  
  //string
  @js.native
  sealed trait Right extends LegendPosition
  
  //string
  @js.native
  sealed trait Top extends LegendPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendPosition with Double] = js.native
  /* 3 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
  
  /* 2 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

