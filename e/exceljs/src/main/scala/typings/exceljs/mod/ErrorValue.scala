package typings.exceljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorValue extends js.Object
@JSImport("exceljs", "ErrorValue")
@js.native
object ErrorValue extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorValue with String] = js.native
  
  @js.native
  sealed trait DivZero extends ErrorValue
  /* "#DIV/0!" */ @js.native
  object DivZero extends TopLevel[DivZero with String]
  
  @js.native
  sealed trait Name extends ErrorValue
  /* "#NAME?" */ @js.native
  object Name extends TopLevel[Name with String]
  
  @js.native
  sealed trait NotApplicable extends ErrorValue
  /* "#N/A" */ @js.native
  object NotApplicable extends TopLevel[NotApplicable with String]
  
  @js.native
  sealed trait Null extends ErrorValue
  /* "#NULL!" */ @js.native
  object Null extends TopLevel[Null with String]
  
  @js.native
  sealed trait Num extends ErrorValue
  /* "#NUM!" */ @js.native
  object Num extends TopLevel[Num with String]
  
  @js.native
  sealed trait Ref extends ErrorValue
  /* "#REF!" */ @js.native
  object Ref extends TopLevel[Ref with String]
  
  @js.native
  sealed trait Value extends ErrorValue
  /* "#VALUE!" */ @js.native
  object Value extends TopLevel[Value with String]
}
