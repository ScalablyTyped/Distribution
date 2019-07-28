package typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.FontStyle")
@js.native
object FontStyle extends js.Object {
  //string
  @js.native
  sealed trait Bold extends FontStyle
  
  //string
  @js.native
  sealed trait Italic extends FontStyle
  
  //string
  @js.native
  sealed trait Regular extends FontStyle
  
  //string
  @js.native
  sealed trait Strikeout extends FontStyle
  
  //string
  @js.native
  sealed trait Underline extends FontStyle
  
  /* 0 */ val Bold: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle.Bold with Double = js.native
  /* 1 */ val Italic: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle.Italic with Double = js.native
  /* 2 */ val Regular: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle.Regular with Double = js.native
  /* 3 */ val Strikeout: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle.Strikeout with Double = js.native
  /* 4 */ val Underline: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle.Underline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
}

