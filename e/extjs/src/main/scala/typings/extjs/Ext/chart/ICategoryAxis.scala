package typings.extjs.Ext.chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICategoryAxis
  extends typings.extjs.Ext.chart.axis.IAxis {
  /** [Config Option] (Boolean) */
  var calculateCategoryCount: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var categoryNames: js.UndefOr[String] = js.native
}

object ICategoryAxis {
  @scala.inline
  def apply(): ICategoryAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICategoryAxis]
  }
  @scala.inline
  implicit class ICategoryAxisOps[Self <: ICategoryAxis] (val x: Self) extends AnyVal {
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
    def setCalculateCategoryCount(value: Boolean): Self = this.set("calculateCategoryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculateCategoryCount: Self = this.set("calculateCategoryCount", js.undefined)
    @scala.inline
    def setCategoryNames(value: String): Self = this.set("categoryNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryNames: Self = this.set("categoryNames", js.undefined)
  }
  
}

