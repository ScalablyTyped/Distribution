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
  
  /* 1 */ val Currency: Currency with scala.Double = js.native
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 3 */ val Fraction: Fraction with scala.Double = js.native
  /* 6 */ val Notation: Notation with scala.Double = js.native
  /* 2 */ val Percentage: Percentage with scala.Double = js.native
  /* 4 */ val Scientific: Scientific with scala.Double = js.native
  /* 5 */ val Text: Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotGaugeNs.NumberFormat with scala.Double] = js.native
}

