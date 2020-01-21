package typings.ejWebAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SummaryType with Double] = js.native
  /* 0 */ @js.native
  object Average extends TopLevel[Average with Double]
  
  /* 3 */ @js.native
  object Count extends TopLevel[Count with Double]
  
  /* 5 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 7 */ @js.native
  object FalseCount extends TopLevel[FalseCount with Double]
  
  /* 2 */ @js.native
  object Maximum extends TopLevel[Maximum with Double]
  
  /* 1 */ @js.native
  object Minimum extends TopLevel[Minimum with Double]
  
  /* 4 */ @js.native
  object Sum extends TopLevel[Sum with Double]
  
  /* 6 */ @js.native
  object TrueCount extends TopLevel[TrueCount with Double]
  
}

