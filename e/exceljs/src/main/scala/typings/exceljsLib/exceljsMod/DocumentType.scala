package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentType extends js.Object

@JSImport("exceljs", "DocumentType")
@js.native
object DocumentType extends js.Object {
  @js.native
  sealed trait Xlsx
    extends exceljsLib.exceljsMod.DocumentType
  
  /* 1 */ val Xlsx: Xlsx with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[exceljsLib.exceljsMod.DocumentType with scala.Double] = js.native
}

