package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.AltAnnotationId
import typings.gapiClientBooks.anon.FieldsKey
import typings.gapiClientBooks.anon.LayerIds
import typings.gapiClientBooks.anon.ShowOnlySummaryInResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsResource extends js.Object {
  /** Deletes an annotation. */
  def delete(request: AltAnnotationId): Request[Unit] = js.native
  /** Inserts a new annotation. */
  def insert(request: ShowOnlySummaryInResponse): Request[Annotation] = js.native
  /** Retrieves a list of annotations, possibly filtered. */
  def list(request: LayerIds): Request[Annotations] = js.native
  /** Gets the summary of specified layers. */
  def summary(request: FieldsKey): Request[AnnotationsSummary] = js.native
  /** Updates an existing annotation. */
  def update(request: AltAnnotationId): Request[Annotation] = js.native
}

object AnnotationsResource {
  @scala.inline
  def apply(
    delete: AltAnnotationId => Request[Unit],
    insert: ShowOnlySummaryInResponse => Request[Annotation],
    list: LayerIds => Request[Annotations],
    summary: FieldsKey => Request[AnnotationsSummary],
    update: AltAnnotationId => Request[Annotation]
  ): AnnotationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), summary = js.Any.fromFunction1(summary), update = js.Any.fromFunction1(update))
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
    def setDelete(value: AltAnnotationId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: ShowOnlySummaryInResponse => Request[Annotation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: LayerIds => Request[Annotations]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSummary(value: FieldsKey => Request[AnnotationsSummary]): Self = this.set("summary", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: AltAnnotationId => Request[Annotation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

