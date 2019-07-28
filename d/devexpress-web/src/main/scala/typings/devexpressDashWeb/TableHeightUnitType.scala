package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableHeightUnitType extends js.Object

@JSGlobal("TableHeightUnitType")
@js.native
object TableHeightUnitType extends js.Object {
  @js.native
  sealed trait Auto extends TableHeightUnitType
  
  @js.native
  sealed trait Exact extends TableHeightUnitType
  
  @js.native
  sealed trait Minimum extends TableHeightUnitType
  
  /* 1 */ val Auto: typings.devexpressDashWeb.TableHeightUnitType.Auto with Double = js.native
  /* 2 */ val Exact: typings.devexpressDashWeb.TableHeightUnitType.Exact with Double = js.native
  /* 0 */ val Minimum: typings.devexpressDashWeb.TableHeightUnitType.Minimum with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TableHeightUnitType with Double] = js.native
}

