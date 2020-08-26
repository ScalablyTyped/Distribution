package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionFilter extends js.Object {
  var dimensionName: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object DimensionFilter {
  @scala.inline
  def apply(): DimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionFilter]
  }
  @scala.inline
  implicit class DimensionFilterOps[Self <: DimensionFilter] (val x: Self) extends AnyVal {
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
    def setDimensionName(value: String): Self = this.set("dimensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionName: Self = this.set("dimensionName", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

