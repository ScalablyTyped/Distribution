package typings.exceljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FormulaType extends js.Object
@JSImport("exceljs", "FormulaType")
@js.native
object FormulaType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormulaType with Double] = js.native
  
  @js.native
  sealed trait Master extends FormulaType
  /* 1 */ @js.native
  object Master extends TopLevel[Master with Double]
  
  @js.native
  sealed trait None extends FormulaType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Shared extends FormulaType
  /* 2 */ @js.native
  object Shared extends TopLevel[Shared with Double]
}
