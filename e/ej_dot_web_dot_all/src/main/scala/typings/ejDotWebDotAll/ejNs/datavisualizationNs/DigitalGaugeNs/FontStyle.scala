package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("ej.datavisualization.DigitalGauge.FontStyle")
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
  sealed trait Normal extends FontStyle
  
  //string
  @js.native
  sealed trait Strikeout extends FontStyle
  
  //string
  @js.native
  sealed trait Underline extends FontStyle
  
  /* 1 */ val Bold: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle.Bold with Double = js.native
  /* 2 */ val Italic: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle.Italic with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle.Normal with Double = js.native
  /* 4 */ val Strikeout: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle.Strikeout with Double = js.native
  /* 3 */ val Underline: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle.Underline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
}

