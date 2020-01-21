package typings.ejWebAll.ej.datavisualization.Sunburst

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLegendPosition extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstLegendPosition")
@js.native
object SunburstLegendPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends SunburstLegendPosition
  
  //string
  @js.native
  sealed trait Left extends SunburstLegendPosition
  
  //string
  @js.native
  sealed trait Right extends SunburstLegendPosition
  
  //string
  @js.native
  sealed trait Top extends SunburstLegendPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstLegendPosition with Double] = js.native
  /* 3 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
  
  /* 2 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

