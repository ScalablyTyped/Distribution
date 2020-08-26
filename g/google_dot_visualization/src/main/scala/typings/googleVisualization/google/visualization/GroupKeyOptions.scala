package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupKeyOptions extends js.Object {
  var column: Double = js.native
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var modifier: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  var `type`: String = js.native
}

object GroupKeyOptions {
  @scala.inline
  def apply(column: Double, `type`: String): GroupKeyOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupKeyOptions]
  }
  @scala.inline
  implicit class GroupKeyOptionsOps[Self <: GroupKeyOptions] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setModifier(value: /* value */ js.Any => _): Self = this.set("modifier", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
  }
  
}

