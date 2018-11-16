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
  
  val Bold: Bold with java.lang.String = js.native
  val Italic: Italic with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  val Strikeout: Strikeout with java.lang.String = js.native
  val Underline: Underline with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.FontStyle with java.lang.String
  ] = js.native
}

