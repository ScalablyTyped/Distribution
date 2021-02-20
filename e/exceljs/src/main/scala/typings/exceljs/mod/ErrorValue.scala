package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorValue extends StObject
@JSImport("exceljs", "ErrorValue")
@js.native
object ErrorValue extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorValue with String] = js.native
  
  @js.native
  sealed trait DivZero extends ErrorValue
  /* "#DIV/0!" */ val DivZero: typings.exceljs.mod.ErrorValue.DivZero with String = js.native
  
  @js.native
  sealed trait Name extends ErrorValue
  /* "#NAME?" */ val Name: typings.exceljs.mod.ErrorValue.Name with String = js.native
  
  @js.native
  sealed trait NotApplicable extends ErrorValue
  /* "#N/A" */ val NotApplicable: typings.exceljs.mod.ErrorValue.NotApplicable with String = js.native
  
  @js.native
  sealed trait Null extends ErrorValue
  /* "#NULL!" */ val Null: typings.exceljs.mod.ErrorValue.Null with String = js.native
  
  @js.native
  sealed trait Num extends ErrorValue
  /* "#NUM!" */ val Num: typings.exceljs.mod.ErrorValue.Num with String = js.native
  
  @js.native
  sealed trait Ref extends ErrorValue
  /* "#REF!" */ val Ref: typings.exceljs.mod.ErrorValue.Ref with String = js.native
  
  @js.native
  sealed trait Value extends ErrorValue
  /* "#VALUE!" */ val Value: typings.exceljs.mod.ErrorValue.Value with String = js.native
}
