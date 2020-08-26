package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemVersionsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var operatingSystemVersions: js.UndefOr[js.Array[OperatingSystemVersion]] = js.native
}

object OperatingSystemVersionsListResponse {
  @scala.inline
  def apply(): OperatingSystemVersionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemVersionsListResponse]
  }
  @scala.inline
  implicit class OperatingSystemVersionsListResponseOps[Self <: OperatingSystemVersionsListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOperatingSystemVersionsVarargs(value: OperatingSystemVersion*): Self = this.set("operatingSystemVersions", js.Array(value :_*))
    @scala.inline
    def setOperatingSystemVersions(value: js.Array[OperatingSystemVersion]): Self = this.set("operatingSystemVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystemVersions: Self = this.set("operatingSystemVersions", js.undefined)
  }
  
}

