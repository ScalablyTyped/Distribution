package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltEditIdFields
import typings.gapiDotClientDotAndroidpublisher.Anon_AltEditIdFieldsImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Deletes the image (specified by id) from the edit. */
  def delete(request: Anon_AltEditIdFields): Request[Unit]
  /** Deletes all images for the specified language and image type. */
  def deleteall(request: Anon_AltEditIdFieldsImageType): Request[ImagesDeleteAllResponse]
  /** Lists all images for the specified language and image type. */
  def list(request: Anon_AltEditIdFieldsImageType): Request[ImagesListResponse]
  /** Uploads a new image and adds it to the list of images for the specified language and image type. */
  def upload(request: Anon_AltEditIdFieldsImageType): Request[ImagesUploadResponse]
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: Anon_AltEditIdFields => Request[Unit],
    deleteall: Anon_AltEditIdFieldsImageType => Request[ImagesDeleteAllResponse],
    list: Anon_AltEditIdFieldsImageType => Request[ImagesListResponse],
    upload: Anon_AltEditIdFieldsImageType => Request[ImagesUploadResponse]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), list = js.Any.fromFunction1(list), upload = js.Any.fromFunction1(upload))
  
    __obj.asInstanceOf[ImagesResource]
  }
}

