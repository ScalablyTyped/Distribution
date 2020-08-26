package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsRowsCellsComment extends js.Object {
  /** Get or sets the value that indicates whether to show or hide comments in Spreadsheet.
    * @Default {false}
    */
  var isVisible: js.UndefOr[Boolean] = js.native
  /** Specifies the value for the comment in Spreadsheet.
    */
  var value: js.UndefOr[String] = js.native
}

object SheetsRowsCellsComment {
  @scala.inline
  def apply(): SheetsRowsCellsComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRowsCellsComment]
  }
  @scala.inline
  implicit class SheetsRowsCellsCommentOps[Self <: SheetsRowsCellsComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

