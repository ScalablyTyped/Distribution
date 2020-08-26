package typings.exceljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadingOrder extends js.Object

@JSImport("exceljs", "ReadingOrder")
@js.native
object ReadingOrder extends js.Object {
  @js.native
  sealed trait LeftToRight extends ReadingOrder
  
  @js.native
  sealed trait RightToLeft extends ReadingOrder
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadingOrder with Double] = js.native
  /* 1 */ @js.native
  object LeftToRight extends TopLevel[LeftToRight with Double]
  
  /* 2 */ @js.native
  object RightToLeft extends TopLevel[RightToLeft with Double]
  
}

