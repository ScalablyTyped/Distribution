package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGenomics.Anon_Accesstoken
import typings.gapiDotClientDotGenomics.Anon_AccesstokenAltAnnotationSetId
import typings.gapiDotClientDotGenomics.Anon_AccesstokenAltAnnotationSetIdBearertoken
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
  def create(request: Anon_Accesstoken): Request[AnnotationSet]
  /**
    * Deletes an annotation set. Caller must have WRITE permission
    * for the associated annotation set.
    */
  def delete(request: Anon_AccesstokenAltAnnotationSetId): Request[js.Object]
  /**
    * Gets an annotation set. Caller must have READ permission for
    * the associated dataset.
    */
  def get(request: Anon_AccesstokenAltAnnotationSetId): Request[AnnotationSet]
  /**
    * Searches for annotation sets that match the given criteria. Annotation sets
    * are returned in an unspecified order. This order is consistent, such that
    * two queries for the same content (regardless of page size) yield annotation
    * sets in the same order across their respective streams of paginated
    * responses. Caller must have READ permission for the queried datasets.
    */
  def search(request: Anon_Accesstoken): Request[SearchAnnotationSetsResponse]
  /**
    * Updates an annotation set. The update must respect all mutability
    * restrictions and other invariants described on the annotation set resource.
    * Caller must have WRITE permission for the associated dataset.
    */
  def update(request: Anon_AccesstokenAltAnnotationSetIdBearertoken): Request[AnnotationSet]
}

object AnnotationsetsResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[AnnotationSet],
    delete: Anon_AccesstokenAltAnnotationSetId => Request[js.Object],
    get: Anon_AccesstokenAltAnnotationSetId => Request[AnnotationSet],
    search: Anon_Accesstoken => Request[SearchAnnotationSetsResponse],
    update: Anon_AccesstokenAltAnnotationSetIdBearertoken => Request[AnnotationSet]
  ): AnnotationsetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AnnotationsetsResource]
  }
}

