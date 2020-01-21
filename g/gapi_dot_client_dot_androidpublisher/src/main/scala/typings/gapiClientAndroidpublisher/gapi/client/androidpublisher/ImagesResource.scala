package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAltEditIdFields
import typings.gapiClientAndroidpublisher.AnonAltEditIdFieldsImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Deletes the image (specified by id) from the edit. */
  def delete(request: AnonAltEditIdFields): Request_[Unit]
  /** Deletes all images for the specified language and image type. */
  def deleteall(request: AnonAltEditIdFieldsImageType): Request_[ImagesDeleteAllResponse]
  /** Lists all images for the specified language and image type. */
  def list(request: AnonAltEditIdFieldsImageType): Request_[ImagesListResponse]
  /** Uploads a new image and adds it to the list of images for the specified language and image type. */
  def upload(request: AnonAltEditIdFieldsImageType): Request_[ImagesUploadResponse]
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: AnonAltEditIdFields => Request_[Unit],
    deleteall: AnonAltEditIdFieldsImageType => Request_[ImagesDeleteAllResponse],
    list: AnonAltEditIdFieldsImageType => Request_[ImagesListResponse],
    upload: AnonAltEditIdFieldsImageType => Request_[ImagesUploadResponse]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), list = js.Any.fromFunction1(list), upload = js.Any.fromFunction1(upload))
  
    __obj.asInstanceOf[ImagesResource]
  }
}

