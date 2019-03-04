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
    delete: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    deleteall: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsImageType, 
      gapiDotClientLib.gapiNs.clientNs.Request[ImagesDeleteAllResponse]
    ],
    list: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsImageType, 
      gapiDotClientLib.gapiNs.clientNs.Request[ImagesListResponse]
    ],
    upload: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsImageType, 
      gapiDotClientLib.gapiNs.clientNs.Request[ImagesUploadResponse]
    ]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(delete = delete, deleteall = deleteall, list = list, upload = upload)
  
    __obj.asInstanceOf[ImagesResource]
  }
}

