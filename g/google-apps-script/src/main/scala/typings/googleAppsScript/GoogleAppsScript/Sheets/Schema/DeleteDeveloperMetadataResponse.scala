package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeveloperMetadataResponse extends js.Object {
  var deletedDeveloperMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
}

object DeleteDeveloperMetadataResponse {
  @scala.inline
  def apply(): DeleteDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeveloperMetadataResponse]
  }
  @scala.inline
  implicit class DeleteDeveloperMetadataResponseOps[Self <: DeleteDeveloperMetadataResponse] (val x: Self) extends AnyVal {
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
    def setDeletedDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = this.set("deletedDeveloperMetadata", js.Array(value :_*))
    @scala.inline
    def setDeletedDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = this.set("deletedDeveloperMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedDeveloperMetadata: Self = this.set("deletedDeveloperMetadata", js.undefined)
  }
  
}

