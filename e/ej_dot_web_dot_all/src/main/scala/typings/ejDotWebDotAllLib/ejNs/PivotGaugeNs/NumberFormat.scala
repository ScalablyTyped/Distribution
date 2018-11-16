package typings
package ejDotWebDotAllLib.ejNs.PivotGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NumberFormat extends js.Object

@JSGlobal("ej.PivotGauge.NumberFormat")
@js.native
object NumberFormat extends js.Object {
  ///To set currency format for label values.
  @js.native
  sealed trait Currency
    extends ejDotWebDotAllLib.ejNs.PivotGaugeNs.NumberFormat
  
  ///To set default format for label values.
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.PivotGaugeNs.NumberFormat
  
  ///To set fraction format for label values.
  @js.native
  sealed trait Fraction
    extends ejDotWebDotAllLib.ejNs.PivotGaugeNs.NumberFormat
  
  ///To set notation format for label values.
  @js.native
  sealed trait Notation
    extends ejDotWebDotAllLib.ejNs.PivotGaugeNs.NumberFormat
  
  ///To set percentage format for label values.
  @js.native
  sealed trait Percentage
    extends ejDotWebDotAllLib.ejNs.PivotGaugeNs.NumberFormat
  
  ///To set scientific format for label values.
  @js.native
  sealed trait Scientific
    extends ejDotWebDotAllLib.ejNs.PivotGaugeNs.NumberFormat
  
  ///To set text format for label values.
  @js.native
  sealed trait Text
    extends ejDotWebDotAllLib.ejNs.PivotGaugeNs.NumberFormat
  
  val Currency: Currency with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val Fraction: Fraction with java.lang.String = js.native
  val Notation: Notation with java.lang.String = js.native
  val Percentage: Percentage with java.lang.String = js.native
  val Scientific: Scientific with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotGaugeNs.NumberFormat with java.lang.String] = js.native
}

