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
  
  val Bold: Bold with java.lang.String = js.native
  val Italic: Italic with java.lang.String = js.native
  val Regular: Regular with java.lang.String = js.native
  val Strikeout: Strikeout with java.lang.String = js.native
  val Underline: Underline with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.FontStyle with java.lang.String
  ] = js.native
}

