package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGenomics.AnonAccesstoken
import typings.gapiClientGenomics.AnonAnnotationSetId
import typings.gapiClientGenomics.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsetsResource extends js.Object {
  /**
    * Creates a new annotation set. Caller must have WRITE permission for the
    * associated dataset.
    *
    * The following fields are required:
    *
    * &#42; datasetId
    * &#42; referenceSetId
    *
    * All other fields may be optionally specified, unless documented as being
    * server-generated (for example, the `id` field).
    */
  def create(request: AnonAccesstoken): Request_[AnnotationSet]
  /**
    * Deletes an annotation set. Caller must have WRITE permission
    * for the associated annotation set.
    */
  def delete(request: AnonAnnotationSetId): Request_[js.Object]
  /**
    * Gets an annotation set. Caller must have READ permission for
    * the associated dataset.
    */
  def get(request: AnonAnnotationSetId): Request_[AnnotationSet]
  /**
    * Searches for annotation sets that match the given criteria. Annotation sets
    * are returned in an unspecified order. This order is consistent, such that
    * two queries for the same content (regardless of page size) yield annotation
    * sets in the same order across their respective streams of paginated
    * responses. Caller must have READ permission for the queried datasets.
    */
  def search(request: AnonAccesstoken): Request_[SearchAnnotationSetsResponse]
  /**
    * Updates an annotation set. The update must respect all mutability
    * restrictions and other invariants described on the annotation set resource.
    * Caller must have WRITE permission for the associated dataset.
    */
  def update(request: AnonBearertoken): Request_[AnnotationSet]
}

object AnnotationsetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[AnnotationSet],
    delete: AnonAnnotationSetId => Request_[js.Object],
    get: AnonAnnotationSetId => Request_[AnnotationSet],
    search: AnonAccesstoken => Request_[SearchAnnotationSetsResponse],
    update: AnonBearertoken => Request_[AnnotationSet]
  ): AnnotationsetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AnnotationsetsResource]
  }
}

