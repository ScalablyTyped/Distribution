package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformTypesListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.native
}

object PlatformTypesListResponse {
  @scala.inline
  def apply(): PlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformTypesListResponse]
  }
  @scala.inline
  implicit class PlatformTypesListResponseOps[Self <: PlatformTypesListResponse] (val x: Self) extends AnyVal {
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
    def setPlatformTypesVarargs(value: PlatformType*): Self = this.set("platformTypes", js.Array(value :_*))
    @scala.inline
    def setPlatformTypes(value: js.Array[PlatformType]): Self = this.set("platformTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformTypes: Self = this.set("platformTypes", js.undefined)
  }
  
}

