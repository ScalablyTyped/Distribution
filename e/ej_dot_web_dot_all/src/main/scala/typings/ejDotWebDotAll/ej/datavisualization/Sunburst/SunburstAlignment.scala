package typings.ejDotWebDotAll.ej.datavisualization.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstAlignment extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstAlignment")
@js.native
object SunburstAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends SunburstAlignment
  
  //string
  @js.native
  sealed trait Far extends SunburstAlignment
  
  //string
  @js.native
  sealed trait Near extends SunburstAlignment
  
  /* 0 */ val Center: typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstAlignment.Center with Double = js.native
  /* 2 */ val Far: typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstAlignment.Far with Double = js.native
  /* 1 */ val Near: typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstAlignment.Near with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstAlignment with Double] = js.native
}

