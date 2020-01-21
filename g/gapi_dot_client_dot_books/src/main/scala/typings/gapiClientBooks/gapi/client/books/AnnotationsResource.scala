package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltAnnotationIdCountry
import typings.gapiClientBooks.AnonAltAnnotationIdFields
import typings.gapiClientBooks.AnonAltContentVersionFieldsKeyLayerId
import typings.gapiClientBooks.AnonAltFieldsKeyLayerIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsResource extends js.Object {
  /** Deletes an annotation. */
  def delete(request: AnonAltAnnotationIdFields): Request_[Unit]
  /** Inserts a new annotation. */
  def insert(request: AnonAltAnnotationIdCountry): Request_[Annotation]
  /** Retrieves a list of annotations, possibly filtered. */
  def list(request: AnonAltContentVersionFieldsKeyLayerId): Request_[Annotations]
  /** Gets the summary of specified layers. */
  def summary(request: AnonAltFieldsKeyLayerIds): Request_[AnnotationsSummary]
  /** Updates an existing annotation. */
  def update(request: AnonAltAnnotationIdFields): Request_[Annotation]
}

object AnnotationsResource {
  @scala.inline
  def apply(
    delete: AnonAltAnnotationIdFields => Request_[Unit],
    insert: AnonAltAnnotationIdCountry => Request_[Annotation],
    list: AnonAltContentVersionFieldsKeyLayerId => Request_[Annotations],
    summary: AnonAltFieldsKeyLayerIds => Request_[AnnotationsSummary],
    update: AnonAltAnnotationIdFields => Request_[Annotation]
  ): AnnotationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), summary = js.Any.fromFunction1(summary), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AnnotationsResource]
  }
}

