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
  
  val Average: Average with java.lang.String = js.native
  val Count: Count with java.lang.String = js.native
  val Custom: Custom with java.lang.String = js.native
  val FalseCount: FalseCount with java.lang.String = js.native
  val Maximum: Maximum with java.lang.String = js.native
  val Minimum: Minimum with java.lang.String = js.native
  val Sum: Sum with java.lang.String = js.native
  val TrueCount: TrueCount with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.SummaryType with java.lang.String] = js.native
}

