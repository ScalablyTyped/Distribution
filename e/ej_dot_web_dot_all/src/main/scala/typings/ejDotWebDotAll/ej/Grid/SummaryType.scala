package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SummaryType extends js.Object

@JSGlobal("ej.Grid.SummaryType")
@js.native
object SummaryType extends js.Object {
  ///Summary type is average.
  @js.native
  sealed trait Average extends SummaryType
  
  ///Summary type is count.
  @js.native
  sealed trait Count extends SummaryType
  
  ///Summary type is custom.
  @js.native
  sealed trait Custom extends SummaryType
  
  ///Summary type is false count.
  @js.native
  sealed trait FalseCount extends SummaryType
  
  ///Summary type is maximum.
  @js.native
  sealed trait Maximum extends SummaryType
  
  ///Summary type is minimum.
  @js.native
  sealed trait Minimum extends SummaryType
  
  ///Summary type is sum.
  @js.native
  sealed trait Sum extends SummaryType
  
  ///Summary type is true count.
  @js.native
  sealed trait TrueCount extends SummaryType
  
  /* 0 */ val Average: typings.ejDotWebDotAll.ej.Grid.SummaryType.Average with Double = js.native
  /* 3 */ val Count: typings.ejDotWebDotAll.ej.Grid.SummaryType.Count with Double = js.native
  /* 5 */ val Custom: typings.ejDotWebDotAll.ej.Grid.SummaryType.Custom with Double = js.native
  /* 7 */ val FalseCount: typings.ejDotWebDotAll.ej.Grid.SummaryType.FalseCount with Double = js.native
  /* 2 */ val Maximum: typings.ejDotWebDotAll.ej.Grid.SummaryType.Maximum with Double = js.native
  /* 1 */ val Minimum: typings.ejDotWebDotAll.ej.Grid.SummaryType.Minimum with Double = js.native
  /* 4 */ val Sum: typings.ejDotWebDotAll.ej.Grid.SummaryType.Sum with Double = js.native
  /* 6 */ val TrueCount: typings.ejDotWebDotAll.ej.Grid.SummaryType.TrueCount with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SummaryType with Double] = js.native
}

