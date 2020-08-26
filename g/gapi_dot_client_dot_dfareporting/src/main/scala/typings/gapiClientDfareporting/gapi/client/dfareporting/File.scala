package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClientDfareporting.anon.ApiUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  /** The date range for which the file has report data. The date range will always be the absolute date range for which the report is run. */
  var dateRange: js.UndefOr[DateRange] = js.native
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** The filename of the file. */
  var fileName: js.UndefOr[String] = js.native
  /** The output format of the report. Only available once the file is available. */
  var format: js.UndefOr[String] = js.native
  /** The unique ID of this report file. */
  var id: js.UndefOr[String] = js.native
  /** The kind of resource this is, in this case dfareporting#file. */
  var kind: js.UndefOr[String] = js.native
  /** The timestamp in milliseconds since epoch when this file was last modified. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /** The ID of the report this file was generated from. */
  var reportId: js.UndefOr[String] = js.native
  /** The status of the report file. */
  var status: js.UndefOr[String] = js.native
  /** The URLs where the completed report file can be downloaded. */
  var urls: js.UndefOr[ApiUrl] = js.native
}

object File {
  @scala.inline
  def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    @scala.inline
    def setReportId(value: String): Self = this.set("reportId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportId: Self = this.set("reportId", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUrls(value: ApiUrl): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
  
}

