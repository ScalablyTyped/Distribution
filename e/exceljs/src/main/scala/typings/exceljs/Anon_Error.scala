package typings.exceljs

import typings.exceljs.exceljsMod.CellErrorValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: CellErrorValue
}

object Anon_Error {
  @scala.inline
  def apply(error: CellErrorValue): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Error]
  }
}

