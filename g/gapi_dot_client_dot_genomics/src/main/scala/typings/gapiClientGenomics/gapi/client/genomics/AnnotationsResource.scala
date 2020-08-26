package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGenomics.anon.Accesstoken
import typings.gapiClientGenomics.anon.Alt
import typings.gapiClientGenomics.anon.AnnotationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def batchCreate(request: Accesstoken): Request[BatchCreateAnnotationsResponse] = js.native
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
  def create(request: Accesstoken): Request[Annotation] = js.native
  /**
    * Deletes an annotation. Caller must have WRITE permission for
    * the associated annotation set.
    */
  def delete(request: Alt): Request[js.Object] = js.native
  /**
    * Gets an annotation. Caller must have READ permission
    * for the associated annotation set.
    */
  def get(request: Alt): Request[Annotation] = js.native
  /**
    * Searches for annotations that match the given criteria. Results are
    * ordered by genomic coordinate (by reference sequence, then position).
    * Annotations with equivalent genomic coordinates are returned in an
    * unspecified order. This order is consistent, such that two queries for the
    * same content (regardless of page size) yield annotations in the same order
    * across their respective streams of paginated responses. Caller must have
    * READ permission for the queried annotation sets.
    */
  def search(request: Accesstoken): Request[SearchAnnotationsResponse] = js.native
  /**
    * Updates an annotation. Caller must have
    * WRITE permission for the associated dataset.
    */
  def update(request: AnnotationId): Request[Annotation] = js.native
}

object AnnotationsResource {
  @scala.inline
  def apply(
    batchCreate: Accesstoken => Request[BatchCreateAnnotationsResponse],
    create: Accesstoken => Request[Annotation],
    delete: Alt => Request[js.Object],
    get: Alt => Request[Annotation],
    search: Accesstoken => Request[SearchAnnotationsResponse],
    update: AnnotationId => Request[Annotation]
  ): AnnotationsResource = {
    val __obj = js.Dynamic.literal(batchCreate = js.Any.fromFunction1(batchCreate), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnnotationsResource]
  }
  @scala.inline
  implicit class AnnotationsResourceOps[Self <: AnnotationsResource] (val x: Self) extends AnyVal {
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
    def setBatchCreate(value: Accesstoken => Request[BatchCreateAnnotationsResponse]): Self = this.set("batchCreate", js.Any.fromFunction1(value))
    @scala.inline
    def setCreate(value: Accesstoken => Request[Annotation]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Alt => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[Annotation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSearch(value: Accesstoken => Request[SearchAnnotationsResponse]): Self = this.set("search", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: AnnotationId => Request[Annotation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

