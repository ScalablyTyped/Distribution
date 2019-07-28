package typings.ejDotWebDotAll.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHighlightMode extends js.Object

@JSGlobal("ej.Sunburst.SunburstHighlightMode")
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
  
  /* 3 */ val All: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstHighlightMode.All with Double = js.native
  /* 2 */ val Child: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstHighlightMode.Child with Double = js.native
  /* 1 */ val Parent: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstHighlightMode.Parent with Double = js.native
  /* 0 */ val Point: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstHighlightMode.Point with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstHighlightMode with Double] = js.native
}

