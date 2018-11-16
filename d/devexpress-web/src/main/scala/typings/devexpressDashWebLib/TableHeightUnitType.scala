package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableHeightUnitType extends js.Object

@JSGlobal("TableHeightUnitType")
@js.native
object TableHeightUnitType extends js.Object {
  @js.native
  sealed trait Auto
    extends devexpressDashWebLib.TableHeightUnitType
  
  @js.native
  sealed trait Exact
    extends devexpressDashWebLib.TableHeightUnitType
  
  @js.native
  sealed trait Minimum
    extends devexpressDashWebLib.TableHeightUnitType
  
  /* 1 */ val Auto: Auto with scala.Double = js.native
  /* 2 */ val Exact: Exact with scala.Double = js.native
  /* 0 */ val Minimum: Minimum with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.TableHeightUnitType with scala.Double] = js.native
}

