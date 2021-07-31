package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadingOrder extends StObject
@JSImport("exceljs", "ReadingOrder")
@js.native
object ReadingOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadingOrder & Double] = js.native
  
  @js.native
  sealed trait LeftToRight
    extends StObject
       with ReadingOrder
  /* 1 */ val LeftToRight: typings.exceljs.mod.ReadingOrder.LeftToRight & Double = js.native
  
  @js.native
  sealed trait RightToLeft
    extends StObject
       with ReadingOrder
  /* 2 */ val RightToLeft: typings.exceljs.mod.ReadingOrder.RightToLeft & Double = js.native
}
