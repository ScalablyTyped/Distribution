package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.AltAnnotationId
import typings.gapiClientBooks.anon.FieldsKey
import typings.gapiClientBooks.anon.LayerIds
import typings.gapiClientBooks.anon.ShowOnlySummaryInResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsResource extends js.Object {
  /** Deletes an annotation. */
  def delete(request: AltAnnotationId): Request[Unit]
  /** Inserts a new annotation. */
  def insert(request: ShowOnlySummaryInResponse): Request[Annotation]
  /** Retrieves a list of annotations, possibly filtered. */
  def list(request: LayerIds): Request[Annotations]
  /** Gets the summary of specified layers. */
  def summary(request: FieldsKey): Request[AnnotationsSummary]
  /** Updates an existing annotation. */
  def update(request: AltAnnotationId): Request[Annotation]
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
}

