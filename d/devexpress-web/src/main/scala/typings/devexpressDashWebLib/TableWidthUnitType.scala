package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableWidthUnitType extends js.Object

@JSGlobal("TableWidthUnitType")
@js.native
object TableWidthUnitType extends js.Object {
  @js.native
  sealed trait Auto
    extends devexpressDashWebLib.TableWidthUnitType
  
  @js.native
  sealed trait FiftiethsOfPercent
    extends devexpressDashWebLib.TableWidthUnitType
  
  @js.native
  sealed trait ModelUnits
    extends devexpressDashWebLib.TableWidthUnitType
  
  @js.native
  sealed trait Nil
    extends devexpressDashWebLib.TableWidthUnitType
  
  /* 1 */ val Auto: Auto with scala.Double = js.native
  /* 2 */ val FiftiethsOfPercent: FiftiethsOfPercent with scala.Double = js.native
  /* 3 */ val ModelUnits: ModelUnits with scala.Double = js.native
  /* 0 */ val Nil: Nil with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.TableWidthUnitType with scala.Double] = js.native
}

