package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.Fields
import typings.gapiClientAndroidpublisher.anon.ImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Deletes the image (specified by id) from the edit. */
  def delete(request: Fields): Request[Unit]
  /** Deletes all images for the specified language and image type. */
  def deleteall(request: ImageType): Request[ImagesDeleteAllResponse]
  /** Lists all images for the specified language and image type. */
  def list(request: ImageType): Request[ImagesListResponse]
  /** Uploads a new image and adds it to the list of images for the specified language and image type. */
  def upload(request: ImageType): Request[ImagesUploadResponse]
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
}

