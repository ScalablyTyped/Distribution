package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueType extends StObject
@JSImport("exceljs", "ValueType")
@js.native
object ValueType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType & Double] = js.native
  
  @js.native
  sealed trait Boolean
    extends StObject
       with ValueType
  /* 9 */ val Boolean: typings.exceljs.mod.ValueType.Boolean & Double = js.native
  
  @js.native
  sealed trait Date
    extends StObject
       with ValueType
  /* 4 */ val Date: typings.exceljs.mod.ValueType.Date & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with ValueType
  /* 10 */ val Error: typings.exceljs.mod.ValueType.Error & Double = js.native
  
  @js.native
  sealed trait Formula
    extends StObject
       with ValueType
  /* 6 */ val Formula: typings.exceljs.mod.ValueType.Formula & Double = js.native
  
  @js.native
  sealed trait Hyperlink
    extends StObject
       with ValueType
  /* 5 */ val Hyperlink: typings.exceljs.mod.ValueType.Hyperlink & Double = js.native
  
  @js.native
  sealed trait Merge
    extends StObject
       with ValueType
  /* 1 */ val Merge: typings.exceljs.mod.ValueType.Merge & Double = js.native
  
  @js.native
  sealed trait Null
    extends StObject
       with ValueType
  /* 0 */ val Null: typings.exceljs.mod.ValueType.Null & Double = js.native
  
  @js.native
  sealed trait Number
    extends StObject
       with ValueType
  /* 2 */ val Number: typings.exceljs.mod.ValueType.Number & Double = js.native
  
  @js.native
  sealed trait RichText
    extends StObject
       with ValueType
  /* 8 */ val RichText: typings.exceljs.mod.ValueType.RichText & Double = js.native
  
  @js.native
  sealed trait SharedString
    extends StObject
       with ValueType
  /* 7 */ val SharedString: typings.exceljs.mod.ValueType.SharedString & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with ValueType
  /* 3 */ val String: typings.exceljs.mod.ValueType.String & Double = js.native
}
