package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsResource extends js.Object {
  /**
    * Creates one or more new annotations atomically. All annotations must
    * belong to the same annotation set. Caller must have WRITE
    * permission for this annotation set. For optimal performance, batch
    * positionally adjacent annotations together.
    *
    * If the request has a systemic issue, such as an attempt to write to
    * an inaccessible annotation set, the entire RPC will fail accordingly. For
    * lesser data issues, when possible an error will be isolated to the
    * corresponding batch entry in the response; the remaining well formed
    * annotations will be created normally.
    *
    * For details on the requirements for each individual annotation resource,
    * see
    * CreateAnnotation.
    */
  def batchCreate(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[BatchCreateAnnotationsResponse]
  /**
    * Creates a new annotation. Caller must have WRITE permission
    * for the associated annotation set.
    *
    * The following fields are required:
    *
    * &#42; annotationSetId
    * &#42; referenceName or
    * referenceId
    *
    * ### Transcripts
    *
    * For annotations of type TRANSCRIPT, the following fields of
    * transcript must be provided:
    *
    * &#42; exons.start
    * &#42; exons.end
    *
    * All other fields may be optionally specified, unless documented as being
    * server-generated (for example, the `id` field). The annotated
    * range must be no longer than 100Mbp (mega base pairs). See the
    * Annotation resource
    * for additional restrictions on each field.
    */
  def create(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Annotation]
  /**
    * Deletes an annotation. Caller must have WRITE permission for
    * the associated annotation set.
    */
  def delete(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Gets an annotation. Caller must have READ permission
    * for the associated annotation set.
    */
  def get(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Annotation]
  /**
    * Searches for annotations that match the given criteria. Results are
    * ordered by genomic coordinate (by reference sequence, then position).
    * Annotations with equivalent genomic coordinates are returned in an
    * unspecified order. This order is consistent, such that two queries for the
    * same content (regardless of page size) yield annotations in the same order
    * across their respective streams of paginated responses. Caller must have
    * READ permission for the queried annotation sets.
    */
  def search(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[SearchAnnotationsResponse]
  /**
    * Updates an annotation. Caller must have
    * WRITE permission for the associated dataset.
    */
  def update(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltAnnotationId): gapiDotClientLib.gapiNs.clientNs.Request[Annotation]
}

