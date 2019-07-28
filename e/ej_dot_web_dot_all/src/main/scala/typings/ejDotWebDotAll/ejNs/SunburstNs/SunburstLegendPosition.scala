package typings.ejDotWebDotAll.ejNs.SunburstNs

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
  
  /* 3 */ val Bottom: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstLegendPosition.Bottom with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstLegendPosition.Left with Double = js.native
  /* 1 */ val Right: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstLegendPosition.Right with Double = js.native
  /* 2 */ val Top: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstLegendPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstLegendPosition with Double] = js.native
}

