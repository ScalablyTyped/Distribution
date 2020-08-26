package typings.exceljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentType extends js.Object

@JSImport("exceljs", "DocumentType")
@js.native
object DocumentType extends js.Object {
  @js.native
  sealed trait Xlsx extends DocumentType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentType with Double] = js.native
  /* 1 */ @js.native
  object Xlsx
    extends TopLevel[typings.exceljs.mod.DocumentType.Xlsx with Double]
  
}

