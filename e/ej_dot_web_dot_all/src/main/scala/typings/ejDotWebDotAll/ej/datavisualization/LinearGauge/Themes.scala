package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Themes extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.Themes")
@js.native
object Themes extends js.Object {
  //string
  @js.native
  sealed trait FlatDark extends Themes
  
  //string
  @js.native
  sealed trait FlatLight extends Themes
  
  /* 1 */ val FlatDark: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.Themes.FlatDark with Double = js.native
  /* 0 */ val FlatLight: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.Themes.FlatLight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Themes with Double] = js.native
}

