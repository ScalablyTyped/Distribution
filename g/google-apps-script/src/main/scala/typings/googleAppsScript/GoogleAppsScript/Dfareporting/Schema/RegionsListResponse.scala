package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var regions: js.UndefOr[js.Array[Region]] = js.native
}

object RegionsListResponse {
  @scala.inline
  def apply(): RegionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionsListResponse]
  }
  @scala.inline
  implicit class RegionsListResponseOps[Self <: RegionsListResponse] (val x: Self) extends AnyVal {
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
    def setRegionsVarargs(value: Region*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[Region]): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
  }
  
}

