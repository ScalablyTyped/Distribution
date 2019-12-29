package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendAlignment extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LegendAlignment")
@js.native
object LegendAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends LegendAlignment
  
  //string
  @js.native
  sealed trait Far extends LegendAlignment
  
  //string
  @js.native
  sealed trait Near extends LegendAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendAlignment with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 2 */ @js.native
  object Far extends TopLevel[Far with Double]
  
  /* 1 */ @js.native
  object Near extends TopLevel[Near with Double]
  
}

