package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupColumnOptions extends js.Object {
  var column: Double = js.native
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var `type`: String = js.native
  def aggregation(values: js.Array[_]): js.Any = js.native
}

object GroupColumnOptions {
  @scala.inline
  def apply(aggregation: js.Array[_] => js.Any, column: Double, `type`: String): GroupColumnOptions = {
    val __obj = js.Dynamic.literal(aggregation = js.Any.fromFunction1(aggregation), column = column.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupColumnOptions]
  }
  @scala.inline
  implicit class GroupColumnOptionsOps[Self <: GroupColumnOptions] (val x: Self) extends AnyVal {
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
    def setAggregation(value: js.Array[_] => js.Any): Self = this.set("aggregation", js.Any.fromFunction1(value))
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
  }
  
}

