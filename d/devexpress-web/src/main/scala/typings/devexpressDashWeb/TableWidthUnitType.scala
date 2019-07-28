package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableWidthUnitType extends js.Object

@JSGlobal("TableWidthUnitType")
@js.native
object TableWidthUnitType extends js.Object {
  @js.native
  sealed trait Auto extends TableWidthUnitType
  
  @js.native
  sealed trait FiftiethsOfPercent extends TableWidthUnitType
  
  @js.native
  sealed trait ModelUnits extends TableWidthUnitType
  
  @js.native
  sealed trait Nil extends TableWidthUnitType
  
  /* 1 */ val Auto: typings.devexpressDashWeb.TableWidthUnitType.Auto with Double = js.native
  /* 2 */ val FiftiethsOfPercent: typings.devexpressDashWeb.TableWidthUnitType.FiftiethsOfPercent with Double = js.native
  /* 3 */ val ModelUnits: typings.devexpressDashWeb.TableWidthUnitType.ModelUnits with Double = js.native
  /* 0 */ val Nil: typings.devexpressDashWeb.TableWidthUnitType.Nil with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TableWidthUnitType with Double] = js.native
}

