package typings.gapiDotClientDotBooks.gapi.client.books

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBooks.Anon_AltAnnotationIdCountry
import typings.gapiDotClientDotBooks.Anon_AltAnnotationIdFields
import typings.gapiDotClientDotBooks.Anon_AltContentVersionFieldsKeyLayerId
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyLayerIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsResource extends js.Object {
  /** Deletes an annotation. */
  def delete(request: Anon_AltAnnotationIdFields): Request[Unit]
  /** Inserts a new annotation. */
  def insert(request: Anon_AltAnnotationIdCountry): Request[Annotation]
  /** Retrieves a list of annotations, possibly filtered. */
  def list(request: Anon_AltContentVersionFieldsKeyLayerId): Request[Annotations]
  /** Gets the summary of specified layers. */
  def summary(request: Anon_AltFieldsKeyLayerIds): Request[AnnotationsSummary]
  /** Updates an existing annotation. */
  def update(request: Anon_AltAnnotationIdFields): Request[Annotation]
}

object AnnotationsResource {
  @scala.inline
  def apply(
    delete: Anon_AltAnnotationIdFields => Request[Unit],
    insert: Anon_AltAnnotationIdCountry => Request[Annotation],
    list: Anon_AltContentVersionFieldsKeyLayerId => Request[Annotations],
    summary: Anon_AltFieldsKeyLayerIds => Request[AnnotationsSummary],
    update: Anon_AltAnnotationIdFields => Request[Annotation]
  ): AnnotationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), summary = js.Any.fromFunction1(summary), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AnnotationsResource]
  }
}

