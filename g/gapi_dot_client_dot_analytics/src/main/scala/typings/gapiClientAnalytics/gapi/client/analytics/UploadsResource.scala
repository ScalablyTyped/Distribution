package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.AccountIdAlt
import typings.gapiClientAnalytics.anon.CustomDataSourceId
import typings.gapiClientAnalytics.anon.UploadId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadsResource extends js.Object {
  /** Delete data associated with a previous upload. */
  def deleteUploadData(request: CustomDataSourceId): Request[Unit] = js.native
  /** List uploads to which the user has access. */
  def get(request: UploadId): Request[Upload] = js.native
  /** List uploads to which the user has access. */
  def list(request: AccountIdAlt): Request[Uploads] = js.native
  /** Upload data for a custom data source. */
  def uploadData(request: CustomDataSourceId): Request[Upload] = js.native
}

object UploadsResource {
  @scala.inline
  def apply(
    deleteUploadData: CustomDataSourceId => Request[Unit],
    get: UploadId => Request[Upload],
    list: AccountIdAlt => Request[Uploads],
    uploadData: CustomDataSourceId => Request[Upload]
  ): UploadsResource = {
    val __obj = js.Dynamic.literal(deleteUploadData = js.Any.fromFunction1(deleteUploadData), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), uploadData = js.Any.fromFunction1(uploadData))
    __obj.asInstanceOf[UploadsResource]
  }
  @scala.inline
  implicit class UploadsResourceOps[Self <: UploadsResource] (val x: Self) extends AnyVal {
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
    def setDeleteUploadData(value: CustomDataSourceId => Request[Unit]): Self = this.set("deleteUploadData", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: UploadId => Request[Upload]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AccountIdAlt => Request[Uploads]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUploadData(value: CustomDataSourceId => Request[Upload]): Self = this.set("uploadData", js.Any.fromFunction1(value))
  }
  
}

