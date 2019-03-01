package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

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
  def create(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[AnnotationSet]
  /**
    * Deletes an annotation set. Caller must have WRITE permission
    * for the associated annotation set.
    */
  def delete(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltAnnotationSetId): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Gets an annotation set. Caller must have READ permission for
    * the associated dataset.
    */
  def get(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltAnnotationSetId): gapiDotClientLib.gapiNs.clientNs.Request[AnnotationSet]
  /**
    * Searches for annotation sets that match the given criteria. Annotation sets
    * are returned in an unspecified order. This order is consistent, such that
    * two queries for the same content (regardless of page size) yield annotation
    * sets in the same order across their respective streams of paginated
    * responses. Caller must have READ permission for the queried datasets.
    */
  def search(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[SearchAnnotationSetsResponse]
  /**
    * Updates an annotation set. The update must respect all mutability
    * restrictions and other invariants described on the annotation set resource.
    * Caller must have WRITE permission for the associated dataset.
    */
  def update(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltAnnotationSetIdBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[AnnotationSet]
}

object AnnotationsetsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AnnotationSet]
    ],
    delete: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_AccesstokenAltAnnotationSetId, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_AccesstokenAltAnnotationSetId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AnnotationSet]
    ],
    search: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[SearchAnnotationSetsResponse]
    ],
    update: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_AccesstokenAltAnnotationSetIdBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AnnotationSet]
    ]
  ): AnnotationsetsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("search")(search)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AnnotationsetsResource]
  }
}

