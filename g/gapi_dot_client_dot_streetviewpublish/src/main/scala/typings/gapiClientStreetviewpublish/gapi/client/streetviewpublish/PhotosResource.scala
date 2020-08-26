package typings.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStreetviewpublish.anon.Accesstoken
import typings.gapiClientStreetviewpublish.anon.Fields
import typings.gapiClientStreetviewpublish.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotosResource extends js.Object {
  /**
    * Deletes a list of Photos and their
    * metadata.
    *
    * Note that if
    * BatchDeletePhotos
    * fails, either critical fields are missing or there was an authentication
    * error. Even if
    * BatchDeletePhotos
    * succeeds, there may have been failures for single photos in the batch.
    * These failures will be specified in each
    * PhotoResponse.status
    * in
    * BatchDeletePhotosResponse.results.
    * See
    * DeletePhoto
    * for specific failures that can occur per photo.
    */
  def batchDelete(request: Accesstoken): Request[BatchDeletePhotosResponse] = js.native
  /**
    * Gets the metadata of the specified
    * Photo batch.
    *
    * Note that if
    * BatchGetPhotos
    * fails, either critical fields are missing or there was an authentication
    * error. Even if
    * BatchGetPhotos
    * succeeds, there may have been failures for single photos in the batch.
    * These failures will be specified in each
    * PhotoResponse.status
    * in
    * BatchGetPhotosResponse.results.
    * See
    * GetPhoto
    * for specific failures that can occur per photo.
    */
  def batchGet(request: Fields): Request[BatchGetPhotosResponse] = js.native
  /**
    * Updates the metadata of Photos, such
    * as pose, place association, connections, etc. Changing the pixels of photos
    * is not supported.
    *
    * Note that if
    * BatchUpdatePhotos
    * fails, either critical fields are missing or there was an authentication
    * error. Even if
    * BatchUpdatePhotos
    * succeeds, there may have been failures for single photos in the batch.
    * These failures will be specified in each
    * PhotoResponse.status
    * in
    * BatchUpdatePhotosResponse.results.
    * See
    * UpdatePhoto
    * for specific failures that can occur per photo.
    *
    * Only the fields specified in
    * updateMask
    * field are used. If `updateMask` is not present, the update applies to all
    * fields.
    *
    * <aside class="note"><b>Note:</b> To update
    * Pose.altitude,
    * Pose.latLngPair has to be
    * filled as well. Otherwise, the request will fail.</aside>
    */
  def batchUpdate(request: Accesstoken): Request[BatchUpdatePhotosResponse] = js.native
  /**
    * Lists all the Photos that belong to
    * the user.
    */
  def list(request: Filter): Request[ListPhotosResponse] = js.native
}

object PhotosResource {
  @scala.inline
  def apply(
    batchDelete: Accesstoken => Request[BatchDeletePhotosResponse],
    batchGet: Fields => Request[BatchGetPhotosResponse],
    batchUpdate: Accesstoken => Request[BatchUpdatePhotosResponse],
    list: Filter => Request[ListPhotosResponse]
  ): PhotosResource = {
    val __obj = js.Dynamic.literal(batchDelete = js.Any.fromFunction1(batchDelete), batchGet = js.Any.fromFunction1(batchGet), batchUpdate = js.Any.fromFunction1(batchUpdate), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PhotosResource]
  }
  @scala.inline
  implicit class PhotosResourceOps[Self <: PhotosResource] (val x: Self) extends AnyVal {
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
    def setBatchDelete(value: Accesstoken => Request[BatchDeletePhotosResponse]): Self = this.set("batchDelete", js.Any.fromFunction1(value))
    @scala.inline
    def setBatchGet(value: Fields => Request[BatchGetPhotosResponse]): Self = this.set("batchGet", js.Any.fromFunction1(value))
    @scala.inline
    def setBatchUpdate(value: Accesstoken => Request[BatchUpdatePhotosResponse]): Self = this.set("batchUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[ListPhotosResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

