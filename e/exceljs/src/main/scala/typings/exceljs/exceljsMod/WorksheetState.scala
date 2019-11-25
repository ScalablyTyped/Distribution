package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.exceljs.exceljsStrings.visible
  - typings.exceljs.exceljsStrings.hidden
  - typings.exceljs.exceljsStrings.veryHidden
*/
trait WorksheetState extends js.Object

object WorksheetState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typings.exceljs.exceljsStrings.hidden = this.cast("hidden")
  @scala.inline
  def veryHidden: typings.exceljs.exceljsStrings.veryHidden = this.cast("veryHidden")
  @scala.inline
  def visible: typings.exceljs.exceljsStrings.visible = this.cast("visible")
}

