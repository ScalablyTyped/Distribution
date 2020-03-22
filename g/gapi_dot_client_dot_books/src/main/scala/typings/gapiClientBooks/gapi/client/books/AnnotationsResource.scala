package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltAnnotationId
import typings.gapiClientBooks.AnonFieldsKey
import typings.gapiClientBooks.AnonLayerIds
import typings.gapiClientBooks.AnonShowOnlySummaryInResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsResource extends js.Object {
  /** Deletes an annotation. */
  def delete(request: AnonAltAnnotationId): Request_[Unit]
  /** Inserts a new annotation. */
  def insert(request: AnonShowOnlySummaryInResponse): Request_[Annotation]
  /** Retrieves a list of annotations, possibly filtered. */
  def list(request: AnonLayerIds): Request_[Annotations]
  /** Gets the summary of specified layers. */
  def summary(request: AnonFieldsKey): Request_[AnnotationsSummary]
  /** Updates an existing annotation. */
  def update(request: AnonAltAnnotationId): Request_[Annotation]
}

object AnnotationsResource {
  @scala.inline
  def apply(
    delete: AnonAltAnnotationId => Request_[Unit],
    insert: AnonShowOnlySummaryInResponse => Request_[Annotation],
    list: AnonLayerIds => Request_[Annotations],
    summary: AnonFieldsKey => Request_[AnnotationsSummary],
    update: AnonAltAnnotationId => Request_[Annotation]
  ): AnnotationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), summary = js.Any.fromFunction1(summary), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AnnotationsResource]
  }
}

