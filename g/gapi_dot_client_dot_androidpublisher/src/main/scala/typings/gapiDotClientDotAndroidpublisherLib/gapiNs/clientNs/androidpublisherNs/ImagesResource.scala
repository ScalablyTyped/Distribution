package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Deletes the image (specified by id) from the edit. */
  def delete(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Deletes all images for the specified language and image type. */
  def deleteall(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsImageType): gapiDotClientLib.gapiNs.clientNs.Request[ImagesDeleteAllResponse]
  /** Lists all images for the specified language and image type. */
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsImageType): gapiDotClientLib.gapiNs.clientNs.Request[ImagesListResponse]
  /** Uploads a new image and adds it to the list of images for the specified language and image type. */
  def upload(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsImageType): gapiDotClientLib.gapiNs.clientNs.Request[ImagesUploadResponse]
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    deleteall: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsImageType => gapiDotClientLib.gapiNs.clientNs.Request[ImagesDeleteAllResponse],
    list: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsImageType => gapiDotClientLib.gapiNs.clientNs.Request[ImagesListResponse],
    upload: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsImageType => gapiDotClientLib.gapiNs.clientNs.Request[ImagesUploadResponse]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), list = js.Any.fromFunction1(list), upload = js.Any.fromFunction1(upload))
  
    __obj.asInstanceOf[ImagesResource]
  }
}

