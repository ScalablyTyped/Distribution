package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FormulaType extends StObject
@JSImport("exceljs", "FormulaType")
@js.native
object FormulaType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormulaType with Double] = js.native
  
  @js.native
  sealed trait Master extends FormulaType
  /* 1 */ val Master: typings.exceljs.mod.FormulaType.Master with Double = js.native
  
  @js.native
  sealed trait None extends FormulaType
  /* 0 */ val None: typings.exceljs.mod.FormulaType.None with Double = js.native
  
  @js.native
  sealed trait Shared extends FormulaType
  /* 2 */ val Shared: typings.exceljs.mod.FormulaType.Shared with Double = js.native
}
