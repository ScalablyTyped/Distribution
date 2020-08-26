package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCloudloadingAddbook extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A drive document id. The upload_client_token must not be set.
    */
  var drive_document_id: js.UndefOr[String] = js.native
  /**
    * The document MIME type. It can be set only if the drive_document_id is
    * set.
    */
  var mime_type: js.UndefOr[String] = js.native
  /**
    * The document name. It can be set only if the drive_document_id is set.
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    */
  var upload_client_token: js.UndefOr[String] = js.native
}

object ParamsResourceCloudloadingAddbook {
  @scala.inline
  def apply(): ParamsResourceCloudloadingAddbook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCloudloadingAddbook]
  }
  @scala.inline
  implicit class ParamsResourceCloudloadingAddbookOps[Self <: ParamsResourceCloudloadingAddbook] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDrive_document_id(value: String): Self = this.set("drive_document_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrive_document_id: Self = this.set("drive_document_id", js.undefined)
    @scala.inline
    def setMime_type(value: String): Self = this.set("mime_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime_type: Self = this.set("mime_type", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUpload_client_token(value: String): Self = this.set("upload_client_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload_client_token: Self = this.set("upload_client_token", js.undefined)
  }
  
}

