package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueType extends StObject
@JSImport("exceljs", "ValueType")
@js.native
object ValueType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
  
  @js.native
  sealed trait Boolean extends ValueType
  /* 9 */ val Boolean: typings.exceljs.mod.ValueType.Boolean with Double = js.native
  
  @js.native
  sealed trait Date extends ValueType
  /* 4 */ val Date: typings.exceljs.mod.ValueType.Date with Double = js.native
  
  @js.native
  sealed trait Error extends ValueType
  /* 10 */ val Error: typings.exceljs.mod.ValueType.Error with Double = js.native
  
  @js.native
  sealed trait Formula extends ValueType
  /* 6 */ val Formula: typings.exceljs.mod.ValueType.Formula with Double = js.native
  
  @js.native
  sealed trait Hyperlink extends ValueType
  /* 5 */ val Hyperlink: typings.exceljs.mod.ValueType.Hyperlink with Double = js.native
  
  @js.native
  sealed trait Merge extends ValueType
  /* 1 */ val Merge: typings.exceljs.mod.ValueType.Merge with Double = js.native
  
  @js.native
  sealed trait Null extends ValueType
  /* 0 */ val Null: typings.exceljs.mod.ValueType.Null with Double = js.native
  
  @js.native
  sealed trait Number extends ValueType
  /* 2 */ val Number: typings.exceljs.mod.ValueType.Number with Double = js.native
  
  @js.native
  sealed trait RichText extends ValueType
  /* 8 */ val RichText: typings.exceljs.mod.ValueType.RichText with Double = js.native
  
  @js.native
  sealed trait SharedString extends ValueType
  /* 7 */ val SharedString: typings.exceljs.mod.ValueType.SharedString with Double = js.native
  
  @js.native
  sealed trait String extends ValueType
  /* 3 */ val String: typings.exceljs.mod.ValueType.String with Double = js.native
}
