package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs

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
  sealed trait Bold
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle
  
  //string
  @js.native
  sealed trait Italic
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle
  
  //string
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle
  
  //string
  @js.native
  sealed trait Strikeout
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle
  
  //string
  @js.native
  sealed trait Underline
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle
  
  /* 1 */ val Bold: Bold with scala.Double = js.native
  /* 2 */ val Italic: Italic with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 4 */ val Strikeout: Strikeout with scala.Double = js.native
  /* 3 */ val Underline: Underline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle with scala.Double
  ] = js.native
}

