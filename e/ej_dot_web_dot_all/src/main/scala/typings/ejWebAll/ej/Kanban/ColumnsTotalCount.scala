package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnsTotalCount extends js.Object {
  /** To customize the totalCount text properties.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
}

object ColumnsTotalCount {
  @scala.inline
  def apply(): ColumnsTotalCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnsTotalCount]
  }
  @scala.inline
  implicit class ColumnsTotalCountOps[Self <: ColumnsTotalCount] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

