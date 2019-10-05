package typings.ejDotWebDotAll.ej.datavisualization.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHighlightMode extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstHighlightMode")
@js.native
object SunburstHighlightMode extends js.Object {
  //string
  @js.native
  sealed trait All extends SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Child extends SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Parent extends SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Point extends SunburstHighlightMode
  
  /* 3 */ val All: typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstHighlightMode.All with Double = js.native
  /* 2 */ val Child: typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstHighlightMode.Child with Double = js.native
  /* 1 */ val Parent: typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstHighlightMode.Parent with Double = js.native
  /* 0 */ val Point: typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstHighlightMode.Point with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstHighlightMode with Double] = js.native
}

