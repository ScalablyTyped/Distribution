package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGenomics.anon.Accesstoken
import typings.gapiClientGenomics.anon.AnnotationSetId
import typings.gapiClientGenomics.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def create(request: Accesstoken): Request[AnnotationSet] = js.native
  /**
    * Deletes an annotation set. Caller must have WRITE permission
    * for the associated annotation set.
    */
  def delete(request: AnnotationSetId): Request[js.Object] = js.native
  /**
    * Gets an annotation set. Caller must have READ permission for
    * the associated dataset.
    */
  def get(request: AnnotationSetId): Request[AnnotationSet] = js.native
  /**
    * Searches for annotation sets that match the given criteria. Annotation sets
    * are returned in an unspecified order. This order is consistent, such that
    * two queries for the same content (regardless of page size) yield annotation
    * sets in the same order across their respective streams of paginated
    * responses. Caller must have READ permission for the queried datasets.
    */
  def search(request: Accesstoken): Request[SearchAnnotationSetsResponse] = js.native
  /**
    * Updates an annotation set. The update must respect all mutability
    * restrictions and other invariants described on the annotation set resource.
    * Caller must have WRITE permission for the associated dataset.
    */
  def update(request: Bearertoken): Request[AnnotationSet] = js.native
}

object AnnotationsetsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[AnnotationSet],
    delete: AnnotationSetId => Request[js.Object],
    get: AnnotationSetId => Request[AnnotationSet],
    search: Accesstoken => Request[SearchAnnotationSetsResponse],
    update: Bearertoken => Request[AnnotationSet]
  ): AnnotationsetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnnotationsetsResource]
  }
  @scala.inline
  implicit class AnnotationsetsResourceOps[Self <: AnnotationsetsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Accesstoken => Request[AnnotationSet]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: AnnotationSetId => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: AnnotationSetId => Request[AnnotationSet]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSearch(value: Accesstoken => Request[SearchAnnotationSetsResponse]): Self = this.set("search", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Bearertoken => Request[AnnotationSet]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

