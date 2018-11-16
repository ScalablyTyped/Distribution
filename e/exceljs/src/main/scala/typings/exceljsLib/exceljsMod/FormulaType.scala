package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormulaType extends js.Object

@JSImport("exceljs", "FormulaType")
@js.native
object FormulaType extends js.Object {
  @js.native
  sealed trait Master
    extends exceljsLib.exceljsMod.FormulaType
  
  @js.native
  sealed trait None
    extends exceljsLib.exceljsMod.FormulaType
  
  @js.native
  sealed trait Shared
    extends exceljsLib.exceljsMod.FormulaType
  
  /* 1 */ val Master: Master with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Shared: Shared with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[exceljsLib.exceljsMod.FormulaType with scala.Double] = js.native
}

