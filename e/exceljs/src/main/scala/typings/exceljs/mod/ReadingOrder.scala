package typings.exceljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadingOrder extends js.Object
@JSImport("exceljs", "ReadingOrder")
@js.native
object ReadingOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadingOrder with Double] = js.native
  
  @js.native
  sealed trait LeftToRight extends ReadingOrder
  /* 1 */ @js.native
  object LeftToRight extends TopLevel[LeftToRight with Double]
  
  @js.native
  sealed trait RightToLeft extends ReadingOrder
  /* 2 */ @js.native
  object RightToLeft extends TopLevel[RightToLeft with Double]
}
