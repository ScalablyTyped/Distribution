package typings.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStreetviewpublish.AnonAccesstoken
import typings.gapiClientStreetviewpublish.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientStreetviewpublish.AnonAccesstokenAltBearertokenCallbackFieldsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def batchDelete(request: AnonAccesstoken): Request_[BatchDeletePhotosResponse]
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
  def batchGet(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[BatchGetPhotosResponse]
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
  def batchUpdate(request: AnonAccesstoken): Request_[BatchUpdatePhotosResponse]
  /**
    * Lists all the Photos that belong to
    * the user.
    */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsFilter): Request_[ListPhotosResponse]
}

object PhotosResource {
  @scala.inline
  def apply(
    batchDelete: AnonAccesstoken => Request_[BatchDeletePhotosResponse],
    batchGet: AnonAccesstokenAltBearertokenCallbackFields => Request_[BatchGetPhotosResponse],
    batchUpdate: AnonAccesstoken => Request_[BatchUpdatePhotosResponse],
    list: AnonAccesstokenAltBearertokenCallbackFieldsFilter => Request_[ListPhotosResponse]
  ): PhotosResource = {
    val __obj = js.Dynamic.literal(batchDelete = js.Any.fromFunction1(batchDelete), batchGet = js.Any.fromFunction1(batchGet), batchUpdate = js.Any.fromFunction1(batchUpdate), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PhotosResource]
  }
}

