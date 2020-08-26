package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait McfData extends js.Object {
  var columnHeaders: js.UndefOr[js.Array[McfDataColumnHeaders]] = js.native
  var containsSampledData: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var itemsPerPage: js.UndefOr[Double] = js.native
  var kind: js.UndefOr[String] = js.native
  var nextLink: js.UndefOr[String] = js.native
  var previousLink: js.UndefOr[String] = js.native
  var profileInfo: js.UndefOr[McfDataProfileInfo] = js.native
  var query: js.UndefOr[McfDataQuery] = js.native
  var rows: js.UndefOr[js.Array[js.Array[McfDataRows]]] = js.native
  var sampleSize: js.UndefOr[String] = js.native
  var sampleSpace: js.UndefOr[String] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var totalResults: js.UndefOr[Double] = js.native
  var totalsForAllResults: js.UndefOr[js.Object] = js.native
}

object McfData {
  @scala.inline
  def apply(): McfData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[McfData]
  }
  @scala.inline
  implicit class McfDataOps[Self <: McfData] (val x: Self) extends AnyVal {
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
    def setColumnHeadersVarargs(value: McfDataColumnHeaders*): Self = this.set("columnHeaders", js.Array(value :_*))
    @scala.inline
    def setColumnHeaders(value: js.Array[McfDataColumnHeaders]): Self = this.set("columnHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHeaders: Self = this.set("columnHeaders", js.undefined)
    @scala.inline
    def setContainsSampledData(value: Boolean): Self = this.set("containsSampledData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsSampledData: Self = this.set("containsSampledData", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsPerPage: Self = this.set("itemsPerPage", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextLink(value: String): Self = this.set("nextLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextLink: Self = this.set("nextLink", js.undefined)
    @scala.inline
    def setPreviousLink(value: String): Self = this.set("previousLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousLink: Self = this.set("previousLink", js.undefined)
    @scala.inline
    def setProfileInfo(value: McfDataProfileInfo): Self = this.set("profileInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileInfo: Self = this.set("profileInfo", js.undefined)
    @scala.inline
    def setQuery(value: McfDataQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRowsVarargs(value: js.Array[McfDataRows]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[McfDataRows]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSampleSize(value: String): Self = this.set("sampleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleSize: Self = this.set("sampleSize", js.undefined)
    @scala.inline
    def setSampleSpace(value: String): Self = this.set("sampleSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleSpace: Self = this.set("sampleSpace", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
    @scala.inline
    def setTotalsForAllResults(value: js.Object): Self = this.set("totalsForAllResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalsForAllResults: Self = this.set("totalsForAllResults", js.undefined)
  }
  
}

