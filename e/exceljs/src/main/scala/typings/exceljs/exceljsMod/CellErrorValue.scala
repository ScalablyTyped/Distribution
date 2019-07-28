package typings.exceljs.exceljsMod

import typings.exceljs.exceljsStrings.`#DIV/0!`
import typings.exceljs.exceljsStrings.`#N/A`
import typings.exceljs.exceljsStrings.`#NAME?`
import typings.exceljs.exceljsStrings.`#NULL!`
import typings.exceljs.exceljsStrings.`#NUM!`
import typings.exceljs.exceljsStrings.`#REF!`
import typings.exceljs.exceljsStrings.`#VALUE!`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellErrorValue extends _CellValue {
  var error: `#N/A` | `#REF!` | `#NAME?` | `#DIV/0!` | `#NULL!` | `#VALUE!` | `#NUM!`
}

object CellErrorValue {
  @scala.inline
  def apply(error: `#N/A` | `#REF!` | `#NAME?` | `#DIV/0!` | `#NULL!` | `#VALUE!` | `#NUM!`): CellErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellErrorValue]
  }
}

