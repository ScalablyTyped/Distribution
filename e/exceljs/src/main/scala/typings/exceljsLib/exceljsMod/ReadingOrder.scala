package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadingOrder extends js.Object

@JSImport("exceljs", "ReadingOrder")
@js.native
object ReadingOrder extends js.Object {
  @js.native
  sealed trait LeftToRight
    extends exceljsLib.exceljsMod.ReadingOrder
  
  @js.native
  sealed trait RightToLeft
    extends exceljsLib.exceljsMod.ReadingOrder
  
  /* 1 */ val LeftToRight: LeftToRight with scala.Double = js.native
  /* 2 */ val RightToLeft: RightToLeft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[exceljsLib.exceljsMod.ReadingOrder with scala.Double] = js.native
}

