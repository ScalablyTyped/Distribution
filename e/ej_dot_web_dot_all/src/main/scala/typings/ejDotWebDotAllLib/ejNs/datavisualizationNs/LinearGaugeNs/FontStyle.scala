package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

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
  sealed trait Bold
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle
  
  //string
  @js.native
  sealed trait Italic
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle
  
  //string
  @js.native
  sealed trait Regular
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle
  
  //string
  @js.native
  sealed trait Strikeout
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle
  
  //string
  @js.native
  sealed trait Underline
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle
  
  /* 0 */ val Bold: Bold with scala.Double = js.native
  /* 1 */ val Italic: Italic with scala.Double = js.native
  /* 2 */ val Regular: Regular with scala.Double = js.native
  /* 3 */ val Strikeout: Strikeout with scala.Double = js.native
  /* 4 */ val Underline: Underline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle with scala.Double
  ] = js.native
}

