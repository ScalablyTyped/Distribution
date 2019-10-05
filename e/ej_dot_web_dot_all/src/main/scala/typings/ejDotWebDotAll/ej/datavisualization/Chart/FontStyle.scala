package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("ej.datavisualization.Chart.FontStyle")
@js.native
object FontStyle extends js.Object {
  //string
  @js.native
  sealed trait Italic extends FontStyle
  
  //string
  @js.native
  sealed trait Normal extends FontStyle
  
  /* 1 */ val Italic: typings.ejDotWebDotAll.ej.datavisualization.Chart.FontStyle.Italic with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ej.datavisualization.Chart.FontStyle.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
}

