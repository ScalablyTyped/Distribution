package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterType extends js.Object {
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.native
  var filterId: js.UndefOr[js.Array[String]] = js.native
  var filterType: js.UndefOr[js.Array[String]] = js.native
  var filterVersionNumber: js.UndefOr[js.Array[Double]] = js.native
  var pageLimit: js.UndefOr[Double] = js.native
  var pageNumber: js.UndefOr[Double] = js.native
}

object FilterType {
  @scala.inline
  def apply(): FilterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterType]
  }
  @scala.inline
  implicit class FilterTypeOps[Self <: FilterType] (val x: Self) extends AnyVal {
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
    def setFilterExtensionTypeVarargs(value: String*): Self = this.set("filterExtensionType", js.Array(value :_*))
    @scala.inline
    def setFilterExtensionType(value: js.Array[String]): Self = this.set("filterExtensionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterExtensionType: Self = this.set("filterExtensionType", js.undefined)
    @scala.inline
    def setFilterIdVarargs(value: String*): Self = this.set("filterId", js.Array(value :_*))
    @scala.inline
    def setFilterId(value: js.Array[String]): Self = this.set("filterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterId: Self = this.set("filterId", js.undefined)
    @scala.inline
    def setFilterTypeVarargs(value: String*): Self = this.set("filterType", js.Array(value :_*))
    @scala.inline
    def setFilterType(value: js.Array[String]): Self = this.set("filterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    @scala.inline
    def setFilterVersionNumberVarargs(value: Double*): Self = this.set("filterVersionNumber", js.Array(value :_*))
    @scala.inline
    def setFilterVersionNumber(value: js.Array[Double]): Self = this.set("filterVersionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterVersionNumber: Self = this.set("filterVersionNumber", js.undefined)
    @scala.inline
    def setPageLimit(value: Double): Self = this.set("pageLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLimit: Self = this.set("pageLimit", js.undefined)
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
  }
  
}

