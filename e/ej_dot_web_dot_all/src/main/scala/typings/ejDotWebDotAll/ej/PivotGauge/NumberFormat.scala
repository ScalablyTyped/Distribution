package typings.ejDotWebDotAll.ej.PivotGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.PivotGauge.NumberFormat.Currency
import typings.ejDotWebDotAll.ej.PivotGauge.NumberFormat.Default
import typings.ejDotWebDotAll.ej.PivotGauge.NumberFormat.Fraction
import typings.ejDotWebDotAll.ej.PivotGauge.NumberFormat.Notation
import typings.ejDotWebDotAll.ej.PivotGauge.NumberFormat.Percentage
import typings.ejDotWebDotAll.ej.PivotGauge.NumberFormat.Scientific
import typings.ejDotWebDotAll.ej.PivotGauge.NumberFormat.Text
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumberFormat with Double] = js.native
  /* 1 */ @js.native
  object Currency extends TopLevel[Currency with Double]
  
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 3 */ @js.native
  object Fraction extends TopLevel[Fraction with Double]
  
  /* 6 */ @js.native
  object Notation extends TopLevel[Notation with Double]
  
  /* 2 */ @js.native
  object Percentage extends TopLevel[Percentage with Double]
  
  /* 4 */ @js.native
  object Scientific extends TopLevel[Scientific with Double]
  
  /* 5 */ @js.native
  object Text extends TopLevel[Text with Double]
  
}

