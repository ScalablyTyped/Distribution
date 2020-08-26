package typings.exceljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueType extends js.Object

@JSImport("exceljs", "ValueType")
@js.native
object ValueType extends js.Object {
  @js.native
  sealed trait Boolean extends ValueType
  
  @js.native
  sealed trait Date extends ValueType
  
  @js.native
  sealed trait Error extends ValueType
  
  @js.native
  sealed trait Formula extends ValueType
  
  @js.native
  sealed trait Hyperlink extends ValueType
  
  @js.native
  sealed trait Merge extends ValueType
  
  @js.native
  sealed trait Null extends ValueType
  
  @js.native
  sealed trait Number extends ValueType
  
  @js.native
  sealed trait RichText extends ValueType
  
  @js.native
  sealed trait SharedString extends ValueType
  
  @js.native
  sealed trait String extends ValueType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
  /* 9 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  /* 4 */ @js.native
  object Date extends TopLevel[Date with Double]
  
  /* 10 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 6 */ @js.native
  object Formula extends TopLevel[Formula with Double]
  
  /* 5 */ @js.native
  object Hyperlink extends TopLevel[Hyperlink with Double]
  
  /* 1 */ @js.native
  object Merge extends TopLevel[Merge with Double]
  
  /* 0 */ @js.native
  object Null extends TopLevel[Null with Double]
  
  /* 2 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  /* 8 */ @js.native
  object RichText
    extends TopLevel[typings.exceljs.mod.ValueType.RichText with Double]
  
  /* 7 */ @js.native
  object SharedString extends TopLevel[SharedString with Double]
  
  /* 3 */ @js.native
  object String extends TopLevel[String with Double]
  
}

