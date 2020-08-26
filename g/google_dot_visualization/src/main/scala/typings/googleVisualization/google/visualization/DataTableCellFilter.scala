package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTableCellFilter extends js.Object {
  var column: Double = js.native
  var maxValue: js.UndefOr[js.Any] = js.native
  var minValue: js.UndefOr[js.Any] = js.native
  var test: js.UndefOr[
    js.Function4[
      /* value */ js.Any, 
      /* row */ js.UndefOr[Double], 
      /* column */ js.UndefOr[Double], 
      /* data */ js.UndefOr[DataTable | DataView], 
      Boolean
    ]
  ] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object DataTableCellFilter {
  @scala.inline
  def apply(column: Double): DataTableCellFilter = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCellFilter]
  }
  @scala.inline
  implicit class DataTableCellFilterOps[Self <: DataTableCellFilter] (val x: Self) extends AnyVal {
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
    def setMaxValue(value: js.Any): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: js.Any): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setTest(
      value: (/* value */ js.Any, /* row */ js.UndefOr[Double], /* column */ js.UndefOr[Double], /* data */ js.UndefOr[DataTable | DataView]) => Boolean
    ): Self = this.set("test", js.Any.fromFunction4(value))
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

