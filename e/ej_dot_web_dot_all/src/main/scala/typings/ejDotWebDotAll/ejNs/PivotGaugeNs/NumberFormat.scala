package typings.ejDotWebDotAll.ejNs.PivotGaugeNs

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
  sealed trait Currency extends NumberFormat
  
  ///To set default format for label values.
  @js.native
  sealed trait Default extends NumberFormat
  
  ///To set fraction format for label values.
  @js.native
  sealed trait Fraction extends NumberFormat
  
  ///To set notation format for label values.
  @js.native
  sealed trait Notation extends NumberFormat
  
  ///To set percentage format for label values.
  @js.native
  sealed trait Percentage extends NumberFormat
  
  ///To set scientific format for label values.
  @js.native
  sealed trait Scientific extends NumberFormat
  
  ///To set text format for label values.
  @js.native
  sealed trait Text extends NumberFormat
  
  /* 1 */ val Currency: typings.ejDotWebDotAll.ejNs.PivotGaugeNs.NumberFormat.Currency with Double = js.native
  /* 0 */ val Default: typings.ejDotWebDotAll.ejNs.PivotGaugeNs.NumberFormat.Default with Double = js.native
  /* 3 */ val Fraction: typings.ejDotWebDotAll.ejNs.PivotGaugeNs.NumberFormat.Fraction with Double = js.native
  /* 6 */ val Notation: typings.ejDotWebDotAll.ejNs.PivotGaugeNs.NumberFormat.Notation with Double = js.native
  /* 2 */ val Percentage: typings.ejDotWebDotAll.ejNs.PivotGaugeNs.NumberFormat.Percentage with Double = js.native
  /* 4 */ val Scientific: typings.ejDotWebDotAll.ejNs.PivotGaugeNs.NumberFormat.Scientific with Double = js.native
  /* 5 */ val Text: typings.ejDotWebDotAll.ejNs.PivotGaugeNs.NumberFormat.Text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumberFormat with Double] = js.native
}

