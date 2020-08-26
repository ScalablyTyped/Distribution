package typings.gapiClientAdmin.gapi.client.admin

import typings.gapiClientAdmin.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageReports extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  /** The kind of object. */
  var kind: js.UndefOr[String] = js.native
  /** Token for retrieving the next page */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Various application parameter records. */
  var usageReports: js.UndefOr[js.Array[UsageReport]] = js.native
  /** Warnings if any. */
  var warnings: js.UndefOr[js.Array[Code]] = js.native
}

object UsageReports {
  @scala.inline
  def apply(): UsageReports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageReports]
  }
  @scala.inline
  implicit class UsageReportsOps[Self <: UsageReports] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setUsageReportsVarargs(value: UsageReport*): Self = this.set("usageReports", js.Array(value :_*))
    @scala.inline
    def setUsageReports(value: js.Array[UsageReport]): Self = this.set("usageReports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageReports: Self = this.set("usageReports", js.undefined)
    @scala.inline
    def setWarningsVarargs(value: Code*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[Code]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

