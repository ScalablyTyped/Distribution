package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorValue extends StObject
@JSImport("exceljs", "ErrorValue")
@js.native
object ErrorValue extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorValue & String] = js.native
  
  @js.native
  sealed trait DivZero
    extends StObject
       with ErrorValue
  /* "#DIV/0!" */ val DivZero: typings.exceljs.mod.ErrorValue.DivZero & String = js.native
  
  @js.native
  sealed trait Name
    extends StObject
       with ErrorValue
  /* "#NAME?" */ val Name: typings.exceljs.mod.ErrorValue.Name & String = js.native
  
  @js.native
  sealed trait NotApplicable
    extends StObject
       with ErrorValue
  /* "#N/A" */ val NotApplicable: typings.exceljs.mod.ErrorValue.NotApplicable & String = js.native
  
  @js.native
  sealed trait Null
    extends StObject
       with ErrorValue
  /* "#NULL!" */ val Null: typings.exceljs.mod.ErrorValue.Null & String = js.native
  
  @js.native
  sealed trait Num
    extends StObject
       with ErrorValue
  /* "#NUM!" */ val Num: typings.exceljs.mod.ErrorValue.Num & String = js.native
  
  @js.native
  sealed trait Ref
    extends StObject
       with ErrorValue
  /* "#REF!" */ val Ref: typings.exceljs.mod.ErrorValue.Ref & String = js.native
  
  @js.native
  sealed trait Value
    extends StObject
       with ErrorValue
  /* "#VALUE!" */ val Value: typings.exceljs.mod.ErrorValue.Value & String = js.native
}
