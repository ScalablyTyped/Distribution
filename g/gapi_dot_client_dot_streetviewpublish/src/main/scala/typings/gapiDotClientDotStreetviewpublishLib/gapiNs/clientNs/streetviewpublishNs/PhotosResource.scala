package typings
package gapiDotClientDotStreetviewpublishLib.gapiNs.clientNs.streetviewpublishNs

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
  def batchDelete(request: gapiDotClientDotStreetviewpublishLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[BatchDeletePhotosResponse]
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
  def batchGet(request: gapiDotClientDotStreetviewpublishLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[BatchGetPhotosResponse]
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
  def batchUpdate(request: gapiDotClientDotStreetviewpublishLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdatePhotosResponse]
  /**
    * Lists all the Photos that belong to
    * the user.
    */
  def list(request: gapiDotClientDotStreetviewpublishLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[ListPhotosResponse]
}

object PhotosResource {
  @scala.inline
  def apply(
    batchDelete: js.Function1[
      gapiDotClientDotStreetviewpublishLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[BatchDeletePhotosResponse]
    ],
    batchGet: js.Function1[
      gapiDotClientDotStreetviewpublishLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[BatchGetPhotosResponse]
    ],
    batchUpdate: js.Function1[
      gapiDotClientDotStreetviewpublishLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdatePhotosResponse]
    ],
    list: js.Function1[
      gapiDotClientDotStreetviewpublishLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListPhotosResponse]
    ]
  ): PhotosResource = {
    val __obj = js.Dynamic.literal(batchDelete = batchDelete, batchGet = batchGet, batchUpdate = batchUpdate, list = list)
  
    __obj.asInstanceOf[PhotosResource]
  }
}

