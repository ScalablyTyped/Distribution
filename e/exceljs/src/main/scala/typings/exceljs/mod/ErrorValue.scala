package typings.exceljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorValue extends js.Object

@JSImport("exceljs", "ErrorValue")
@js.native
object ErrorValue extends js.Object {
  @js.native
  sealed trait DivZero extends ErrorValue
  
  @js.native
  sealed trait Name extends ErrorValue
  
  @js.native
  sealed trait NotApplicable extends ErrorValue
  
  @js.native
  sealed trait Null extends ErrorValue
  
  @js.native
  sealed trait Num extends ErrorValue
  
  @js.native
  sealed trait Ref extends ErrorValue
  
  @js.native
  sealed trait Value extends ErrorValue
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorValue with String] = js.native
  /* "#DIV/0!" */ @js.native
  object DivZero extends TopLevel[DivZero with String]
  
  /* "#NAME?" */ @js.native
  object Name extends TopLevel[Name with String]
  
  /* "#N/A" */ @js.native
  object NotApplicable extends TopLevel[NotApplicable with String]
  
  /* "#NULL!" */ @js.native
  object Null extends TopLevel[Null with String]
  
  /* "#NUM!" */ @js.native
  object Num extends TopLevel[Num with String]
  
  /* "#REF!" */ @js.native
  object Ref extends TopLevel[Ref with String]
  
  /* "#VALUE!" */ @js.native
  object Value extends TopLevel[Value with String]
  
}

