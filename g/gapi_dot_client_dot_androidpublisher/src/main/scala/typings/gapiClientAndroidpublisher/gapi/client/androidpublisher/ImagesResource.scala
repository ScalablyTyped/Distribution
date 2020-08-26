package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.Fields
import typings.gapiClientAndroidpublisher.anon.ImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesResource extends js.Object {
  /** Deletes the image (specified by id) from the edit. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Deletes all images for the specified language and image type. */
  def deleteall(request: ImageType): Request[ImagesDeleteAllResponse] = js.native
  /** Lists all images for the specified language and image type. */
  def list(request: ImageType): Request[ImagesListResponse] = js.native
  /** Uploads a new image and adds it to the list of images for the specified language and image type. */
  def upload(request: ImageType): Request[ImagesUploadResponse] = js.native
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    deleteall: ImageType => Request[ImagesDeleteAllResponse],
    list: ImageType => Request[ImagesListResponse],
    upload: ImageType => Request[ImagesUploadResponse]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), list = js.Any.fromFunction1(list), upload = js.Any.fromFunction1(upload))
    __obj.asInstanceOf[ImagesResource]
  }
  @scala.inline
  implicit class ImagesResourceOps[Self <: ImagesResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteall(value: ImageType => Request[ImagesDeleteAllResponse]): Self = this.set("deleteall", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: ImageType => Request[ImagesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpload(value: ImageType => Request[ImagesUploadResponse]): Self = this.set("upload", js.Any.fromFunction1(value))
  }
  
}

