package typings.ejDotWebDotAll.ej.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLegendPosition extends js.Object

@JSGlobal("ej.Sunburst.SunburstLegendPosition")
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
  
  /* 3 */ val Bottom: typings.ejDotWebDotAll.ej.Sunburst.SunburstLegendPosition.Bottom with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ej.Sunburst.SunburstLegendPosition.Left with Double = js.native
  /* 1 */ val Right: typings.ejDotWebDotAll.ej.Sunburst.SunburstLegendPosition.Right with Double = js.native
  /* 2 */ val Top: typings.ejDotWebDotAll.ej.Sunburst.SunburstLegendPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstLegendPosition with Double] = js.native
}

