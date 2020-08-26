package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnSpec extends js.Object {
  var calc: js.UndefOr[js.Function2[/* data */ DataTable, /* row */ Double, _]] = js.native
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var properties: js.UndefOr[Properties] = js.native
  var role: js.UndefOr[String] = js.native
  var sourceColumn: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object ColumnSpec {
  @scala.inline
  def apply(): ColumnSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSpec]
  }
  @scala.inline
  implicit class ColumnSpecOps[Self <: ColumnSpec] (val x: Self) extends AnyVal {
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
    def setCalc(value: (/* data */ DataTable, /* row */ Double) => _): Self = this.set("calc", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCalc: Self = this.set("calc", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setProperties(value: Properties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSourceColumn(value: Double): Self = this.set("sourceColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceColumn: Self = this.set("sourceColumn", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

