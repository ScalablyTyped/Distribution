package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFieldSpecNumericIndexingSpec extends js.Object {
  var maxValue: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double] = js.native
}

object SchemaFieldSpecNumericIndexingSpec {
  @scala.inline
  def apply(): SchemaFieldSpecNumericIndexingSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldSpecNumericIndexingSpec]
  }
  @scala.inline
  implicit class SchemaFieldSpecNumericIndexingSpecOps[Self <: SchemaFieldSpecNumericIndexingSpec] (val x: Self) extends AnyVal {
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
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
  }
  
}

