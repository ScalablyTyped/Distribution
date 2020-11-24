package typings.exceljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueType extends js.Object
@JSImport("exceljs", "ValueType")
@js.native
object ValueType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
  
  @js.native
  sealed trait Boolean extends ValueType
  /* 9 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  @js.native
  sealed trait Date extends ValueType
  /* 4 */ @js.native
  object Date extends TopLevel[Date with Double]
  
  @js.native
  sealed trait Error extends ValueType
  /* 10 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Formula extends ValueType
  /* 6 */ @js.native
  object Formula extends TopLevel[Formula with Double]
  
  @js.native
  sealed trait Hyperlink extends ValueType
  /* 5 */ @js.native
  object Hyperlink extends TopLevel[Hyperlink with Double]
  
  @js.native
  sealed trait Merge extends ValueType
  /* 1 */ @js.native
  object Merge extends TopLevel[Merge with Double]
  
  @js.native
  sealed trait Null extends ValueType
  /* 0 */ @js.native
  object Null extends TopLevel[Null with Double]
  
  @js.native
  sealed trait Number extends ValueType
  /* 2 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  @js.native
  sealed trait RichText extends ValueType
  /* 8 */ @js.native
  object RichText
    extends TopLevel[typings.exceljs.mod.ValueType.RichText with Double]
  
  @js.native
  sealed trait SharedString extends ValueType
  /* 7 */ @js.native
  object SharedString extends TopLevel[SharedString with Double]
  
  @js.native
  sealed trait String extends ValueType
  /* 3 */ @js.native
  object String extends TopLevel[String with Double]
}
