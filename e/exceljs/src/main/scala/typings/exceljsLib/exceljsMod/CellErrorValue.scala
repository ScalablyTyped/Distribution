package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellErrorValue extends _CellValue {
  var error: exceljsLib.exceljsLibStrings.`#N/A` | exceljsLib.exceljsLibStrings.`#REF!` | exceljsLib.exceljsLibStrings.`#NAME?` | exceljsLib.exceljsLibStrings.`#DIV/0!` | exceljsLib.exceljsLibStrings.`#NULL!` | exceljsLib.exceljsLibStrings.`#VALUE!` | exceljsLib.exceljsLibStrings.`#NUM!`
}

object CellErrorValue {
  @scala.inline
  def apply(
    error: exceljsLib.exceljsLibStrings.`#N/A` | exceljsLib.exceljsLibStrings.`#REF!` | exceljsLib.exceljsLibStrings.`#NAME?` | exceljsLib.exceljsLibStrings.`#DIV/0!` | exceljsLib.exceljsLibStrings.`#NULL!` | exceljsLib.exceljsLibStrings.`#VALUE!` | exceljsLib.exceljsLibStrings.`#NUM!`
  ): CellErrorValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellErrorValue]
  }
}

