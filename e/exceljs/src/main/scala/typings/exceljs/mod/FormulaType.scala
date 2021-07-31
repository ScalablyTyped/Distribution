package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FormulaType extends StObject
@JSImport("exceljs", "FormulaType")
@js.native
object FormulaType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormulaType & Double] = js.native
  
  @js.native
  sealed trait Master
    extends StObject
       with FormulaType
  /* 1 */ val Master: typings.exceljs.mod.FormulaType.Master & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with FormulaType
  /* 0 */ val None: typings.exceljs.mod.FormulaType.None & Double = js.native
  
  @js.native
  sealed trait Shared
    extends StObject
       with FormulaType
  /* 2 */ val Shared: typings.exceljs.mod.FormulaType.Shared & Double = js.native
}
