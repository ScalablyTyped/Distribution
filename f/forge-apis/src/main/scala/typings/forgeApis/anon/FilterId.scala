package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterId extends js.Object {
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.native
  var filterId: js.UndefOr[js.Array[String]] = js.native
  var filterType: js.UndefOr[js.Array[String]] = js.native
}

object FilterId {
  @scala.inline
  def apply(): FilterId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterId]
  }
  @scala.inline
  implicit class FilterIdOps[Self <: FilterId] (val x: Self) extends AnyVal {
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
  }
  
}

