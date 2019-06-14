package typings
package ejDotWebDotAllLib.ejNs.GridNs

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
  sealed trait Average
    extends ejDotWebDotAllLib.ejNs.GridNs.SummaryType
  
  ///Summary type is count.
  @js.native
  sealed trait Count
    extends ejDotWebDotAllLib.ejNs.GridNs.SummaryType
  
  ///Summary type is custom.
  @js.native
  sealed trait Custom
    extends ejDotWebDotAllLib.ejNs.GridNs.SummaryType
  
  ///Summary type is false count.
  @js.native
  sealed trait FalseCount
    extends ejDotWebDotAllLib.ejNs.GridNs.SummaryType
  
  ///Summary type is maximum.
  @js.native
  sealed trait Maximum
    extends ejDotWebDotAllLib.ejNs.GridNs.SummaryType
  
  ///Summary type is minimum.
  @js.native
  sealed trait Minimum
    extends ejDotWebDotAllLib.ejNs.GridNs.SummaryType
  
  ///Summary type is sum.
  @js.native
  sealed trait Sum
    extends ejDotWebDotAllLib.ejNs.GridNs.SummaryType
  
  ///Summary type is true count.
  @js.native
  sealed trait TrueCount
    extends ejDotWebDotAllLib.ejNs.GridNs.SummaryType
  
  /* 0 */ val Average: Average with scala.Double = js.native
  /* 3 */ val Count: Count with scala.Double = js.native
  /* 5 */ val Custom: Custom with scala.Double = js.native
  /* 7 */ val FalseCount: FalseCount with scala.Double = js.native
  /* 2 */ val Maximum: Maximum with scala.Double = js.native
  /* 1 */ val Minimum: Minimum with scala.Double = js.native
  /* 4 */ val Sum: Sum with scala.Double = js.native
  /* 6 */ val TrueCount: TrueCount with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.SummaryType with scala.Double] = js.native
}

