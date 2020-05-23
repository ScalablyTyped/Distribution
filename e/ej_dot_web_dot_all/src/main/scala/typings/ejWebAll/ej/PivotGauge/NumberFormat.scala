package typings.ejWebAll.ej.PivotGauge

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
  
}

