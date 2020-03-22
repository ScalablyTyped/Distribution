package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonFields
import typings.gapiClientAndroidpublisher.AnonImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Deletes the image (specified by id) from the edit. */
  def delete(request: AnonFields): Request_[Unit]
  /** Deletes all images for the specified language and image type. */
  def deleteall(request: AnonImageType): Request_[ImagesDeleteAllResponse]
  /** Lists all images for the specified language and image type. */
  def list(request: AnonImageType): Request_[ImagesListResponse]
  /** Uploads a new image and adds it to the list of images for the specified language and image type. */
  def upload(request: AnonImageType): Request_[ImagesUploadResponse]
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    deleteall: AnonImageType => Request_[ImagesDeleteAllResponse],
    list: AnonImageType => Request_[ImagesListResponse],
    upload: AnonImageType => Request_[ImagesUploadResponse]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), list = js.Any.fromFunction1(list), upload = js.Any.fromFunction1(upload))
  
    __obj.asInstanceOf[ImagesResource]
  }
}

